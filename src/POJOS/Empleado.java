package POJOS;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {
	@Id
	@Column
	private long idEmpleado;
	@Column
	private String contrasena;
	@Column
	private String email;
	@Column
	private Date trabajaDesde;
	@Column
	private String nombreEmpleado;
	
	public Empleado() {}

	public Empleado(long idEmpleado, String contrasena, String email, Date trabajaDesde, String nombreEmpleado) {
		super();
		this.idEmpleado = idEmpleado;
		this.contrasena = contrasena;
		this.email = email;
		this.trabajaDesde = trabajaDesde;
		this.nombreEmpleado = nombreEmpleado;
	}

	public long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getTrabajaDesde() {
		return trabajaDesde;
	}

	public void setTrabajaDesde(Date trabajaDesde) {
		this.trabajaDesde = trabajaDesde;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	
}
