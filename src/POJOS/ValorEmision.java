package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ValorEmision")
public class ValorEmision {
	@Id
	@ManyToOne
	@JoinColumn(name = "idAjusteEmision", nullable = true, referencedColumnName = "idAjusteEmision", 
	foreignKey=@ForeignKey(name = "fk_EmisionV", value = ConstraintMode.CONSTRAINT))
	private AjusteEmision ajuste;
	@Id
	@ManyToOne
	@JoinColumn(name = "idValorPorcentual", nullable = true, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorEmision", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valor;
	
	public ValorEmision() {}

	public ValorEmision(AjusteEmision ajuste, ValorPorcentual valor) {
		super();
		this.ajuste = ajuste;
		this.valor = valor;
	}

	public AjusteEmision getAjuste() {
		return ajuste;
	}

	public void setAjuste(AjusteEmision ajuste) {
		this.ajuste = ajuste;
	}

	public ValorPorcentual getValor() {
		return valor;
	}

	public void setValor(ValorPorcentual valor) {
		this.valor = valor;
	}
	
	
}
