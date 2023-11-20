package DTOS;

import java.util.Date;
import java.util.List;

public class DatosPolizaDTO {
	private Long numeroCliente;
	private String nombre;
	private String apellido;
	private Long tipoDNI;
	private Integer dni;
	private Long idLocalidadRiesgo;
	private Long idModeloVehiculo;
	private Long idAnioVehiculo;
	private String motor;
	private String chasis;
	private String patente;
	private Float kilometrosPorAnio;
	private Float sumaAsegurada;
	private Integer siniestrosUltimoA;
	private Boolean guardadoEnGarage;
	private Boolean tuercasAntiRobos;
	private Boolean alarma;
	private Boolean dispositivoRastreo;
	private List<HijosDTO> hijos;
	private Date comienzoVigencia;
	private Date ultimoDiaPago;
	private Long idFormaPago;
	private Float prima, descuento, premio;
	private Long idCobertura;
	
	public DatosPolizaDTO() {
		
	};
	
	public DatosPolizaDTO(Long numeroCliente, String nombre, String apellido, Long tipoDNI, Integer dni,
			Long idLocalidadRiesgo, Long idModeloVehiculo, Long idAnioVehiculo, String motor, String chasis,
			String patente, Float kilometrosPorAnio, Float sumaAsegurada, Integer siniestrosUltimoA,
			Boolean guardadoEnGarage, Boolean tuercasAntiRobos, Boolean alarma, Boolean dispositivoRastreo, List<HijosDTO> hijos,
			Date comienzoVigencia, Date ultimoDiaPago, Long idFormaPago, Float prima, Float descuento
			, Float premio, Long idCobertura) {
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
		this.alarma = alarma;
		this.dispositivoRastreo = dispositivoRastreo;
		this.hijos = hijos;
		this.comienzoVigencia = comienzoVigencia;
		this.ultimoDiaPago = ultimoDiaPago;
		this.idFormaPago = idFormaPago;
		this.premio=premio;
		this.descuento=descuento;
		this.prima=prima;
		this.idCobertura = idCobertura;
	}
	public Float getPrima() {
		return prima;
	}
	public void setPrima(Float prima) {
		this.prima = prima;
	}
	public Float getDescuento() {
		return descuento;
	}
	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}
	public Float getPremio() {
		return premio;
	}
	public void setPremio(Float premio) {
		this.premio = premio;
	}
	public Boolean isAlarma() {
		return alarma;
	}
	public void setAlarma(Boolean alarma) {
		this.alarma = alarma;
	}
	public Long getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(Long numeroCliente) {
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
	public Long getTipoDNI() {
		return tipoDNI;
	}
	public void setTipoDNI(Long tipoDNI) {
		this.tipoDNI = tipoDNI;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Long getIdLocalidadRiesgo() {
		return idLocalidadRiesgo;
	}
	public void setIdLocalidadRiesgo(Long idLocalidadRiesgo) {
		this.idLocalidadRiesgo = idLocalidadRiesgo;
	}
	public Long getIdModeloVehiculo() {
		return idModeloVehiculo;
	}
	public void setIdModeloVehiculo(Long idModeloVehiculo) {
		this.idModeloVehiculo = idModeloVehiculo;
	}
	public Long getIdAnioVehiculo() {
		return idAnioVehiculo;
	}
	public void setIdAnioVehiculo(Long idAnioVehiculo) {
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
	public Float getKilometrosPorAnio() {
		return kilometrosPorAnio;
	}
	public void setKilometrosPorAnio(Float kilometrosPorAnio) {
		this.kilometrosPorAnio = kilometrosPorAnio;
	}
	public Float getSumaAsegurada() {
		return sumaAsegurada;
	}
	public void setSumaAsegurada(Float sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	public Integer getSiniestrosUltimoA() {
		return siniestrosUltimoA;
	}
	public void setSiniestrosUltimoA(Integer siniestrosUltimoA) {
		this.siniestrosUltimoA = siniestrosUltimoA;
	}
	public Boolean isGuardadoEnGarage() {
		return guardadoEnGarage;
	}
	public void setGuardadoEnGarage(Boolean guardadoEnGarage) {
		this.guardadoEnGarage = guardadoEnGarage;
	}
	public Boolean isTuercasAntiRobos() {
		return tuercasAntiRobos;
	}
	public void setTuercasAntiRobos(Boolean tuercasAntiRobos) {
		this.tuercasAntiRobos = tuercasAntiRobos;
	}
	public Boolean isDispositivoRastreo() {
		return dispositivoRastreo;
	}
	public void setDispositivoRastreo(Boolean dispositivoRastreo) {
		this.dispositivoRastreo = dispositivoRastreo;
	}
	public List<HijosDTO> getHijos() {
		return hijos;
	}
	public void setHijos(List<HijosDTO> hijos) {
		this.hijos = hijos;
	}
	public Date getComienzoVigencia() {
		return comienzoVigencia;
	}
	public void setComienzoVigencia(Date comienzoVigencia) {
		this.comienzoVigencia = comienzoVigencia;
	}
	public Date getUltimoDiaPago() {
		return ultimoDiaPago;
	}
	public void setUltimoDiaPago(Date ultimoDiaPago) {
		this.ultimoDiaPago = ultimoDiaPago;
	}
	public Long getIdFormaPago() {
		return idFormaPago;
	}
	public void setIdFormaPago(Long idFormaPago) {
		this.idFormaPago = idFormaPago;
	}
	public Long getIdCobertura() {
		return idCobertura;
	}
	public void setIdCobertura(Long idCobertura) {
		this.idCobertura = idCobertura;
	}
	public String getListaMedidaSeguridad() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
