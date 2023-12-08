package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ValorCobertura")
public class ValorCobertura {
	@Id
	@ManyToOne
	@JoinColumn(name = "idCobertura", nullable = true, referencedColumnName = "idCobertura", 
	foreignKey=@ForeignKey(name = "fk_CoberturaV", value = ConstraintMode.CONSTRAINT))
	private Cobertura cobertura;
	@Id
	@ManyToOne
	@JoinColumn(name = "idValorPorcentual", nullable = true, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorCobertura", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valor;
	
	public ValorCobertura() {}

	public ValorCobertura(Cobertura cobertura, ValorPorcentual valor) {
		super();
		this.cobertura = cobertura;
		this.valor = valor;
	}

	public Cobertura getAjuste() {
		return cobertura;
	}

	public void setAjuste(Cobertura cobertura) {
		this.cobertura = cobertura;
	}

	public ValorPorcentual getValor() {
		return valor;
	}

	public void setValor(ValorPorcentual valor) {
		this.valor = valor;
	}
	
	
}
