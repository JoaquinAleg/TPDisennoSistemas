package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ValorSiniestro")
public class ValorSiniestro {
	@Id
	@ManyToOne
	@JoinColumn(name = "idAjusteSiniestro", nullable = false, referencedColumnName = "idAjusteSiniestro", 
	foreignKey=@ForeignKey(name = "fk_SiniestroV", value = ConstraintMode.CONSTRAINT))
	private AjusteSiniestro ajuste;
	@Id
	@ManyToOne
	@JoinColumn(name = "idValorPorcentual", nullable = false, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorSiniestro", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valor;
	
	public ValorSiniestro() {}

	public ValorSiniestro(AjusteSiniestro ajuste, ValorPorcentual valor) {
		super();
		this.ajuste = ajuste;
		this.valor = valor;
	}

	public AjusteSiniestro getAjuste() {
		return ajuste;
	}

	public void setAjuste(AjusteSiniestro ajuste) {
		this.ajuste = ajuste;
	}

	public ValorPorcentual getValor() {
		return valor;
	}

	public void setValor(ValorPorcentual valor) {
		this.valor = valor;
	}
	
	
}
