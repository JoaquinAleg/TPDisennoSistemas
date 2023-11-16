package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "TipoCondicionIVa")
public class TipoCondicionIVA {
	@Id
	@Column
	private long idTipoCondicionIVA;
	@Column
	private String descripcion;
	
	public TipoCondicionIVA() {}

	public TipoCondicionIVA(long idTipoCondicionIVA, String descripcion) {
		super();
		this.idTipoCondicionIVA = idTipoCondicionIVA;
		this.descripcion = descripcion;
	}

	public long getIdTipoCondicionIVA() {
		return idTipoCondicionIVA;
	}

	public void setIdTipoCondicionIVA(long idTipoCondicionIVA) {
		this.idTipoCondicionIVA = idTipoCondicionIVA;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
