package POJOS;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
	@Id
	@Column(name = "cuit")
	private long cuit;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "cuil")
	private Integer cuil;
	@Column(name = "documento")
	private String documento;
	@Column(name = "fechaNacimiento")
	private Date fechaNacimiento;
	private Integer idDomicilio;
	private Integer idTiposexo;
	private Integer idTipoEstadoCivil;
	private Integer idTipoDocumento;
	
	public Persona() {
	}
	public Persona(long cuit, String nombre, String apellido, Integer cuil, String documento, Date fechaNacimiento,
			Integer idDomicilio, Integer idTiposexo, Integer idTipoEstadoCivil, Integer idTipoDocumento) {
		super();
		this.cuit = cuit;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.idDomicilio = idDomicilio;
		this.idTiposexo = idTiposexo;
		this.idTipoEstadoCivil = idTipoEstadoCivil;
		this.idTipoDocumento = idTipoDocumento;
	}
	public long getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getCuil() {
		return cuil;
	}
	public void setCuil(Integer cuil) {
		this.cuil = cuil;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Integer getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(Integer idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	public Integer getIdTiposexo() {
		return idTiposexo;
	}
	public void setIdTiposexo(Integer idTiposexo) {
		this.idTiposexo = idTiposexo;
	}
	public Integer getIdTipoEstadoCivil() {
		return idTipoEstadoCivil;
	}
	public void setIdTipoEstadoCivil(Integer idTipoEstadoCivil) {
		this.idTipoEstadoCivil = idTipoEstadoCivil;
	}
	public Integer getIdTipoDocumento() {
		return idTipoDocumento;
	}
	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}
	

	
}
