package Gestores;

import CustomException.VerificationException;
import POJOS.Empleado;
import POJOS.Poliza;
import POJOS.Provincia;
import POJOS.Localidad;
import POJOS.Marca;
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
import POJOS.AjusteSiniestro;
import POJOS.AjusteDescuento;
import POJOS.AjusteEmision;
import DTOS.ClienteDTO;
import DTOS.DatosPolizaDTO;
import DTOS.HijosDTO;
import DTOS.ListadoDTO;
import DAOS.DAOlocalidad;
import DAOS.DAOProvincia;
import DAOS.DAOmodelo;
import DAOS.DAOmarca;
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
import java.time.LocalDate;
import java.util.List;

import DAOS.DAOajusteEmision;

public class GestorPoliza {
	
	//private Empleado empleado;
	private DAOlocalidad daoLocalidad;
	private DAOProvincia daoProvincia;
	private DAOmodelo daoModelo;
	private DAOmarca daoMarca;
	private DAOanioFabricacion daoAnioFabricacion;
	private DAOtipoDocumento daoTipoDocumento;
	private DAOcliente daoCliente;
	private DAOtipoFormaPago daoTipoFormaPago;
	private DAOtipoEstadoCivil daoTipoEstadoCivil;
	private DAOtipoSexo daoTipoSexo;
	private DAOmedidaSeguridad daoMedidaSeguridad;
	private DAOcobertura daoCobertura;
	private DAOpoliza daoPoliza;
	private DAOcuota daoCuota;
	private DAOajusteHijo daoAjusteHijo;
	private DAOajusteSiniestro daoAjusteSiniestro;
	private DAOajusteKilometro daoAjusteKilometro;
	private DAOajusteEmision daoAjusteEmision;
	private DAOajusteDescuento daoAjusteDescuento;

	
    private static GestorPoliza instancia = null;

    
    private GestorPoliza() {
        //this.empleado = empleado;
    	this.daoLocalidad = new DAOlocalidad();
    	this.daoProvincia = new DAOProvincia();
    	this.daoModelo = new DAOmodelo();
    	this.daoMarca = new DAOmarca();
    	this.daoAnioFabricacion = new DAOanioFabricacion();
    	this.daoTipoDocumento = new DAOtipoDocumento();
    	this.daoCliente = new DAOcliente();
    	this.daoTipoFormaPago = new DAOtipoFormaPago();
    	this.daoTipoEstadoCivil = new DAOtipoEstadoCivil();
    	this.daoTipoSexo = new DAOtipoSexo();
    	this.daoMedidaSeguridad = new DAOmedidaSeguridad();
    	this.daoCobertura = new DAOcobertura();
    	this.daoPoliza = new DAOpoliza();
    	this.daoCuota = new DAOcuota();
    	this.daoAjusteHijo = new DAOajusteHijo();
    	this.daoAjusteSiniestro = new DAOajusteSiniestro();
    	this.daoAjusteKilometro = new DAOajusteKilometro();
    	this.daoAjusteEmision= new DAOajusteEmision();
    	this.daoAjusteDescuento = new DAOajusteDescuento();
    }

    
    public static GestorPoliza getInstance() {
        if (instancia == null) {
            instancia = new GestorPoliza();
        }
        return instancia;
    }
    /*
    public void darAltaPoliza(DatosPolizaDTO datosPolizaDTO) {
    	DAOlocalidad daoLocalidad;
    	validarDatos(datosPolizaDTO);
		
        Poliza poliza = new Poliza();
        Localidad localidad = daoLocalidad.getLocalidad(datosPolizaDTO.getIdLocalidadRiesgo());
		
        poliza.setLocalidad(localidad);
        Modelo modelo = daoModelo.getModelo(datosPolizaDTO.getIdModeloVehiculo());
        poliza.setModelo(modelo);
        AnioFabricacion anio = daoAnioFabricacion.getAnioFabricacion(datosPolizaDTO.getIdAnioVehiculo());
        poliza.setAnioFabricacion(anio);
        poliza.setDatosVehiculo(datosPolizaDTO.getChasis(), datosPolizaDTO.getMotor(), datosPolizaDTO.getPatente(), datosPolizaDTO.getSumaAsegurada());
        Cliente cliente = daoCliente.getCliente(datosPolizaDTO.getNumeroCliente());
        poliza.setCliente(cliente);
        cliente.createPoliza(this);
        
        TipoDocumento tipoDNI = daoTipoDocumento.getTipoDocumento(datosPolizaDTO.getTipoDNI());
        poliza.setDatosCliente(datosPolizaDTO.getNumeroCliente(), datosPolizaDTO.getNombre(), datosPolizaDTO.getApellido(), tipoDNI, poliza.getNumeroDocumento());
        TipoFormaPago tipoFormaPago = daoTipoFormaPago.getTipoFormaPago(datosPolizaDTO.getIdFormaPago());
        poliza.setFormaPago(tipoFormaPago);
        poliza.setDatosPoliza(datosPolizaDTO.getComienzoVigencia(), datosPolizaDTO.getUltimoDiaPago());
        for(HijosDTO e : datosPolizaDTO.getHijos()) {
        	Hijo hijo = new Hijo();
        	TipoEstadoCivil tipoEstadoCivil = daoTipoEstadoCivil.getTipoEstadoCivil(Long.parseLong(e.getEstadoCivil()));
        	hijo.setEstadoCivil(tipoEstadoCivil);
        	TipoSexo tipoSexo = daoTipoSexo.getTipoSexo(Long.parseLong(e.getSexo()));
        	hijo.setTipoSexo(tipoSexo);
        	poliza.setHijo(hijo);
        }
        
        List<MedidaSeguridad> medidasSeguridad = daoMedidaSeguridad.getAll();
        for(MedidaSeguridad e : medidasSeguridad) {
        	if(datosPolizaDTO.getListaMedidaSeguridad().contains(e.getIdMedida())) {
            	poliza.setMedida(e);
            }
        
        }
        
        poliza.setEstadoPoliza("GENERADO");
        Cobertura cobertura = daoCobertura.getCobertura(datosPolizaDTO.getIdCobertura());
        poliza.setCobertura(cobertura);
        
        List<Poliza> polizasAsociadas = cliente.getPolizas();
        if(polizasAsociadas == null) {
        	cliente.setCondicionNomral();
        }
        else {
        	List<Poliza> polizasVigentes = filtrarVigentes(polizasAsociadas);
        	if(polizasVigentes == null) {
        		cliente.setCondicionNomral();
        	}
        }
        
        List<Cuota> cuotasImpagas = cliente.getCuotasImpagas();
        if(cuotasImpagas != null || datosPolizaDTO.getSiniestrosUltimoA() > 0) {
        	cliente.setCondicionNomral();
        }
        else {
        	TipoEstadoCliente tipoEstadoCliente = cliente.getTipoEstadoCliente();
        	if(tipoEstadoCliente.getDescripcion() == "ACTIVO") {
        		cliente.setCondicionNomral();
        	}
        }
        
        Float pago = datosPolizaDTO.getPrima();
        if(tipoFormaPago.getDescripcion() == "SEMESTRAL") {
        	
        	Cuota cuota = new Cuota(poliza, datosPolizaDTO.getComienzoVigencia(), datosPolizaDTO.getUltimoDiaPago(), 1, pago);
        	List<Cuota> cuotas = poliza.getCuotas();
        	cuotas.add(cuota);
        	poliza.setCuotas(cuotas);
        }
        if(tipoFormaPago.getDescripcion() == "MENSUAL") {
        	
        	for(int a=0; a < 6; a++) {
        		Cuota cuota = new Cuota(poliza, datosPolizaDTO.getComienzoVigencia(), datosPolizaDTO.getUltimoDiaPago(), a, pago/6);
        		List<Cuota> cuotas = poliza.getCuotas();
            	cuotas.add(cuota);
            	poliza.setCuotas(cuotas);
        	}
        }
        
        
        AjusteHijo ajusteHijo = daoAjusteHijo.buscarAjusteHijo(datosPolizaDTO.getHijos().size());
        poliza.setAjusteHijo(ajusteHijo);
        
        AjusteKilometro ajusteKilometro = daoAjusteKilometro.buscarAjusteKilometro(datosPolizaDTO.getKilometrosPorAnio());
        poliza.setAjusteKilometro(ajusteKilometro);
        
        AjusteDescuento ajusteUnidadAd = daoAjusteDescuento.buscarAjusteUnidadAd(polizasAsociadas.size());
        poliza.setAjusteDescuento(ajusteUnidadAd);
        
        AjusteEmision ajusteEmision = daoAjusteEmision.getAll().get(0);
        poliza.setAjusteEmision(ajusteEmision);
        
        daoPoliza.createPoliza(poliza);
		
    }
    */
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
    		if(!(dp.getSiniestrosUltimoA() instanceof Long)){
    			throw new VerificationException("SiniestrosUltimoCliente invalido");
    		}
    		/*
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
    		*/
    		if(!(dp.getComienzoVigencia() instanceof LocalDate)){
    			throw new VerificationException("ComienzoVigenciaCliente invalido");
    		}
    		if(!(dp.getUltimoDiaPago() instanceof LocalDate)){
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
    		if(!(h.getFechaNacimiento() instanceof LocalDate)){
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
    
    private List<Poliza> filtrarVigentes(List<Poliza> polizas) {
    	return polizas.stream().filter(a -> a.getEstadoPoliza().equals("VIJENTE")).toList();
    }


	public List<ListadoDTO> getProvincias() {
		List<Provincia> provincias = daoProvincia.getAll();
		List<ListadoDTO> provinciasDTO = new ArrayList<>();
		ListadoDTO provinciaDTO = new ListadoDTO(" ", null);
		provinciasDTO.add(provinciaDTO);
		for(Provincia e : provincias) {
			provinciaDTO = new ListadoDTO(e.getNombreProvincia(), e.getIdProvincia());
			provinciasDTO.add(provinciaDTO);
		}
		return provinciasDTO;
	}
	
	public List<ListadoDTO> getLocalidades(long idProvincia) {
		Provincia provincia = daoProvincia.getProvincia(idProvincia);
		List<Localidad> localidades = provincia.getLocalidades();
		List<ListadoDTO> localidadesDTO = new ArrayList<>();
		ListadoDTO localidadDTO = new ListadoDTO(" ", null);
		localidadesDTO.add(localidadDTO);
		for(Localidad e : localidades) {
			localidadDTO = new ListadoDTO(e.getNombreLocalidad(), e.getIdLocalidad());
			localidadesDTO.add(localidadDTO);
		}
		return localidadesDTO;
	}
	
	public List<ListadoDTO> getMarcas() {
		List<Marca> marcas = daoMarca.getAll();
		List<ListadoDTO> marcasDTO = new ArrayList<>();
		ListadoDTO marcaDTO = new ListadoDTO(" ", null);
		marcasDTO.add(marcaDTO);
		for(Marca e : marcas) {
			marcaDTO = new ListadoDTO(e.getNombreMarca(), e.getIdMarca());
			marcasDTO.add(marcaDTO);
		}
		return marcasDTO;
	}
	
	public List<ListadoDTO> getModelos(long idMarca) {
		Marca marca = daoMarca.getMarca(idMarca);
		List<Modelo> modelos = marca.getModelos();
		List<ListadoDTO> modelosDTO = new ArrayList<>();
		ListadoDTO modeloDTO = new ListadoDTO(" ", null);
		modelosDTO.add(modeloDTO);
		for(Modelo e : modelos) {
			modeloDTO = new ListadoDTO(e.getNombreModelo(), e.getIdModelo());
			modelosDTO.add(modeloDTO);
		}
		return modelosDTO;
	}
	
	public List<ListadoDTO> getAniosFabricacion(long idModeloVehiculo) {
		Modelo modelo = daoModelo.getModelo(idModeloVehiculo);
		List<AnioFabricacion> anios = modelo.getAnioFabricacion().stream().map(a -> a.getAnioFabricacion()).toList();
		List<ListadoDTO> aniosDTO = new ArrayList<>();
		ListadoDTO anioDTO = new ListadoDTO(" ", null);
		aniosDTO.add(anioDTO);
		for(AnioFabricacion e : anios) {
			anioDTO = new ListadoDTO(String.valueOf(e.getAnioFabricacion()), e.getIdAnioFabricacion());
			aniosDTO.add(anioDTO);
		}
		return aniosDTO;
	}
	public List<ListadoDTO> getSiniestros() {
		List<AjusteSiniestro> ajustesSiniestros = daoAjusteSiniestro.getAll();
		List<ListadoDTO> ajusteSiniestrosDTO = new ArrayList<>();
		ListadoDTO ajusteSiniestroDTO = new ListadoDTO(" ", null);
		ajusteSiniestrosDTO.add(ajusteSiniestroDTO);
		for(AjusteSiniestro e : ajustesSiniestros) {
			ajusteSiniestroDTO = new ListadoDTO(String.valueOf(e.getCantidadSiniestros()), e.getIdAjusteSiniestro());
			ajusteSiniestrosDTO.add(ajusteSiniestroDTO);
		}
		return ajusteSiniestrosDTO;
	}
	public List<ListadoDTO> getMedidasSeguridad() {
		List<MedidaSeguridad> medidasSeguridad = daoMedidaSeguridad.getAll();
		List<ListadoDTO> medidasDTO = new ArrayList<>();
		ListadoDTO medidaDTO = new ListadoDTO(" ", null);
		medidasDTO.add(medidaDTO);
		for(MedidaSeguridad e : medidasSeguridad) {
			medidaDTO = new ListadoDTO(e.getTipoMedidaSeguridad()+"", e.getIdMedida());
			medidasDTO.add(medidaDTO);
		}
		return medidasDTO;
	}
	
	public List<ListadoDTO> getSexos(){
		List<TipoSexo> sexos = daoTipoSexo.getAll();
		List<ListadoDTO> sexosDTO = new ArrayList<>();
		ListadoDTO sexoDTO = new ListadoDTO(" ", null);
		sexosDTO.add(sexoDTO);
		for(TipoSexo e : sexos) {
			sexoDTO = new ListadoDTO(String.valueOf(e.getDescripcion()), e.getIdTipoSexo());
			sexosDTO.add(sexoDTO);
		}
		return sexosDTO;
	}
	
	public List<ListadoDTO> getEstadoCiviles(){
		List<TipoEstadoCivil> estadoCiviles = daoTipoEstadoCivil.getAll();
		List<ListadoDTO> estadoCivilesDTO = new ArrayList<>();
		ListadoDTO estadoCivilDTO = new ListadoDTO(" ", null);
		estadoCivilesDTO.add(estadoCivilDTO);
		for(TipoEstadoCivil e : estadoCiviles) {
			estadoCivilDTO = new ListadoDTO(String.valueOf(e.getDescripcion()), e.getIdTipoEstadoCivil());
			estadoCivilesDTO.add(estadoCivilDTO);
		}
		return estadoCivilesDTO;
	}	
	
}

