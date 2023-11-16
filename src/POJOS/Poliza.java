package POJOS;
import java.util.Date;

import jakarta.persistence.*;
@Entity

@Table(name = "Poliza", schema = "public")
public class Poliza {
@Id
@Column
private long numeroPoliza;
@Column
private long idModelo;
@Column
private long idAjusteHijo;
@Column
private long idAjusteKilometro;
@Column
private long idAjusteSiniestro;
@Column
private long idAnioFabricacion;
@Column
private long idAjusteDescuento;
@Column
private long idAjusteEmision;
@Column
private long idModificacion;
@Column
private float sumaAsegurada;
@Column
private int kilometrosRealizadosAnio;
@Column
private int cantSiniestrosUA;
@Column
private Date fechaDeInicio;
@Column
private Date fechaDeFin;
@Column
private float premio;
@Column
private float prima;
@Column
private float descuentos;
@Column
private Date ultimoDiaPago;
@Column
private float montoTotalAbonar;
@Column
private String chasis;
@Column
private String patente;
@Column
private String estadoPoliza;
@Column
private String motor;
@Column
private String nombreCliente;
@Column
private String dniCliente;
@Column
private Date fechaCreacion;
@Column
private long idFormaPago;
@Column
private long idCobertura;
@Column
private long idMedida;

public Poliza(){}

public Poliza(long numeroPoliza, long idModelo, long idAjusteHijo, long idAjusteKilometro, long idAjusteSiniestro,
		long idAnioFabricacion, long idAjusteDescuento, long idAjusteEmision, long idModificacion, float sumaAsegurada,
		int kilometrosRealizadosAnio, int cantSiniestrosUA, Date fechaDeInicio, Date fechaDeFin, float premio,
		float prima, float descuentos, Date ultimoDiaPago, float montoTotalAbonar, String chasis, String patente,
		String estadoPoliza, String motor, String nombreCliente, String dniCliente, Date fechaCreacion, long idFormaPago,
		long idCobertura, long idMedida) {
	super();
	this.numeroPoliza = numeroPoliza;
	this.idModelo = idModelo;
	this.idAjusteHijo = idAjusteHijo;
	this.idAjusteKilometro = idAjusteKilometro;
	this.idAjusteSiniestro = idAjusteSiniestro;
	this.idAnioFabricacion = idAnioFabricacion;
	this.idAjusteDescuento = idAjusteDescuento;
	this.idAjusteEmision = idAjusteEmision;
	this.idModificacion = idModificacion;
	this.sumaAsegurada = sumaAsegurada;
	this.kilometrosRealizadosAnio = kilometrosRealizadosAnio;
	this.cantSiniestrosUA = cantSiniestrosUA;
	this.fechaDeInicio = fechaDeInicio;
	this.fechaDeFin = fechaDeFin;
	this.premio = premio;
	this.prima = prima;
	this.descuentos = descuentos;
	this.ultimoDiaPago = ultimoDiaPago;
	this.montoTotalAbonar = montoTotalAbonar;
	this.chasis = chasis;
	this.patente = patente;
	this.estadoPoliza = estadoPoliza;
	this.motor = motor;
	this.nombreCliente = nombreCliente;
	this.dniCliente = dniCliente;
	this.fechaCreacion = fechaCreacion;
	this.idFormaPago = idFormaPago;
	this.idCobertura = idCobertura;
	this.idMedida = idMedida;
}

public long getNumeroPoliza() {
	return numeroPoliza;
}

public void setNumeroPoliza(long numeroPoliza) {
	this.numeroPoliza = numeroPoliza;
}

public long getIdModelo() {
	return idModelo;
}

public void setIdModelo(long idModelo) {
	this.idModelo = idModelo;
}

public long getIdAjusteHijo() {
	return idAjusteHijo;
}

public void setIdAjusteHijo(long idAjusteHijo) {
	this.idAjusteHijo = idAjusteHijo;
}

public long getIdAjusteKilometro() {
	return idAjusteKilometro;
}

public void setIdAjusteKilometro(long idAjusteKilometro) {
	this.idAjusteKilometro = idAjusteKilometro;
}

public long getIdAjusteSiniestro() {
	return idAjusteSiniestro;
}

public void setIdAjusteSiniestro(long idAjusteSiniestro) {
	this.idAjusteSiniestro = idAjusteSiniestro;
}

public long getIdAnioFabricacion() {
	return idAnioFabricacion;
}

public void setIdAnioFabricacion(long idAnioFabricacion) {
	this.idAnioFabricacion = idAnioFabricacion;
}

public long getIdAjusteDescuento() {
	return idAjusteDescuento;
}

public void setIdAjusteDescuento(long idAjusteDescuento) {
	this.idAjusteDescuento = idAjusteDescuento;
}

public long getIdAjusteEmision() {
	return idAjusteEmision;
}

public void setIdAjusteEmision(long idAjusteEmision) {
	this.idAjusteEmision = idAjusteEmision;
}

public long getIdModificacion() {
	return idModificacion;
}

public void setIdModificacion(long idModificacion) {
	this.idModificacion = idModificacion;
}

public float getSumaAsegurada() {
	return sumaAsegurada;
}

public void setSumaAsegurada(float sumaAsegurada) {
	this.sumaAsegurada = sumaAsegurada;
}

public int getKilometrosRealizadosAnio() {
	return kilometrosRealizadosAnio;
}

public void setKilometrosRealizadosAnio(int kilometrosRealizadosAnio) {
	this.kilometrosRealizadosAnio = kilometrosRealizadosAnio;
}

public int getCantSiniestrosUA() {
	return cantSiniestrosUA;
}

public void setCantSiniestrosUA(int cantSiniestrosUA) {
	this.cantSiniestrosUA = cantSiniestrosUA;
}

public Date getFechaDeInicio() {
	return fechaDeInicio;
}

public void setFechaDeInicio(Date fechaDeInicio) {
	this.fechaDeInicio = fechaDeInicio;
}

public Date getFechaDeFin() {
	return fechaDeFin;
}

public void setFechaDeFin(Date fechaDeFin) {
	this.fechaDeFin = fechaDeFin;
}

public float getPremio() {
	return premio;
}

public void setPremio(float premio) {
	this.premio = premio;
}

public float getPrima() {
	return prima;
}

public void setPrima(float prima) {
	this.prima = prima;
}

public float getDescuentos() {
	return descuentos;
}

public void setDescuentos(float descuentos) {
	this.descuentos = descuentos;
}

public Date getUltimoDiaPago() {
	return ultimoDiaPago;
}

public void setUltimoDiaPago(Date ultimoDiaPago) {
	this.ultimoDiaPago = ultimoDiaPago;
}

public float getMontoTotalAbonar() {
	return montoTotalAbonar;
}

public void setMontoTotalAbonar(float montoTotalAbonar) {
	this.montoTotalAbonar = montoTotalAbonar;
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

public String getEstadoPoliza() {
	return estadoPoliza;
}

public void setEstadoPoliza(String estadoPoliza) {
	this.estadoPoliza = estadoPoliza;
}

public String getMotor() {
	return motor;
}

public void setMotor(String motor) {
	this.motor = motor;
}

public String getNombreCliente() {
	return nombreCliente;
}

public void setNombreCliente(String nombreCliente) {
	this.nombreCliente = nombreCliente;
}

public String getDniCliente() {
	return dniCliente;
}

public void setDniCliente(String dniCliente) {
	this.dniCliente = dniCliente;
}

public Date getFechaCreacion() {
	return fechaCreacion;
}

public void setFechaCreacion(Date fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
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

public long getIdMedida() {
	return idMedida;
}

public void setIdMedida(long idMedida) {
	this.idMedida = idMedida;
}

}
