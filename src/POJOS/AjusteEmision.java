package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorEmision")
public class AjusteEmision {
	@Id
	@Column
	private long idAjusteDescuento;
	@OneToOne(optional = false)
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
