package POJOS;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "Hijo", schema = "public")
public class Hijo {
	@Id
	@Column
	private long idHijo;
	@Column
	private LocalDate fechaNacimiento;
	
	public Hijo() {}

	public Hijo(long idHijo, LocalDate fechaNacimiento) {
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
