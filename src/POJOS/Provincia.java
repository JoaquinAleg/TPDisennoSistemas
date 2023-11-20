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
	@OneToMany
	@JoinColumn(name = "idProvincia", nullable = true, referencedColumnName = "idProvincia")
	private List<Localidad> localidades;
	public Provincia() {}

	



	public Provincia(long idProvincia, Pais pais, String nombreProvincia, List<Localidad> localidades) {
		super();
		this.idProvincia = idProvincia;
		this.pais = pais;
		this.nombreProvincia = nombreProvincia;
		this.localidades = localidades;
	}





	public List<Localidad> getLocalidades() {
		return localidades;
	}



	public void setLocalidades(List<Localidad> localidades) {
		this.localidades = localidades;
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
