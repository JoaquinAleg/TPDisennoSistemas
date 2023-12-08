package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ValorDescuento")
public class ValorDescuento {
	@Id
	@ManyToOne
	@JoinColumn(name = "idAjusteDescuento", nullable = true, referencedColumnName = "idAjusteDescuento", 
	foreignKey=@ForeignKey(name = "fk_DescuentoV", value = ConstraintMode.CONSTRAINT))
	private AjusteDescuento ajuste;
	@Id
	@ManyToOne
	@JoinColumn(name = "idValorPorcentual", nullable = true, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorDescuento", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valor;
	
	public ValorDescuento() {}

	public ValorDescuento(AjusteDescuento ajuste, ValorPorcentual valor) {
		super();
		this.ajuste = ajuste;
		this.valor = valor;
	}

	public AjusteDescuento getAjuste() {
		return ajuste;
	}

	public void setAjuste(AjusteDescuento ajuste) {
		this.ajuste = ajuste;
	}

	public ValorPorcentual getValor() {
		return valor;
	}

	public void setValor(ValorPorcentual valor) {
		this.valor = valor;
	}
	
	
}
