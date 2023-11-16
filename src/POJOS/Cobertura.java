package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Cobertura")
public class Cobertura {
	@Id
	@Column
	private long idCobertura;
	@OneToOne
	@JoinColumn(name = "idValorPorcentual", nullable = false, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_valorCobertura", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valorPorcentual;
	@Column
	private String descripcion;
	
	public Cobertura() {}

	public Cobertura(long idCobertura, ValorPorcentual valorPorcentual, String descripcion) {
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

	public ValorPorcentual getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(ValorPorcentual valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
}
