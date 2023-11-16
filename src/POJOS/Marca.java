package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Marca")
public class Marca {
	@Id
	@Column
	private long idMarca;
	@Column
	private long valorPorcentual;
	@Column
	private String nombreMarca;
	
	public Marca() {}

	public Marca(long idMarca, int valorPorcentual, String nombreMarca) {
		super();
		this.idMarca = idMarca;
		this.valorPorcentual = valorPorcentual;
		this.nombreMarca = nombreMarca;
	}

	public long getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(long idMarca) {
		this.idMarca = idMarca;
	}

	public long getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(long valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}
	
}
