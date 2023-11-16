package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorDescuentoUnidadAd")
public class AjusteDescuento {
	@Id
	@Column
	private long idAjusteDescuento;
	@Column
	private long valorPorcentual;
	@Column
	private float ajusteDescuento;
	
	public AjusteDescuento() {}

	public AjusteDescuento(long idAjusteDescuento, int valorPorcentual, float ajusteDescuento) {
		super();
		this.idAjusteDescuento = idAjusteDescuento;
		this.valorPorcentual = valorPorcentual;
		this.ajusteDescuento = ajusteDescuento;
	}

	public long getIdAjusteDescuento() {
		return idAjusteDescuento;
	}

	public void setIdAjusteDescuento(long idAjusteDescuento) {
		this.idAjusteDescuento = idAjusteDescuento;
	}

	public long getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(int valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public float getAjusteDescuento() {
		return ajusteDescuento;
	}

	public void setAjusteDescuento(float ajusteDescuento) {
		this.ajusteDescuento = ajusteDescuento;
	}
	
}
