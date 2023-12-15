package POJOS;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "ProductorDeSeguro", schema = "public")
public class ProductorDeSeguro {
	@Id
	@Column
	private long idProductorDeSeguro;
	@OneToOne
	@JoinColumn(name = "idEmpleado", nullable = false, referencedColumnName = "idEmpleado", 
	foreignKey=@ForeignKey(name = "fk_EmpleadoProductor", value = ConstraintMode.CONSTRAINT))
	private Empleado Empleado;
	@Column
	private LocalDate fechaInicio;
	@Column
	private LocalDate fechaFin;
	
	
	//FALTA RELACION CON VALOR PORCENTUAL
	
	public ProductorDeSeguro() {}

	public ProductorDeSeguro(long idProductorDeSeguro, POJOS.Empleado empleado, LocalDate fechaInicio, LocalDate fechaFin) {
		super();
		this.idProductorDeSeguro = idProductorDeSeguro;
		Empleado = empleado;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public long getIdProductorDeSeguro() {
		return idProductorDeSeguro;
	}

	public void setIdProductorDeSeguro(long idProductorDeSeguro) {
		this.idProductorDeSeguro = idProductorDeSeguro;
	}

	public Empleado getEmpleado() {
		return Empleado;
	}

	public void setEmpleado(Empleado empleado) {
		Empleado = empleado;
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
