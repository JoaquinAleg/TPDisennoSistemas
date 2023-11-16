package POJOS;
import java.util.Date;

import jakarta.persistence.*;
@Entity

@Table(name = "Poliza", schema = "public")
public class Poliza {
@Id
@Column
private long numeroPoliza;
@OneToOne
@JoinColumn(name = "idModelo", nullable = false, referencedColumnName = "idModelo", 
foreignKey=@ForeignKey(name = "fk_ModeloPoliza", value = ConstraintMode.CONSTRAINT))
private Modelo Modelo;
@OneToOne
@JoinColumn(name = "idAjusteHijo", nullable = false, referencedColumnName = "idAjusteHijo", 
foreignKey=@ForeignKey(name = "fk_AjusteHijo", value = ConstraintMode.CONSTRAINT))
private AjusteHijo AjusteHijo;
@OneToOne
@JoinColumn(name = "idAjusteKilometro", nullable = false, referencedColumnName = "idAjusteKilometro", 
foreignKey=@ForeignKey(name = "fk_AjusteKilometro", value = ConstraintMode.CONSTRAINT))
private AjusteKilometro AjusteKilometro;
@OneToOne
@JoinColumn(name = "idAjusteSiniestro", nullable = false, referencedColumnName = "idAjusteSiniestro", 
foreignKey=@ForeignKey(name = "fk_AjusteSiniestro", value = ConstraintMode.CONSTRAINT))
private AjusteSiniestro idAjusteSiniestro;
@OneToOne
@JoinColumn(name = "idAnioFabricacion", nullable = false, referencedColumnName = "idAnioFabricacion", 
foreignKey=@ForeignKey(name = "fk_AnioFabricacion", value = ConstraintMode.CONSTRAINT))
private fabricado AnioFabricacion;
@OneToOne
@JoinColumn(name = "idAjusteDescuento", nullable = false, referencedColumnName = "idAjusteDescuento", 
foreignKey=@ForeignKey(name = "fk_AjusteDescuento", value = ConstraintMode.CONSTRAINT))
private AjusteDescuento AjusteDescuento;
@OneToOne
@JoinColumn(name = "idAjusteEmision", nullable = false, referencedColumnName = "idAjusteEmision", 
foreignKey=@ForeignKey(name = "fk_AjusteEmision", value = ConstraintMode.CONSTRAINT))
private AjusteEmision AjusteEmision;
@OneToOne
@JoinColumn(name = "idModificacion", nullable = false, referencedColumnName = "idModificacion", 
foreignKey=@ForeignKey(name = "fk_Modificacion", value = ConstraintMode.CONSTRAINT))
private Modificacion Modificacion;
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
@OneToOne
@JoinColumn(name = "idFormaPago", nullable = false, referencedColumnName = "idFormaPago", 
foreignKey=@ForeignKey(name = "fk_TipoFormaPago", value = ConstraintMode.CONSTRAINT))
private TipoFormaPago FormaPago;
@OneToOne
@JoinColumn(name = "idCobertura", nullable = false, referencedColumnName = "idCobertura", 
foreignKey=@ForeignKey(name = "fk_CoberturaPoliza", value = ConstraintMode.CONSTRAINT))
private Cobertura Cobertura;
@OneToOne
@JoinColumn(name = "idMedida", nullable = false, referencedColumnName = "idMedida", 
foreignKey=@ForeignKey(name = "fk_MedidaSeguridad", value = ConstraintMode.CONSTRAINT))
private MedidaSeguridad Medida;

public Poliza(){}

public Poliza(long numeroPoliza, POJOS.Modelo modelo, POJOS.AjusteHijo ajusteHijo,
		POJOS.AjusteKilometro ajusteKilometro, AjusteSiniestro idAjusteSiniestro, fabricado anioFabricacion,
		POJOS.AjusteDescuento ajusteDescuento, POJOS.AjusteEmision ajusteEmision, POJOS.Modificacion modificacion,
		float sumaAsegurada, int kilometrosRealizadosAnio, int cantSiniestrosUA, Date fechaDeInicio, Date fechaDeFin,
		float premio, float prima, float descuentos, Date ultimoDiaPago, float montoTotalAbonar, String chasis,
		String patente, String estadoPoliza, String motor, String nombreCliente, String dniCliente, Date fechaCreacion,
		TipoFormaPago formaPago, POJOS.Cobertura cobertura, MedidaSeguridad medida) {
	super();
	this.numeroPoliza = numeroPoliza;
	Modelo = modelo;
	AjusteHijo = ajusteHijo;
	AjusteKilometro = ajusteKilometro;
	this.idAjusteSiniestro = idAjusteSiniestro;
	AnioFabricacion = anioFabricacion;
	AjusteDescuento = ajusteDescuento;
	AjusteEmision = ajusteEmision;
	Modificacion = modificacion;
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
	FormaPago = formaPago;
	Cobertura = cobertura;
	Medida = medida;
}

public long getNumeroPoliza() {
	return numeroPoliza;
}

public void setNumeroPoliza(long numeroPoliza) {
	this.numeroPoliza = numeroPoliza;
}

public Modelo getModelo() {
	return Modelo;
}

public void setModelo(Modelo modelo) {
	Modelo = modelo;
}

public AjusteHijo getAjusteHijo() {
	return AjusteHijo;
}

public void setAjusteHijo(AjusteHijo ajusteHijo) {
	AjusteHijo = ajusteHijo;
}

public AjusteKilometro getAjusteKilometro() {
	return AjusteKilometro;
}

public void setAjusteKilometro(AjusteKilometro ajusteKilometro) {
	AjusteKilometro = ajusteKilometro;
}

public AjusteSiniestro getIdAjusteSiniestro() {
	return idAjusteSiniestro;
}

public void setIdAjusteSiniestro(AjusteSiniestro idAjusteSiniestro) {
	this.idAjusteSiniestro = idAjusteSiniestro;
}

public fabricado getAnioFabricacion() {
	return AnioFabricacion;
}

public void setAnioFabricacion(fabricado anioFabricacion) {
	AnioFabricacion = anioFabricacion;
}

public AjusteDescuento getAjusteDescuento() {
	return AjusteDescuento;
}

public void setAjusteDescuento(AjusteDescuento ajusteDescuento) {
	AjusteDescuento = ajusteDescuento;
}

public AjusteEmision getAjusteEmision() {
	return AjusteEmision;
}

public void setAjusteEmision(AjusteEmision ajusteEmision) {
	AjusteEmision = ajusteEmision;
}

public Modificacion getModificacion() {
	return Modificacion;
}

public void setModificacion(Modificacion modificacion) {
	Modificacion = modificacion;
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

public TipoFormaPago getFormaPago() {
	return FormaPago;
}

public void setFormaPago(TipoFormaPago formaPago) {
	FormaPago = formaPago;
}

public Cobertura getCobertura() {
	return Cobertura;
}

public void setCobertura(Cobertura cobertura) {
	Cobertura = cobertura;
}

public MedidaSeguridad getMedida() {
	return Medida;
}

public void setMedida(MedidaSeguridad medida) {
	Medida = medida;
}


}
