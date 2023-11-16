package DTOS;

import java.util.Date;

public class HijosDTO {
	private Date fechaNacimiento;
	private String estadoCivil;
	private String sexo;
	public HijosDTO(Date fechaNacimiento, String estadoCivil, String sexo) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
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
