package Gestores;

import CustomException.VerificationException;
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
import POJOS.AjusteHijo;
import POJOS.AjusteKilometro;
import POJOS.AjusteDescuento;
import POJOS.AjusteEmision;
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
import DAOS.DAOajusteHijo;
import DAOS.DAOajusteSiniestro;
import DAOS.DAOajusteKilometro;
import DAOS.DAOajusteDescuento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DAOS.DAOajusteEmision;

public class GestorPoliza {
	
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
        Localidad localidad;
		try {
			localidad = DAOlocalidad.getLocalidad(datosPolizaDTO.getIdLocalidadRiesgo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        poliza.setLocalidad(localidad);
        Modelo modelo = DAOmodelo.getModelo(datosPolizaDTO.getIdModeloVehiculo());
        poliza.setModelo(modelo);
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
        	GestorPoliza.setCondicionNomralCliente(cliente);
        }
        else {
        	List<Poliza> polizasVigentes = filtrarVigentes(polizasAsociadas);
        	if(polizasVigentes == null) {
        		GestorPoliza.setCondicionNormalCliente(cliente);
        	}
        }
        //ERROR EN EL DIAGRAMA DE SECUENCIAS CON ESTA PARTE
        List<Cuota> cuotasImpagas = DAOcuota.getCuotasImpagas(datosPolizaDTO.getNumeroCliente());
        if(cuotasImpagas != null || datosPolizaDTO.getSiniestrosUltimoA() > 0) {
        	GestorPoliza.setCondicionNormalCliente(cliente);
        }
        else {
        	TipoEstadoCliente tipoEstadoCliente = DAOtipoEstadoCliente.getTipoEstadoCliente(cliente.getIdTipoEstadoCliente());
        	if(tipoEstadoCliente.getDescripcion() == "ACTIVO") {
        		GestorPoliza.setCondicionPlataCliente(cliente);
        	}
        }
        //ERROR EN EMISION DE POLIZA, ESTA ENVIANDO EL MENSAJE AL GESTOR DE CLIENTES
        //ERROR CON LAS CUOTAS, LAS MISMAS DEBEN DE CREARSE CON MONTO-CUOTA, MONTO-MORA Y BONIFICACIONES, ASI COMO TAMBIEN DEBEN DE RECIBIR LOS VALORES DE
        //PREMIOS Y DESCUENTOS DESDE LA INTERFACE YA CALCULADOS COMO EL PROFE LO DIJO, POR LO TANTO EN EL datosPolizaDTO TIENEN QUE VENIR HARDCODEADOS
        Float pago = calcularPago(datosPolizaDTO.getSumaAsegurada(), datosPolizaDTO.getPrima(), datosPoliza.getDescuentos());
        Float mora = calcularMora(pago);
        if(tipoFormaPago.getDescripcion() == "SEMESTRAL") {
        	//CUIDADO, EN LA BASE DE DATOS FALTA LA FECHA DE ULTIMO DIA DE PAGO
        	Cuota cuota = new Cuota(poliza, datosPolizaDTO.getComienzoVigencia(), datosPolizaDTO.getUltimoDiaPago(), 1, pago, mora, datosPolizaDTO.getDescuentos());
        	poliza.setCuota(cuota);
        }
        if(tipoFormaPago.getDescripcion() == "MENSUAL") {
        	//CUIDADO, EN LA BASE DE DATOS FALTA LA FECHA DE ULTIMO DIA DE PAGO
        	for(int a=0; a < 6; a++) {
        		Cuota cuota = new Cuota(poliza, datosPolizaDTO.getComienzoVigencia(), datosPolizaDTO.getUltimoDiaPago(), 1, pago/6, mora, datosPolizaDTO.getDescuentos());
        		poliza.setCuota(cuota);
        	}
        }
        
        AjusteHijo ajusteHijo = DAOajusteHijo.buscarAjusteHijo(datosPolizaDTO.getHijos().size());
        poliza.setAjusteHijo(ajusteHijo);
        AjusteKilometro ajusteKilometro = DAOajusteKilometro.buscarAjusteKilometro(datosPolizaDTO.getKilometrosPorAnio();
        poliza.setAjusteHijo(ajusteKilometro);
        AjusteUnidadAd ajusteUnidadAd = DAOajusteUnidadAd.buscarAjusteUnidadAd(polizasAsociadas.size());
        poliza.setAjusteUnidadAd(ajusteUnidadAd);
        AjusteEmision ajusteEmision = DAOajusteEmision.getAjusteEmision();
        poliza.setAjusteEmision(ajusteEmision;
        DAOpoliza.setPoliza(poliza);
    
    }
    
    private void validarDatos(DatosPolizaDTO dp){
    	try{
    		if(!(dp.getNumeroCliente() instanceof Long)){
    			throw new VerificationException("NumeroCliente invalido");
    		}
    		if(!(dp.getNombre() instanceof String)){
    			throw new VerificationException("NombreCliente invalido");
    		}
    		if(!(dp.getApellido() instanceof String)){
    			throw new VerificationException("ApellidoCliente invalido");
    		}
    		if(!(dp.getTipoDNI() instanceof Long)){
    			throw new VerificationException("TipoDNICliente invalido");
    		}
    		if(!(dp.getDni() instanceof Integer)){
    			throw new VerificationException("DNICliente invalido");
    		}
    		if(!(dp.getIdLocalidadRiesgo() instanceof Long)){
    			throw new VerificationException("LocalidadRiesgo invalido");
    		}
    		if(!(dp.getIdModeloVehiculo() instanceof Long)){
    			throw new VerificationException("ModeloVehiculo invalido");
    		}
    		if(!(dp.getIdAnioVehiculo() instanceof Long)){
    			throw new VerificationException("AnioVehiculoCliente invalido");
    		}
    		if(!(dp.getMotor() instanceof String)){
    			throw new VerificationException("MotorVehiculoCliente invalido");
    		}
    		if(!(dp.getChasis() instanceof String)){
    			throw new VerificationException("ChasisVehiculoCliente invalido");
    		}
    		if(!(dp.getPatente() instanceof String)){
    			throw new VerificationException("PatenteVehiculoCliente invalido");
    		}
    		if(!(dp.getKilometrosPorAnio() instanceof Float)){
    			throw new VerificationException("KilometrosPorAnioCliente invalido");
    		}
    		if(!(dp.getSumaAsegurada() instanceof Float)){
    			throw new VerificationException("SumaAseguradaCliente invalido");
    		}
    		if(!(dp.getSiniestrosUltimoA() instanceof Integer)){
    			throw new VerificationException("SiniestrosUltimoCliente invalido");
    		}
    		if(!(dp.isGuardadoEnGarage() instanceof Boolean)){
    			throw new VerificationException("GuardadoEnGarageCliente invalido");
    		}
    		if(!(dp.isTuercasAntiRobos() instanceof Boolean)){
    			throw new VerificationException("TuercaAntiRoboCliente invalido");
    		}
    		if(!(dp.isAlarma() instanceof Boolean)){
    			throw new VerificationException("AlarmaCliente invalido");
    		}
    		if(!(dp.isDispositivoRastreo() instanceof Boolean)){
    			throw new VerificationException("DispositivoRastreoCliente invalido");
    		}
    		if(!(dp.getComienzoVigencia() instanceof String)){
    			throw new VerificationException("ComienzoVigenciaCliente invalido");
    		}
    		if(!(dp.getUltimoDiaPago() instanceof String)){
    			throw new VerificationException("UltimoDiaPagoCliente invalido");
    		}
    		if(!(dp.getIdFormaPago() instanceof Long)){
    			throw new VerificationException("FormaDePagoCliente invalido");
    		}
    		if(!(dp.getIdCobertura() instanceof Long)){
    			throw new VerificationException("CoberturaCliente invalido");
    		}
    		List <HijosDTO> hijos = dp.getHijos();
    		for(HijosDTO h : hijos){
    			validarHijo(h);
    		}
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    }
    private void validarHijo(HijosDTO h){
    	try{
    		if(!(h.getFechaNacimiento() instanceof Date)){
    			throw new VerificationException("FechaDeNacimientoHijo invalido");
    		}
    		if(!(h.getEstadoCivil() instanceof String)){
    			throw new VerificationException("EstadoCivilHijo invalido");
    		}
    		if(!(h.getSexo() instanceof String)){
    			throw new VerificationException("SexoHijo invalido");
    		}
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    }
    private Double calcularPago(Double sumaAsegurada, Double prima, Double descuentos) {
    	Double pago;
    	return pago;
    }
    private Double calcularMora(Double pago) {
    	Double mora;
    	return mora;
    }
    private List<Poliza> filtrarVigentes(List<Poliza> polizas) {
    	return polizas;
    }
}