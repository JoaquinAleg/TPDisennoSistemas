package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ValorHijo")
public class ValorHijo {
	@Id
	@ManyToOne
	@JoinColumn(name = "idAjusteHijo", nullable = true, referencedColumnName = "idAjusteHijo", 
	foreignKey=@ForeignKey(name = "fk_HijoV", value = ConstraintMode.CONSTRAINT))
	private AjusteHijo ajuste;
	@Id
	@ManyToOne
	@JoinColumn(name = "idValorPorcentual", nullable = true, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorHijo", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valor;
	
	public ValorHijo() {}

	public ValorHijo(AjusteHijo ajuste, ValorPorcentual valor) {
		super();
		this.ajuste = ajuste;
		this.valor = valor;
	}

	public AjusteHijo getAjuste() {
		return ajuste;
	}

	public void setAjuste(AjusteHijo ajuste) {
		this.ajuste = ajuste;
	}

	public ValorPorcentual getValor() {
		return valor;
	}

	public void setValor(ValorPorcentual valor) {
		this.valor = valor;
	}
	
	
}
