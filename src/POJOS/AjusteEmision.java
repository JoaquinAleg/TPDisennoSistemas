package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorEmision", schema = "public")
public class AjusteEmision {
	@Id
	@Column
	private long idAjusteDescuento;
	@OneToOne
	@JoinColumn(name = "idValorPorcentual", nullable = false, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_valorEmision", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual ValorPorcentual;
	@Column
	private int ajusteEmision;
	
	public AjusteEmision() {}

	public AjusteEmision(long idAjusteDescuento, ValorPorcentual valorPorcentual, int ajusteEmision) {
		super();
		this.idAjusteDescuento = idAjusteDescuento;
		ValorPorcentual = valorPorcentual;
		this.ajusteEmision = ajusteEmision;
	}

	public long getIdAjusteDescuento() {
		return idAjusteDescuento;
	}

	public void setIdAjusteDescuento(long idAjusteDescuento) {
		this.idAjusteDescuento = idAjusteDescuento;
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
