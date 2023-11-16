package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Cobertura")
public class Cobertura {
	@Id
	@Column
	private long idCobertura;
	@Column
	private long valorPorcentual;
	@Column
	private String descripcion;
	
	public Cobertura() {}

	public Cobertura(long idCobertura, long valorPorcentual, String descripcion) {
		super();
		this.idCobertura = idCobertura;
		this.valorPorcentual = valorPorcentual;
		this.descripcion = descripcion;
	}

	public long getIdCobertura() {
		return idCobertura;
	}

	public void setIdCobertura(long idCobertura) {
		this.idCobertura = idCobertura;
	}

	public long getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(long valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
