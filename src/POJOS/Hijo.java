package POJOS;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Hijo", schema = "public")
public class Hijo {
	@Id
	@Column
	private long idHijo;
	@Column
	private Date fechaNacimiento;
	
	public Hijo() {}

	public Hijo(long idHijo, Date fechaNacimiento) {
		super();
		this.idHijo = idHijo;
		this.fechaNacimiento = fechaNacimiento;
	}

	public long getIdHijo() {
		return idHijo;
	}

	public void setIdHijo(long idHijo) {
		this.idHijo = idHijo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
