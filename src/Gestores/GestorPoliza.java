package Gestores;

import POJOS.Empleado;
import POJOS.Poliza;
import POJOS.Localidad;
import POJOS.Modelo;
import POJOS.AnioFabricacion;
import POJOS.TipoDocumento;
import POJOS.Cliente;
import POJOS.Hijo;
import POJOS.TipoFormaPago;
import POJOS.TipoEstadoCivil;
import POJOS.TipoSexo;
import POJOS.MedidaSeguridad;
import POJOS.Cobertura;
import POJOS.Cuota;
import POJOS.TipoEstadoCliente;
import DTOS.DatosPolizaDTO;
import DTOS.HijosDTO;
import DAOS.DAOlocalidad;
import DAOS.DAOmodelo;
import DAOS.DAOanioFabricacion;
import DAOS.DAOtipoDocumento;
import DAOS.DAOcliente;
import DAOS.DAOtipoFormaPago;
import DAOS.DAOtipoEstadoCivil;
import DAOS.DAOtipoSexo;
import DAOS.DAOmedidaSeguridad;
import DAOS.DAOcobertura;
import DAOS.DAOpoliza;
import DAOS.DAOcuota;
import DAOS.DAOajustePorHijo;
import DAOS.DAOajustePorSiniestro;
import DAOS.DAOajustePorKilometro;
import DAOS.DAOajustePorUnidadAd;

import java.util.ArrayList;
import java.util.List;

import DAOS.DAOajustePorEmision;

