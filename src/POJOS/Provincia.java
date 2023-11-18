package POJOS;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Provincia", schema = "public")
public class Provincia {
	@Id
	@Column
	private long idProvincia;
	@ManyToOne
	@JoinColumn(name = "idPais", nullable = false, referencedColumnName = "idPais", 
	foreignKey=@ForeignKey(name = "fk_Pais", value = ConstraintMode.CONSTRAINT))
	private Pais pais;
	@Column
	private String nombreProvincia;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProvincia", nullable = true, referencedColumnName = "idProvincia", 
	foreignKey=@ForeignKey(name = "fk_LocalidadProvincia", value = ConstraintMode.CONSTRAINT))
	private List<Localidad> localidades;

	public Provincia() {}

	public Provincia(long idProvincia, Pais pais, String nombreProvincia) {
		super();
		this.idProvincia = idProvincia;
		this.pais = pais;
		this.nombreProvincia = nombreProvincia;
	}

	public long getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(long idProvincia) {
		this.idProvincia = idProvincia;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	
}
