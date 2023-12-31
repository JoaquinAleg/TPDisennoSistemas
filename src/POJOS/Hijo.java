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
	@ManyToOne
	@JoinColumn(name = "idTipoEstadoCivil", nullable = false, referencedColumnName = "idTipoEstadoCivil", 
	foreignKey=@ForeignKey(name = "fk_estadoCivilHijo", value = ConstraintMode.CONSTRAINT))
	private TipoEstadoCivil estadoCivil;
	@ManyToOne
	@JoinColumn(name = "idTipoSexo", nullable = false, referencedColumnName = "idTipoSexo", 
	foreignKey=@ForeignKey(name = "fk_sexoHijo", value = ConstraintMode.CONSTRAINT))
	private TipoSexo sexo;
	@ManyToOne
	@JoinColumn(name = "numeroPoliza", nullable = false, referencedColumnName = "numeroPoliza", 
	foreignKey=@ForeignKey(name = "fk_polizaHijo", value = ConstraintMode.CONSTRAINT))
	private Poliza poliza;
	public Hijo() {}
	
	public Hijo(long idHijo, LocalDate fechaNacimiento, TipoEstadoCivil estadoCivil, TipoSexo sexo, Poliza poliza) {
		super();
		this.idHijo = idHijo;
		this.fechaNacimiento = fechaNacimiento;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
		this.poliza = poliza;
	}
	
	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
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
	public TipoEstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(TipoEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public TipoSexo getSexo() {
		return sexo;
	}
	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	
}
