package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorEmision")
public class AjusteEmision {
	@Id
	@Column
	private long idAjusteDescuento;
	@Column
	private long ValorPorcentual;
	@Column
	private int ajusteEmision;
	
	public AjusteEmision() {}

	public AjusteEmision(long idAjusteDescuento, long valorPorcentual, int ajusteEmision) {
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

	public long getValorPorcentual() {
		return ValorPorcentual;
	}

	public void setValorPorcentual(long valorPorcentual) {
		ValorPorcentual = valorPorcentual;
	}

	public int getAjusteEmision() {
		return ajusteEmision;
	}

	public void setAjusteEmision(int ajusteEmision) {
		this.ajusteEmision = ajusteEmision;
	}
	
}
