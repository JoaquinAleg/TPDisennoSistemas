package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Domicilio", schema = "public")
public class Domicilio {
	@Id
	@Column
	private long idDomicilio;
	@ManyToOne
	@JoinColumn(name = "idLocalidad", nullable = false, referencedColumnName = "idLocalidad", 
	foreignKey=@ForeignKey(name = "fk_LocalidadDomicilio", value = ConstraintMode.CONSTRAINT))
	private Localidad localidad;
	@Column
	private String calle;
	@Column
	private int nroCalle;
	@Column
	private String dpto;
	@Column
	private int piso;

	public Domicilio() {}

	public Domicilio(long idDomicilio, Localidad localidad, String calle, int nroCalle, String dpto, int piso) {
		super();
		this.idDomicilio = idDomicilio;
		this.localidad = localidad;
		this.calle = calle;
		this.nroCalle = nroCalle;
		this.dpto = dpto;
		this.piso = piso;
	}

	public long getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(long idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNroCalle() {
		return nroCalle;
	}

	public void setNroCalle(int nroCalle) {
		this.nroCalle = nroCalle;
	}

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	
}
