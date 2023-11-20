package POJOS;
import java.time.LocalDate;

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
	private LocalDate fechaInicio;
	@Column
	private LocalDate fechaFin;
	
	public Gerente() {}

	public Gerente(long idGerente, Empleado empleado, LocalDate fechaInicio, LocalDate fechaFin) {
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

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
}
