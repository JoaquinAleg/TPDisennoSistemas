package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Fabricado")
public class fabricado {
	@Id
	@OneToOne
	private AnioFabricacion AnioFabricacion;
	@OneToOne
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
