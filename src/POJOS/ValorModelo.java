package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ValorModelo")
public class ValorModelo {
	@Id
	@ManyToOne
	@JoinColumn(name = "idModelo", nullable = true, referencedColumnName = "idModelo", 
	foreignKey=@ForeignKey(name = "fk_ModeloV", value = ConstraintMode.CONSTRAINT))
	private Modelo Modelo;
	@Id
	@ManyToOne
	@JoinColumn(name = "idValorPorcentual", nullable = true, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorModelo", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valor;
	
	public ValorModelo() {}

	public ValorModelo(Modelo Modelo, ValorPorcentual valor) {
		super();
		this.Modelo = Modelo;
		this.valor = valor;
	}

	public Modelo getAjuste() {
		return Modelo;
	}

	public void setAjuste(Modelo Modelo) {
		this.Modelo = Modelo;
	}

	public ValorPorcentual getValor() {
		return valor;
	}

	public void setValor(ValorPorcentual valor) {
		this.valor = valor;
	}
	
	
}
