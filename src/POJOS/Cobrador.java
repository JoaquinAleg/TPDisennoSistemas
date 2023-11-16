package POJOS;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cobrador")
public class Cobrador {
	@Id
	@Column
	private long idCobrador;
	@OneToOne
	@JoinColumn(name = "idEmpleado", nullable = false, referencedColumnName = "idEmpleado", 
	foreignKey=@ForeignKey(name = "fk_empleadoCobrador", value = ConstraintMode.CONSTRAINT))
	private Empleado empleado;
	@Column
	private Date fechaInicio;
	@Column
	private Date fechaFin;

	public Cobrador() {}

	public Cobrador(long idCobrador, Empleado empleado, Date fechaInicio, Date fechaFin) {
		super();
		this.idCobrador = idCobrador;
		this.empleado = empleado;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public long getIdCobrador() {
		return idCobrador;
	}

	public void setIdCobrador(long idCobrador) {
		this.idCobrador = idCobrador;
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
