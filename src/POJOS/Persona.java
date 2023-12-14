package POJOS;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "persona", schema = "public")
public class Persona {
	@Id
	@Column(name = "idPersona")
	private long idPersona;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "cuil")
	private String cuil;
	@Column(name = "documento")
	private String documento;
	@Column(name = "fechaNacimiento")
	private LocalDate fechaNacimiento;
	@ManyToOne
	@JoinColumn(name = "idDomicilio", nullable = false, referencedColumnName = "idDomicilio", 
	foreignKey=@ForeignKey(name = "fk_DomicilioPersona", value = ConstraintMode.CONSTRAINT))
	private Domicilio idDomicilio;
	@ManyToOne
	@JoinColumn(name = "idTipoSexo", nullable = false, referencedColumnName = "idTipoSexo", 
	foreignKey=@ForeignKey(name = "fk_TipoSexo", value = ConstraintMode.CONSTRAINT))
	private TipoSexo idTiposexo;
	@ManyToOne
	@JoinColumn(name = "idTipoEstadoCivil", nullable = false, referencedColumnName = "idTipoEstadoCivil", 
	foreignKey=@ForeignKey(name = "fk_EstadoCivil", value = ConstraintMode.CONSTRAINT))
	private TipoEstadoCivil idTipoEstadoCivil;
	@ManyToOne
	@JoinColumn(name = "idTipoDocumento", nullable = false, referencedColumnName = "idTipoDocumento", 
			foreignKey=@ForeignKey(name = "fk_TipoDocumento", value = ConstraintMode.CONSTRAINT))
	private TipoDocumento idTipoDocumento;
	
	public Persona() {
	}

	public Persona(long idPersona, String nombre, String apellido, String cuil, String documento, LocalDate fechaNacimiento,
			Domicilio idDomicilio, TipoSexo idTiposexo, TipoEstadoCivil idTipoEstadoCivil,
			TipoDocumento idTipoDocumento) {
		super();
		this.idPersona = idPersona;
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

	public long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(long idPersona) {
		this.idPersona = idPersona;
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

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Domicilio getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(Domicilio idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public TipoSexo getIdTiposexo() {
		return idTiposexo;
	}

	public void setIdTiposexo(TipoSexo idTiposexo) {
		this.idTiposexo = idTiposexo;
	}

	public TipoEstadoCivil getIdTipoEstadoCivil() {
		return idTipoEstadoCivil;
	}

	public void setIdTipoEstadoCivil(TipoEstadoCivil idTipoEstadoCivil) {
		this.idTipoEstadoCivil = idTipoEstadoCivil;
	}

	public TipoDocumento getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(TipoDocumento idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}
	
	
	
}
