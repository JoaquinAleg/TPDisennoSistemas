package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ValorProvincia")
public class ValorProvincia {
	@Id
	@ManyToOne
	@JoinColumn(name = "idProvincia", nullable = true, referencedColumnName = "idProvincia", 
	foreignKey=@ForeignKey(name = "fk_ProvinciaV", value = ConstraintMode.CONSTRAINT))
	private Provincia Provincia;
	@Id
	@ManyToOne
	@JoinColumn(name = "idValorPorcentual", nullable = true, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorProvincia", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valor;
	
	public ValorProvincia() {}

	public ValorProvincia(Provincia Provincia, ValorPorcentual valor) {
		super();
		this.Provincia = Provincia;
		this.valor = valor;
	}

	public Provincia getAjuste() {
		return Provincia;
	}

	public void setAjuste(Provincia Provincia) {
		this.Provincia = Provincia;
	}

	public ValorPorcentual getValor() {
		return valor;
	}

	public void setValor(ValorPorcentual valor) {
		this.valor = valor;
	}
	
	
}
