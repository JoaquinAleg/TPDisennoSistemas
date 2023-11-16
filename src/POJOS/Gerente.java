package POJOS;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Gerente")
public class Gerente {
	@Id
	@Column
	private long idGerente;
	@Column
	private long idEmpleado;
	@Column
	private Date fechaInicio;
	@Column
	private Date fechaFin;
	
	public Gerente() {}

	public Gerente(long idGerente, long idEmpleado, Date fechaInicio, Date fechaFin) {
		super();
		this.idGerente = idGerente;
		this.idEmpleado = idEmpleado;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public long getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(long idGerente) {
		this.idGerente = idGerente;
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
