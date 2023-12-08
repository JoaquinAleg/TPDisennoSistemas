package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ValorKilometro")
public class ValorKilometro {
	@Id
	@ManyToOne
	@JoinColumn(name = "idAjusteKilometro", nullable = true, referencedColumnName = "idAjusteKilometro", 
	foreignKey=@ForeignKey(name = "fk_KilometroV", value = ConstraintMode.CONSTRAINT))
	private AjusteKilometro ajuste;
	@Id
	@ManyToOne
	@JoinColumn(name = "idValorPorcentual", nullable = true, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorKilometro", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valor;
	
	public ValorKilometro() {}

	public ValorKilometro(AjusteKilometro ajuste, ValorPorcentual valor) {
		super();
		this.ajuste = ajuste;
		this.valor = valor;
	}

	public AjusteKilometro getAjuste() {
		return ajuste;
	}

	public void setAjuste(AjusteKilometro ajuste) {
		this.ajuste = ajuste;
	}

	public ValorPorcentual getValor() {
		return valor;
	}

	public void setValor(ValorPorcentual valor) {
		this.valor = valor;
	}
	
	
}
