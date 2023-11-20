package DTOS;

import java.time.LocalDate;

public class HijosDTO {
	private LocalDate fechaNacimiento;
	private String estadoCivil;
	private String sexo;
	public HijosDTO(LocalDate fechaNacimiento, String estadoCivil, String sexo) {
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
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
