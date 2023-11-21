package POJOS;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Cobertura", schema = "public")
public class Cobertura {
	@Id
	@Column
	private long idCobertura;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCobertura", nullable = true, referencedColumnName = "idCobertura", 
	foreignKey=@ForeignKey(name = "fk_valorC", value = ConstraintMode.CONSTRAINT))
	private List<ValorPorcentual> valorPorcentual;
	@Column
	private String descripcion;
	
	public Cobertura() {}

	public Cobertura(long idCobertura, List<ValorPorcentual> valorPorcentual, String descripcion) {
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

	public List<ValorPorcentual> getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(List<ValorPorcentual> valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
}
