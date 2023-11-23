package DTOS;

import java.time.LocalDate;

public class HijosDTO {
	private LocalDate fechaNacimiento;
	private Long estadoCivil;
	private Long sexo;
	
	public HijosDTO(LocalDate fechaNacimiento, Long estadoCivil, Long sexo) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Long getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(Long estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Long getSexo() {
		return sexo;
	}
	public void setSexo(Long sexo) {
		this.sexo = sexo;
	}

	
}
