package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Fabricado")
public class fabricado {
	@Id
	@Column
	private long idAnioFabricacion;
	@Column
	private long idModelo;
	
	public fabricado() {}

	public fabricado(long idAnioFabricacion, long idModelo) {
		super();
		this.idAnioFabricacion = idAnioFabricacion;
		this.idModelo = idModelo;
	}

	public long getIdAnioFabricacion() {
		return idAnioFabricacion;
	}

	public void setIdAnioFabricacion(long idAnioFabricacion) {
		this.idAnioFabricacion = idAnioFabricacion;
	}

	public long getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(long idModelo) {
		this.idModelo = idModelo;
	}
	
}
