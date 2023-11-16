package POJOS;
import java.util.Date;

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
	private Date fechaInicio;
	@Column
	private Date fechaFin;
	
	public ProductorDeSeguro() {}

	public ProductorDeSeguro(long idProductorDeSeguro, POJOS.Empleado empleado, Date fechaInicio, Date fechaFin) {
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
