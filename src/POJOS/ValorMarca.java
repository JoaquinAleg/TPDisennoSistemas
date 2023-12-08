package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ValorMarca")
public class ValorMarca {
	@Id
	@ManyToOne
	@JoinColumn(name = "idMarca", nullable = true, referencedColumnName = "idMarca", 
	foreignKey=@ForeignKey(name = "fk_MarcaV", value = ConstraintMode.CONSTRAINT))
	private Marca Marca;
	@Id
	@ManyToOne
	@JoinColumn(name = "idValorPorcentual", nullable = true, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorMarca", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valor;
	
	public ValorMarca() {}

	public ValorMarca(Marca Marca, ValorPorcentual valor) {
		super();
		this.Marca = Marca;
		this.valor = valor;
	}

	public Marca getAjuste() {
		return Marca;
	}

	public void setAjuste(Marca Marca) {
		this.Marca = Marca;
	}

	public ValorPorcentual getValor() {
		return valor;
	}

	public void setValor(ValorPorcentual valor) {
		this.valor = valor;
	}
	
	
}
