package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Fabricado", schema = "public")
public class fabricado {
	@Id
	@ManyToOne
	@JoinColumn(unique = false, name = "idAnioFabricacion", nullable = false, referencedColumnName = "idAnioFabricacion", 
	foreignKey=@ForeignKey(name = "fk_fabricadoEn", value = ConstraintMode.CONSTRAINT))
	private AnioFabricacion AnioFabricacion;
	@Id
	@ManyToOne
	@JoinColumn(unique = false, name = "idModelo", nullable = false, referencedColumnName = "idModelo", 
	foreignKey=@ForeignKey(name = "fk_Modelo", value = ConstraintMode.CONSTRAINT))
	private Modelo Modelo;
	
	public fabricado() {}

	public fabricado(POJOS.AnioFabricacion anioFabricacion, POJOS.Modelo modelo) {
		super();
		AnioFabricacion = anioFabricacion;
		Modelo = modelo;
	}

	public AnioFabricacion getAnioFabricacion() {
		return AnioFabricacion;
	}

	public void setAnioFabricacion(AnioFabricacion anioFabricacion) {
		AnioFabricacion = anioFabricacion;
	}

	public Modelo getModelo() {
		return Modelo;
	}

	public void setModelo(Modelo modelo) {
		Modelo = modelo;
	}

	
}
