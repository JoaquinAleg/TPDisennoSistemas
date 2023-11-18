package POJOS;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Modificacion", schema = "public")
public class Modificacion {
	@Id
	@Column
	private long idModificacion;
	@ManyToOne
	@JoinColumn(name = "idModelo", nullable = false, referencedColumnName = "idModelo", 
	foreignKey=@ForeignKey(name = "fk_ModeloModificacion", value = ConstraintMode.CONSTRAINT))
	private Modelo Modelo;
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
	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false, referencedColumnName = "idCliente", 
	foreignKey=@ForeignKey(name = "fk_clienteModificacion", value = ConstraintMode.CONSTRAINT))
	private Cliente Cliente;
	@ManyToOne
	@JoinColumn(name = "idTipoFormaPago", nullable = false, referencedColumnName = "idTipoFormaPago", 
	foreignKey=@ForeignKey(name = "fk_tipoFormaPagoModificacion", value = ConstraintMode.CONSTRAINT))
	private TipoFormaPago FormaPago;
	@ManyToOne
	@JoinColumn(name = "idCobertura", nullable = false, referencedColumnName = "idCobertura", 
	foreignKey=@ForeignKey(name = "fk_coberturaModificacion", value = ConstraintMode.CONSTRAINT))
	private Cobertura Cobertura;
	@ManyToOne
	@JoinColumn(name = "idMedida", nullable = false, referencedColumnName = "idMedida", 
	foreignKey=@ForeignKey(name = "fk_clienteModificacion", value = ConstraintMode.CONSTRAINT))
	private MedidaSeguridad Medida;
	
	public Modificacion() {}

	public Modificacion(long idModificacion, POJOS.Modelo modelo, int kilometrosRealizadosAnio, int cantSiniestrosUA,
			String chasis, String patente, String motor, Date fehcaFabricacion, Float valorAsegurado,
			Date fechaModificacion, POJOS.Cliente cliente, TipoFormaPago formaPago, POJOS.Cobertura cobertura,
			MedidaSeguridad medida) {
		super();
		this.idModificacion = idModificacion;
		Modelo = modelo;
		this.kilometrosRealizadosAnio = kilometrosRealizadosAnio;
		this.cantSiniestrosUA = cantSiniestrosUA;
		this.chasis = chasis;
		this.patente = patente;
		this.motor = motor;
		this.fehcaFabricacion = fehcaFabricacion;
		this.valorAsegurado = valorAsegurado;
		this.fechaModificacion = fechaModificacion;
		Cliente = cliente;
		FormaPago = formaPago;
		Cobertura = cobertura;
		Medida = medida;
	}

	public long getIdModificacion() {
		return idModificacion;
	}

	public void setIdModificacion(long idModificacion) {
		this.idModificacion = idModificacion;
	}

	public Modelo getModelo() {
		return Modelo;
	}

	public void setModelo(Modelo modelo) {
		Modelo = modelo;
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

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
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
