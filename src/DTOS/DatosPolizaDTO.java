package DTOS;

import java.time.LocalDate;
import java.util.List;

import Gestores.GestorPoliza;

public class DatosPolizaDTO {
	private Long idCliente;
	private String numeroCliente;
	private String nombre;
	private String apellido;
	private Long tipoDNI;
	private String dni;
	private Long idLocalidadRiesgo;
	private Long idModeloVehiculo;
	private Long idAnioVehiculo;
	private String motor;
	private String chasis;
	private String patente;
	private Integer kilometrosPorAnio;
	private Float sumaAsegurada;
	private Long idSiniestrosUltimoA;
	private List<Long> listaMedidaSeguridad;
	private List<HijosDTO> hijos;
	private LocalDate comienzoVigencia;
	private LocalDate finVigencia;
	private LocalDate ultimoDiaPago;
	private Long idFormaPago;
	private Float prima, descuento, premio;
	private Long idCobertura;
	
    private static DatosPolizaDTO instancia = null;
	
	public DatosPolizaDTO() {
		
	};
	
	
    public static DatosPolizaDTO getInstance() {
        if (instancia == null) {
            instancia = new DatosPolizaDTO();
        }
        return instancia;
    }
    
    
	public DatosPolizaDTO(Long idCliente, String numeroCliente, String nombre, String apellido, Long tipoDNI, String dni,
			Long idLocalidadRiesgo, Long idModeloVehiculo, Long idAnioVehiculo, String motor, String chasis,
			String patente, Integer kilometrosPorAnio, Float sumaAsegurada, Long siniestrosUltimoA,
			List<Long> listaMedidaSeguridad, List<HijosDTO> hijos, LocalDate comienzoVigencia, LocalDate finVigencia,
			LocalDate ultimoDiaPago, Long idFormaPago, Float prima, Float descuento, Float premio, Long idCobertura) {
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
		this.idSiniestrosUltimoA = siniestrosUltimoA;
		this.listaMedidaSeguridad = listaMedidaSeguridad;
		this.hijos = hijos;
		this.comienzoVigencia = comienzoVigencia;
		this.finVigencia = finVigencia;
		this.ultimoDiaPago = ultimoDiaPago;
		this.idFormaPago = idFormaPago;
		this.prima = prima;
		this.descuento = descuento;
		this.premio = premio;
		this.idCobertura = idCobertura;
	}

	
	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public LocalDate getFinVigencia() {
		return finVigencia;
	}

	public void setFinVigencia(LocalDate finVigencia) {
		this.finVigencia = finVigencia;
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
	public String getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(String numeroCliente) {
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
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
	public Integer getKilometrosPorAnio() {
		return kilometrosPorAnio;
	}
	public void setKilometrosPorAnio(Integer kilometrosPorAnio) {
		this.kilometrosPorAnio = kilometrosPorAnio;
	}
	public Float getSumaAsegurada() {
		return sumaAsegurada;
	}
	public void setSumaAsegurada(Float sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	public Long getSiniestrosUltimoA() {
		return idSiniestrosUltimoA;
	}
	public void setSiniestrosUltimoA(Long siniestrosUltimoA) {
		this.idSiniestrosUltimoA = siniestrosUltimoA;
	}
	public List<Long> getListaMedidaSeguridad() {
		return this.listaMedidaSeguridad;
	}
	public void setListaMedidaSeguridad(List<Long> listaMedidaSeguridad) {
		this.listaMedidaSeguridad = listaMedidaSeguridad;
	}
	public List<HijosDTO> getHijos() {
		return hijos;
	}
	public void setHijos(List<HijosDTO> hijos) {
		this.hijos = hijos;
	}
	public LocalDate getComienzoVigencia() {
		return comienzoVigencia;
	}
	public void setComienzoVigencia(LocalDate comienzoVigencia) {
		this.comienzoVigencia = comienzoVigencia;
		this.finVigencia = comienzoVigencia.plusMonths(6);
	}
	public LocalDate getUltimoDiaPago() {
		return ultimoDiaPago;
	}
	public void setUltimoDiaPago(LocalDate ultimoDiaPago) {
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
	
}
