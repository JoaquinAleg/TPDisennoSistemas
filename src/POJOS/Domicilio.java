package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Domicilio")
public class Domicilio {
	@Id
	@Column
	private long idDomicilio;
	@Column
	private long idLocalidad;
	@Column
	private String calle;
	@Column
	private int nroCalle;
	@Column
	private String dpto;
	@Column
	private int piso;

	public Domicilio() {}

	public Domicilio(long idDomicilio, long idLocalidad, String calle, int nroCalle, String dpto, int piso) {
		super();
		this.idDomicilio = idDomicilio;
		this.idLocalidad = idLocalidad;
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

	public long getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(long idLocalidad) {
		this.idLocalidad = idLocalidad;
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
