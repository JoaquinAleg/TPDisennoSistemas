package POJOS;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorDescuentoUnidadAd", schema = "public")
public class AjusteDescuento {
	@Id
	@Column
	private long idAjusteDescuento;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAjusteDescuento", nullable = true, referencedColumnName = "idAjusteDescuento", 
	foreignKey=@ForeignKey(name = "fk_valorDesc", value = ConstraintMode.CONSTRAINT))
	private List<ValorPorcentual> valorPorcentual;
	@Column
	private float ajusteDescuento;
	
	public AjusteDescuento() {}

	public AjusteDescuento(long idAjusteDescuento, List<ValorPorcentual> valorPorcentual, float ajusteDescuento) {
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

	public List<ValorPorcentual> getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(List<ValorPorcentual> valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public float getAjusteDescuento() {
		return ajusteDescuento;
	}

	public void setAjusteDescuento(float ajusteDescuento) {
		this.ajusteDescuento = ajusteDescuento;
	}

	
	
}
