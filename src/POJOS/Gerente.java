package POJOS;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Gerente", schema = "public")
public class Gerente {
	@Id
	@Column
	private long idGerente;
	@OneToOne
	@JoinColumn(name = "idEmpleado", nullable = false, referencedColumnName = "idEmpleado", 
	foreignKey=@ForeignKey(name = "fk_EmpleadoGerente", value = ConstraintMode.CONSTRAINT))
	private Empleado empleado;
	@Column
	private Date fechaInicio;
	@Column
	private Date fechaFin;
	
	public Gerente() {}

	public Gerente(long idGerente, Empleado empleado, Date fechaInicio, Date fechaFin) {
		super();
		this.idGerente = idGerente;
		this.empleado = empleado;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public long getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(long idGerente) {
		this.idGerente = idGerente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
}
