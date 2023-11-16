package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Localidad")
public class Localidad {
	@Id
	@Column
	private long idLocalidad;
	@Column
	private long idProvincia;
	@Column
	private int codigoPostal;
	@Column
	private String nombreLocalidad;
	
	public Localidad() {}

	public Localidad(long idLocalidad, long idProvincia, int codigoPostal, String nombreLocalidad) {
		super();
		this.idLocalidad = idLocalidad;
		this.idProvincia = idProvincia;
		this.codigoPostal = codigoPostal;
		this.nombreLocalidad = nombreLocalidad;
	}

	public long getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(long idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public long getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(long idProvincia) {
		this.idProvincia = idProvincia;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getNombreLocalidad() {
		return nombreLocalidad;
	}

	public void setNombreLocalidad(String nombreLocalidad) {
		this.nombreLocalidad = nombreLocalidad;
	}
	
}
