package POJOS;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "ProductorDeSeguro", schema = "public")
public class ProductorDeSeguro {
	@Id
	@Column
	private long idProductorDeSeguro;
	@Column
	private long idEmpleado;
	@Column
	private Date fechaInicio;
	@Column
	private Date fechaFin;
	
	public ProductorDeSeguro() {}

	public ProductorDeSeguro(long idProductorDeSeguro, long idEmpleado, Date fechaInicio, Date fechaFin) {
		super();
		this.idProductorDeSeguro = idProductorDeSeguro;
		this.idEmpleado = idEmpleado;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public long getIdProductorDeSeguro() {
		return idProductorDeSeguro;
	}

	public void setIdProductorDeSeguro(long idProductorDeSeguro) {
		this.idProductorDeSeguro = idProductorDeSeguro;
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
