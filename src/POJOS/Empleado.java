package POJOS;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "Empleado", schema = "public")
public class Empleado {
	@Id
	@Column
	private long idEmpleado;
	@Column
	private String contrasena;
	@Column
	private String email;
	@Column
	private LocalDate trabajaDesde;
	@Column
	private String nombreEmpleado;
	
	public Empleado() {}

	public Empleado(long idEmpleado, String contrasena, String email, LocalDate trabajaDesde, String nombreEmpleado) {
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

	public LocalDate getTrabajaDesde() {
		return trabajaDesde;
	}

	public void setTrabajaDesde(LocalDate trabajaDesde) {
		this.trabajaDesde = trabajaDesde;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	
}
