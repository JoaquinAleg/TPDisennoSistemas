package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Pais")
public class Pais {
	@Id
	@Column
	private long idPais;
	@Column
	private String nombrePais;
	
	public Pais() {}

	public Pais(long idPais, String nombrePais) {
		super();
		this.idPais = idPais;
		this.nombrePais = nombrePais;
	}

	public long getIdPais() {
		return idPais;
	}

	public void setIdPais(long idPais) {
		this.idPais = idPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
}
