package POJOS;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente", schema = "public")
public class Cliente {
	@Id
	@Column
	private long idCliente;
	@Column
	private Date fechaRegistro;
	@Column
	private String profesion;
	@OneToOne
	@JoinColumn(name = "cuit", nullable = false, referencedColumnName = "cuit", 
			foreignKey=@ForeignKey(name = "fk_cuitCliente", value = ConstraintMode.CONSTRAINT))
	private Persona persona;
	@ManyToOne
	@JoinColumn(name = "idTipoEstadoCliente", nullable = false, referencedColumnName = "idTipoEstadoCliente", 
	foreignKey=@ForeignKey(name = "fk_estadoCliente", value = ConstraintMode.CONSTRAINT))
	private TipoEstadoCliente estadoCliente;
	@ManyToOne
	@JoinColumn(name = "idTipoCondicionIVA", nullable = false, referencedColumnName = "idTipoCondicionIVA", 
	foreignKey=@ForeignKey(name = "fk_TipoCondicionIVA", value = ConstraintMode.CONSTRAINT))
	private TipoCondicionIVA CondicionIVA;
	@ManyToOne
	@JoinColumn(name = "idTipoCondicionCliente", nullable = false, referencedColumnName = "idTipoCondicionCliente", 
	foreignKey=@ForeignKey(name = "fk_TipoCondicionCliente", value = ConstraintMode.CONSTRAINT))
	private TipoCondicionCliente condicionCliente;
	@OneToMany
	@JoinColumn(name="numeroPoliza", nullable = true, referencedColumnName="numeroPoliza", 
	foreignKey=@ForeignKey(name="fk_polizacliente", value=ConstraintMode.CONSTRAINT))
	private List<Poliza> polizas;
	@OneToMany
	@JoinColumn(name = "idModificacion", nullable = true, referencedColumnName = "idModificacion", 
	foreignKey=@ForeignKey(name = "fk_ModificacionCliente", value = ConstraintMode.CONSTRAINT))
	private List<Modificacion> modificaciones;
	
	
	public Cliente() {}

	
	


	public Cliente(long idCliente, Date fechaRegistro, String profesion, Persona persona,
			TipoEstadoCliente estadoCliente, TipoCondicionIVA condicionIVA, TipoCondicionCliente condicionCliente,
			List<Poliza> polizas, List<Modificacion> modificaciones) {
		super();
		this.idCliente = idCliente;
		this.fechaRegistro = fechaRegistro;
		this.profesion = profesion;
		this.persona = persona;
		this.estadoCliente = estadoCliente;
		CondicionIVA = condicionIVA;
		this.condicionCliente = condicionCliente;
		this.polizas = polizas;
		this.modificaciones = modificaciones;
	}





	public List<Poliza> getPolizas() {
		return polizas;
	}


	public void setPolizas(List<Poliza> polizas) {
		this.polizas = polizas;
	}


	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public TipoEstadoCliente getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(TipoEstadoCliente estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public TipoCondicionIVA getCondicionIVA() {
		return CondicionIVA;
	}

	public void setCondicionIVA(TipoCondicionIVA condicionIVA) {
		CondicionIVA = condicionIVA;
	}

	public TipoCondicionCliente getCondicionCliente() {
		return condicionCliente;
	}

	public void setCondicionCliente(TipoCondicionCliente condicionCliente) {
		this.condicionCliente = condicionCliente;
	}

	public List<Modificacion> getModificaciones() {
		return modificaciones;
	}

	public void setModificaciones(List<Modificacion> modificaciones) {
		this.modificaciones = modificaciones;
	}

	
	
}
