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
	private int cuil;
	@Column(name = "documento")
	private String documento;
	@Column(name = "fechaNacimiento")
	private Date fechaNacimiento;
	@Column
	private long idDomicilio;
	@Column
	private long idTiposexo;
	@Column
	private long idTipoEstadoCivil;
	@Column
	private long idTipoDocumento;
	
	public Persona() {
	}
	public Persona(long cuit, String nombre, String apellido, int cuil, String documento, Date fechaNacimiento,
			long idDomicilio, long idTiposexo, long idTipoEstadoCivil, long idTipoDocumento) {
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
	public int getCuil() {
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
	public long getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(long idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	public long getIdTiposexo() {
		return idTiposexo;
	}
	public void setIdTiposexo(long idTiposexo) {
		this.idTiposexo = idTiposexo;
	}
	public long getIdTipoEstadoCivil() {
		return idTipoEstadoCivil;
	}
	public void setIdTipoEstadoCivil(long idTipoEstadoCivil) {
		this.idTipoEstadoCivil = idTipoEstadoCivil;
	}
	public long getIdTipoDocumento() {
		return idTipoDocumento;
	}
	public void setIdTipoDocumento(long idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}
	

	
}
