package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Provincia")
public class Provincia {
	@Id
	@Column
	private long idProvincia;
	@Column
	private int idPais;
	@Column
	private String nombreProvincia;

	public Provincia() {}

	public Provincia(long idProvincia, int idPais, String nombreProvincia) {
		super();
		this.idProvincia = idProvincia;
		this.idPais = idPais;
		this.nombreProvincia = nombreProvincia;
	}

	public long getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(long idProvincia) {
		this.idProvincia = idProvincia;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}
	
}
