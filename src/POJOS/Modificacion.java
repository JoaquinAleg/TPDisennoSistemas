package POJOS;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
	private LocalDate fehcaFabricacion;
	@Column
	private Float valorAsegurado;
	@Column
	private LocalDate fechaModificacion;
	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false, referencedColumnName = "idCliente", 
	foreignKey=@ForeignKey(name = "fk_ClienteModicacion", value = ConstraintMode.CONSTRAINT))
	private Cliente Cliente;
	@ManyToOne
	@JoinColumn(name = "idFormaPago", nullable = false, referencedColumnName = "idFormaPago", 
	foreignKey=@ForeignKey(name = "fk_FormaPagoModicacion", value = ConstraintMode.CONSTRAINT))
	private TipoFormaPago TipoFormaPagoFormaPago;
	@ManyToOne
	@JoinColumn(name = "idCobertura", nullable = false, referencedColumnName = "idCobertura", 
	foreignKey=@ForeignKey(name = "fk_CoberturaModificacion", value = ConstraintMode.CONSTRAINT))
	private Cobertura Cobertura;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idModificacion", nullable = true, referencedColumnName = "idModificacion", 
	foreignKey=@ForeignKey(name = "fk_MedidasPoliza", value = ConstraintMode.CONSTRAINT))
	private List<MedidaSeguridad> modificaciones= new ArrayList<MedidaSeguridad>();
	
	
	public Modificacion() {}

	public Modificacion(long idModificacion, POJOS.Modelo modelo, int kilometrosRealizadosAnio, int cantSiniestrosUA,
			String chasis, String patente, String motor, LocalDate fehcaFabricacion, Float valorAsegurado,
			LocalDate fechaModificacion, POJOS.Cliente cliente, TipoFormaPago tipoFormaPagoFormaPago,
			POJOS.Cobertura cobertura, List<MedidaSeguridad> modificaciones) {
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
		TipoFormaPagoFormaPago = tipoFormaPagoFormaPago;
		Cobertura = cobertura;
		this.modificaciones = modificaciones;
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

	public LocalDate getFehcaFabricacion() {
		return fehcaFabricacion;
	}

	public void setFehcaFabricacion(LocalDate fehcaFabricacion) {
		this.fehcaFabricacion = fehcaFabricacion;
	}

	public Float getValorAsegurado() {
		return valorAsegurado;
	}

	public void setValorAsegurado(Float valorAsegurado) {
		this.valorAsegurado = valorAsegurado;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public TipoFormaPago getTipoFormaPagoFormaPago() {
		return TipoFormaPagoFormaPago;
	}

	public void setTipoFormaPagoFormaPago(TipoFormaPago tipoFormaPagoFormaPago) {
		TipoFormaPagoFormaPago = tipoFormaPagoFormaPago;
	}

	public Cobertura getCobertura() {
		return Cobertura;
	}

	public void setCobertura(Cobertura cobertura) {
		Cobertura = cobertura;
	}

	public List<MedidaSeguridad> getModificaciones() {
		return modificaciones;
	}

	public void setModificaciones(List<MedidaSeguridad> modificaciones) {
		this.modificaciones = modificaciones;
	}

	
}
