package POJOS;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Pais", schema = "public")
public class Pais {
	@Id
	@Column
	private long idPais;
	@Column
	private String nombrePais;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="idPais", nullable = true, referencedColumnName="idPais", 
	foreignKey=@ForeignKey(name="fk_PaisProvincia", value=ConstraintMode.CONSTRAINT))
	private List<Provincia> provincias;
	
	
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
