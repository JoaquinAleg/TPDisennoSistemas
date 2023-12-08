package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ValorMedida")
public class ValorMedida {
	@Id
	@ManyToOne
	@JoinColumn(name = "idMedida", nullable = true, referencedColumnName = "idMedida", 
	foreignKey=@ForeignKey(name = "fk_MedidaV", value = ConstraintMode.CONSTRAINT))
	private MedidaSeguridad Medida;
	@Id
	@ManyToOne
	@JoinColumn(name = "idValorPorcentual", nullable = true, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorP", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valor;
	
	public ValorMedida() {}

	public ValorMedida(MedidaSeguridad Medida, ValorPorcentual valor) {
		super();
		this.Medida = Medida;
		this.valor = valor;
	}

	public MedidaSeguridad getAjuste() {
		return Medida;
	}

	public void setAjuste(MedidaSeguridad Medida) {
		this.Medida = Medida;
	}

	public ValorPorcentual getValor() {
		return valor;
	}

	public void setValor(ValorPorcentual valor) {
		this.valor = valor;
	}
	
	
}
