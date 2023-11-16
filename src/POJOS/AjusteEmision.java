package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorEmision", schema = "public")
public class AjusteEmision {
	@Id
	@Column
	private long idAjusteEmision;
	@OneToOne
	@JoinColumn(name = "idValorPorcentual", nullable = false, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_valorEmision", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual ValorPorcentual;
	@Column
	private int ajusteEmision;
	
	public AjusteEmision() {}

	public AjusteEmision(long idAjusteDescuento, ValorPorcentual valorPorcentual, int ajusteEmision) {
		super();
		this.idAjusteEmision = idAjusteDescuento;
		ValorPorcentual = valorPorcentual;
		this.ajusteEmision = ajusteEmision;
	}

	public long getIdAjusteDescuento() {
		return idAjusteEmision;
	}

	public void setIdAjusteDescuento(long idAjusteDescuento) {
		this.idAjusteEmision = idAjusteDescuento;
	}

	public ValorPorcentual getValorPorcentual() {
		return ValorPorcentual;
	}

	public void setValorPorcentual(ValorPorcentual valorPorcentual) {
		ValorPorcentual = valorPorcentual;
	}

	public int getAjusteEmision() {
		return ajusteEmision;
	}

	public void setAjusteEmision(int ajusteEmision) {
		this.ajusteEmision = ajusteEmision;
	}
	
}
