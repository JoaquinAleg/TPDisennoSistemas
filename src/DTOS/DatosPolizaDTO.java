package DTOS;

import java.util.List;

public class DatosPolizaDTO {
	private int numeroCliente;
	private String nombre;
	private String apellido;
	private String tipoDNI;
	private int dni;
	private long idLocalidadRiesgo;
	private long idModeloVehiculo;
	private long idAnioVehiculo;
	private String motor;
	private String chasis;
	private String patente;
	private float kilometrosPorAnio;
	private float sumaAsegurada;
	private int siniestrosUltimoA;
	private boolean guardadoEnGarage;
	private boolean tuercasAntiRobos;
	private boolean dispositivoRastreo;
	private List<HijosDTO> hijos;
	private String comienzoVigencia;
	private String ultimoDiaPago;
	private long idFormaPago;
	private long idCobertura;
	public DatosPolizaDTO(int numeroCliente, String nombre, String apellido, String tipoDNI, int dni,
			long idLocalidadRiesgo, long idModeloVehiculo, long idAnioVehiculo, String motor, String chasis,
			String patente, float kilometrosPorAnio, float sumaAsegurada, int siniestrosUltimoA,
			boolean guardadoEnGarage, boolean tuercasAntiRobos, boolean dispositivoRastreo, List<HijosDTO> hijos,
			String comienzoVigencia, String ultimoDiaPago, long idFormaPago, long idCobertura) {
		super();
		this.numeroCliente = numeroCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDNI = tipoDNI;
		this.dni = dni;
		this.idLocalidadRiesgo = idLocalidadRiesgo;
		this.idModeloVehiculo = idModeloVehiculo;
		this.idAnioVehiculo = idAnioVehiculo;
		this.motor = motor;
		this.chasis = chasis;
		this.patente = patente;
		this.kilometrosPorAnio = kilometrosPorAnio;
		this.sumaAsegurada = sumaAsegurada;
		this.siniestrosUltimoA = siniestrosUltimoA;
		this.guardadoEnGarage = guardadoEnGarage;
		this.tuercasAntiRobos = tuercasAntiRobos;
		this.dispositivoRastreo = dispositivoRastreo;
		this.hijos = hijos;
		this.comienzoVigencia = comienzoVigencia;
		this.ultimoDiaPago = ultimoDiaPago;
		this.idFormaPago = idFormaPago;
		this.idCobertura = idCobertura;
	}
	public int getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTipoDNI() {
		return tipoDNI;
	}
	public void setTipoDNI(String tipoDNI) {
		this.tipoDNI = tipoDNI;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public long getIdLocalidadRiesgo() {
		return idLocalidadRiesgo;
	}
	public void setIdLocalidadRiesgo(long idLocalidadRiesgo) {
		this.idLocalidadRiesgo = idLocalidadRiesgo;
	}
	public long getIdModeloVehiculo() {
		return idModeloVehiculo;
	}
	public void setIdModeloVehiculo(long idModeloVehiculo) {
		this.idModeloVehiculo = idModeloVehiculo;
	}
	public long getIdAnioVehiculo() {
		return idAnioVehiculo;
	}
	public void setIdAnioVehiculo(long idAnioVehiculo) {
		this.idAnioVehiculo = idAnioVehiculo;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public float getKilometrosPorAnio() {
		return kilometrosPorAnio;
	}
	public void setKilometrosPorAnio(float kilometrosPorAnio) {
		this.kilometrosPorAnio = kilometrosPorAnio;
	}
	public float getSumaAsegurada() {
		return sumaAsegurada;
	}
	public void setSumaAsegurada(float sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	public int getSiniestrosUltimoA() {
		return siniestrosUltimoA;
	}
	public void setSiniestrosUltimoA(int siniestrosUltimoA) {
		this.siniestrosUltimoA = siniestrosUltimoA;
	}
	public boolean isGuardadoEnGarage() {
		return guardadoEnGarage;
	}
	public void setGuardadoEnGarage(boolean guardadoEnGarage) {
		this.guardadoEnGarage = guardadoEnGarage;
	}
	public boolean isTuercasAntiRobos() {
		return tuercasAntiRobos;
	}
	public void setTuercasAntiRobos(boolean tuercasAntiRobos) {
		this.tuercasAntiRobos = tuercasAntiRobos;
	}
	public boolean isDispositivoRastreo() {
		return dispositivoRastreo;
	}
	public void setDispositivoRastreo(boolean dispositivoRastreo) {
		this.dispositivoRastreo = dispositivoRastreo;
	}
	public List<HijosDTO> getHijos() {
		return hijos;
	}
	public void setHijos(List<HijosDTO> hijos) {
		this.hijos = hijos;
	}
	public String getComienzoVigencia() {
		return comienzoVigencia;
	}
	public void setComienzoVigencia(String comienzoVigencia) {
		this.comienzoVigencia = comienzoVigencia;
	}
	public String getUltimoDiaPago() {
		return ultimoDiaPago;
	}
	public void setUltimoDiaPago(String ultimoDiaPago) {
		this.ultimoDiaPago = ultimoDiaPago;
	}
	public long getIdFormaPago() {
		return idFormaPago;
	}
	public void setIdFormaPago(long idFormaPago) {
		this.idFormaPago = idFormaPago;
	}
	public long getIdCobertura() {
		return idCobertura;
	}
	public void setIdCobertura(long idCobertura) {
		this.idCobertura = idCobertura;
	}
	
	
	
	
	
}
