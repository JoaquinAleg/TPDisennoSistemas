package POJOS;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Modificacion", schema = "public")
public class Modificacion {
	@Id
	@Column
	private long idModificacion;
	@Column
	private long idModelo;
	@Column
	private int kilometrosRealizadosAnio;
	@Column
	private int cantSiniestrosUA;
	@Column
	private String chasis;
	@Column
	private String patente;
	@Column
	private String motor;
	@Column
	private Date fehcaFabricacion;
	@Column
	private Float valorAsegurado;
	@Column
	private Date fechaModificacion;
	@Column
	private long idCliente;
	@Column
	private long idFormaPago;
	@Column
	private long idCobertura;
	@Column
	private long idMedida;
	
	public Modificacion() {}

	public Modificacion(long idModificacion, long idModelo, int kilometrosRealizadosAnio, int cantSiniestrosUA,
			String chasis, String patente, String motor, Date fehcaFabricacion, Float valorAsegurado,
			Date fechaModificacion, long idCliente, long idFormaPago, long idCobertura, long idMedida) {
		super();
		this.idModificacion = idModificacion;
		this.idModelo = idModelo;
		this.kilometrosRealizadosAnio = kilometrosRealizadosAnio;
		this.cantSiniestrosUA = cantSiniestrosUA;
		this.chasis = chasis;
		this.patente = patente;
		this.motor = motor;
		this.fehcaFabricacion = fehcaFabricacion;
		this.valorAsegurado = valorAsegurado;
		this.fechaModificacion = fechaModificacion;
		this.idCliente = idCliente;
		this.idFormaPago = idFormaPago;
		this.idCobertura = idCobertura;
		this.idMedida = idMedida;
	}

	public long getIdModificacion() {
		return idModificacion;
	}

	public void setIdModificacion(long idModificacion) {
		this.idModificacion = idModificacion;
	}

	public long getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(long idModelo) {
		this.idModelo = idModelo;
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

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public Date getFehcaFabricacion() {
		return fehcaFabricacion;
	}

	public void setFehcaFabricacion(Date fehcaFabricacion) {
		this.fehcaFabricacion = fehcaFabricacion;
	}

	public Float getValorAsegurado() {
		return valorAsegurado;
	}

	public void setValorAsegurado(Float valorAsegurado) {
		this.valorAsegurado = valorAsegurado;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
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
