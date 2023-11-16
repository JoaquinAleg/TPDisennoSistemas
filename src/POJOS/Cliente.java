package POJOS;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {
	@Id
	@Column
	private long idCliente;
	@Column
	private Date fechaRegistro;
	@Column
	private String profesion;
	@Column
	private long idCuit;
	@Column
	private long idTipoEstadoCliente;
	@Column
	private long idTipoCondicionIVA;
	
	public Cliente() {}

	public Cliente(long idCliente, Date fechaRegistro, String profesion, long idCuit, long idTipoEstadoCliente,
			long idTipoCondicionIVA) {
		super();
		this.idCliente = idCliente;
		this.fechaRegistro = fechaRegistro;
		this.profesion = profesion;
		this.idCuit = idCuit;
		this.idTipoEstadoCliente = idTipoEstadoCliente;
		this.idTipoCondicionIVA = idTipoCondicionIVA;
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

	public long getIdCuit() {
		return idCuit;
	}

	public void setIdCuit(long idCuit) {
		this.idCuit = idCuit;
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
	
}
