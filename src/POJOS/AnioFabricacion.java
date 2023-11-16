package POJOS;


import jakarta.persistence.*;

@Entity
@Table(name = "anioFabricacion", schema = "public")
public class AnioFabricacion {
	@Id
	@Column
	private long idAnioFabricacion;
	@Column
	private int anioFabricacion;
	
	public AnioFabricacion() {}

	public AnioFabricacion(long idAnioFabricacion, int anioFabricacion) {
		super();
		this.idAnioFabricacion = idAnioFabricacion;
		this.anioFabricacion = anioFabricacion;
	}

	public long getIdAnioFabricacion() {
		return idAnioFabricacion;
	}

	public void setIdAnioFabricacion(long idAnioFabricacion) {
		this.idAnioFabricacion = idAnioFabricacion;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	
}
