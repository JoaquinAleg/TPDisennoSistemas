package POJOS;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Cobrador")
public class Cobrador {
	@Id
	@Column
	private long idCobrador;
	@Column
	private long idEmpleado;
	@Column
	private Date fechaInicio;
	@Column
	private Date fechaFin;
	
	public Cobrador() {}

	public Cobrador(long idCobrador, long idEmpleado, Date fechaInicio, Date fechaFin) {
		super();
		this.idCobrador = idCobrador;
		this.idEmpleado = idEmpleado;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public long getIdCobrador() {
		return idCobrador;
	}

	public void setIdCobrador(long idCobrador) {
		this.idCobrador = idCobrador;
	}

	public long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
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
