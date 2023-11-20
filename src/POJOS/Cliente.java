package POJOS;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente", schema = "public")
public class Cliente {
	@Id
	@Column
	private long idCliente;
	@Column
	private LocalDate fechaRegistro;
	@Column
	private String profesion;
	@OneToOne
	@JoinColumn(name = "cuit", nullable = false, referencedColumnName = "cuit", 
			foreignKey=@ForeignKey(name = "fk_cuitCliente", value = ConstraintMode.CONSTRAINT))
	private Persona persona;
	@Column
	private long idTipoEstadoCliente;
	@Column
	private long idTipoCondicionIVA;
	
	
	public Cliente() {}

	public Cliente(long idCliente, LocalDate fechaRegistro, String profesion, Persona persona, long idTipoEstadoCliente,
			long idTipoCondicionIVA) {
		super();
		this.idCliente = idCliente;
		this.fechaRegistro = fechaRegistro;
		this.profesion = profesion;
		this.persona = persona;
		this.idTipoEstadoCliente = idTipoEstadoCliente;
		this.idTipoCondicionIVA = idTipoCondicionIVA;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
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

	public long getIdTipoEstadoCliente() {
		return idTipoEstadoCliente;
	}

	public void setIdTipoEstadoCliente(long idTipoEstadoCliente) {
		this.idTipoEstadoCliente = idTipoEstadoCliente;
	}

	public long getIdTipoCondicionIVA() {
		return idTipoCondicionIVA;
	}

	public void setIdTipoCondicionIVA(long idTipoCondicionIVA) {
		this.idTipoCondicionIVA = idTipoCondicionIVA;
	}

	public List<Poliza> getPolizas() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCondicionNomral() {
		// TODO Auto-generated method stub
		
	}

	public List<Cuota> getCuotasImpagas() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