public class GestorPoliza 
	
	static Empleado empleado;
	// Instancia única del gestor
    private static GestorPoliza instancia = null;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private GestorPoliza(Empleado empleado) {
        GestorPoliza.empleado=empleado;
    }

    // Método para obtener la instancia única del gestor
    public static GestorPoliza obtenerInstancia(Empleado empleado) {
        if (instancia == null) {
            instancia = new GestorPoliza(empleado);
        }
        return instancia;
    }

    public void darAltaPoliza(DatosPolizaDTO datosPolizaDTO) {
        validarDatos(datosPolizaDTO);
        Poliza poliza = new Poliza();
        Localidad localidad = DAOlocalidad.getLocalidad(datosPolizaDTO.getIdLocalidadRiesgo());
        poliza.setLocalidad(localidad);
        Modelo modelo = DAOmodelo.getModelo(datosPolizaDTO.getIdModeloVehiculo());
        poliza.setIdModelo(modelo);
        AnioFabricacion anio = DAOanioFabricacion.getAnioFabricacion(datosPolizaDTO.getIdAnioVehiculo());
        poliza.setAnioFabricacion(anio);
        poliza.setDatosVehiculo(datosPolizaDTO.getChasis(), datosPolizaDTO.getMotor(), datosPolizaDTO.getPatente(), datosPolizaDTO.getSumaAsegurada());
        Cliente cliente = DAOcliente.getCliente(datosPolizaDTO.getNumeroCliente());
        poliza.setCliente(cliente);
        //PROBLEMA CON DNI EN EL DIAGRAMA, NO SE ASOCIA EL TIPO DE DNI DEL CLIENTE CON LA POLIZA, SOLAMNETE EL NUMERO
        TipoDocumento tipoDNI = DAOtipoDocumento.getTipoDocumento(datosPolizaDTO.getTipoDNI());
        poliza.setDatosCliente(datosPolizaDTO.getNumeroCliente(), datosPolizaDTO.getNombre(), datosPolizaDTO.getApellido(), datosPolizaDTO.getIdTipoDocumento(), poliza.getNumeroDocumento());
        TipoFormaPago tipoFormaPago = DAOtipoFormaPago.getTipoFormaPago(datosPolizaDTO.getIdFormaPago());
        poliza.setTipoFormaPago(tipoFormaPago);
        poliza.setDatosPoliza(datosPolizaDTO.getComienzoVigencia(), datosPolizaDTO.getUltimoDiaPago());
        for(HijosDTO e : datosPolizaDTO.getHijos()) {
        	Hijo hijo = new Hijo();
        	TipoEstadoCivil tipoEstadoCivil = DAOestadoCivil.getEstadoCivil(e.getEstadoCivil());
        	hijo.setEstadoCivil(tipoEstadoCivil);
        	TipoSexo tipoSexo = DAOtipoSexo.getTipoSexo(e.getSexo());
        	hijo.setTipoSexo(tipoSexo);
        	poliza.setHijo(hijo);
        }
        //PROBLEMA EN DIAGRAMA DE SECUENCIA, mando como parametro un true al DAO XD
        if(datosPolizaDTO.getGuardadoEnGaraje == true) {
        	poliza.setMedidaSeguridad(DAOmedidaSeguridad.getMedidaSeguridad("GuardadoEnGarage"));
        }
        if(datosPolizaDTO.getTuercasAntiRobos == true) {
        	poliza.setMedidaSeguridad(DAOmedidaSeguridad.getMedidaSeguridad("TuercasAntiRobos"));
        }
        if(datosPolizaDTO.getAlarma == true) {
        	poliza.setMedidaSeguridad(DAOmedidaSeguridad.getMedidaSeguridad("Alarma"));
        }
        if(datosPolizaDTO.getDispositivoRastreo == true) {
        	poliza.setMedidaSeguridad(DAOmedidaSeguridad.getMedidaSeguridad("DispositivoRastreo"));
        }
        
        poliza.setEstadoGenerado();
        Cobertura cobertura = DAOcobertura.getCobertura(datosPolizaDTO.getIdCobertura());
        poliza.setCobertura(cobertura);
        
        List<Poliza> polizasAsociadas = DAOpolizas.getPolizasAsociadas(datosPolizaDTO.getNumeroCliente());
        //ERROR EN DIAGRAMA DE CLASES, FALTA LA CONDICION DEL CLIENTE
        //ERROR EN EL DIAGRAMA DE SECUENCIA, SE SETEA LAS CONDICIONES AL GESTOR DE CLIENTE Y DENTRO DE LA POLIZA
        if(polizasAsociadas == null) {
        	poliza.setCondicionNomralCliente(cliente);
        }
        else {
        	List<Poliza> polizasVigentes = filtrarVigentes(polizasAsociadas);
        	if(polizasVigentes == null) {
        		poliza.setCondicionNormalCliente(cliente);
        	}
        }
        //ERROR EN EL DIAGRAMA DE SECUENCIAS CON ESTA PARTE
        List<Cuota> cuotasImpagas = DAOcuota.getCuotasImpagas(datosPolizaDTO.getNumeroCliente());
        if(cuotasImpagas != null || datosPolizaDTO.getSiniestrosUltimoA() > 0) {
        	poliza.setCondicionNormalCliente(cliente);
        }
        else {
        	TipoEstadoCliente tipoEstadoCliente = DAOtipoEstadoCliente.getTipoEstadoCliente(cliente.getIdTipoEstadoCliente());
        	if(tipoEstadoCliente.getDescripcion() == "ACTIVO") {
        		poliza.setCondicionPlataCliente(cliente);
        	}
        }
        //ERROR EN EMISION DE POLIZA, ESTA ENVIANDO EL MENSAJE AL GESTOR DE CLIENTES
        //ERROR CON LAS CUOTAS, LAS MISMAS DEBEN DE CREARSE CON MONTO-CUOTA, MONTO-MORA Y BONIFICACIONES, ASI COMO TAMBIEN DEBEN DE RECIBIR LOS VALORES DE
        //PREMIOS Y DESCUENTOS DESDE LA INTERFACE YA CALCULADOS COMO EL PROFE LO DIJO, POR LO TANTO EN EL datosPolizaDTO TIENEN QUE VENIR HARCODEADOS
        if(tipoFormaPago.getDescripcion() == "SEMESTRAL") {
        	Cuota cuota = new Cuota(datosPolizaDTO.getComienzoVigencia(), datosPolizaDTO.getUltimoDiaPago());
        	
        }
        
    }
    
    private void validarDatos(DatosPolizaDTO datosPolizaDTO) {
    	
    }
    private List<Poliza> filtrarVigentes(List<Poliza> polizas) {
    	return polizas;
    }
}