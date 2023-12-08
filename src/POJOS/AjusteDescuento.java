package POJOS;
import java.util.List;

import DAOS.DAOvalorDescuento;
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
	private List<ValorDescuento> valoresDescuento;
	@Column
	private float ajusteDescuento;
	
	public AjusteDescuento() {}

	public AjusteDescuento(long idAjusteDescuento, List<ValorDescuento> valoresDescuento, float ajusteDescuento) {
		super();
		this.idAjusteDescuento = idAjusteDescuento;
		this.valoresDescuento = valoresDescuento;
		this.ajusteDescuento = ajusteDescuento;
	}

	public long getIdAjusteDescuento() {
		return idAjusteDescuento;
	}

	public void setIdAjusteDescuento(long idAjusteDescuento) {
		this.idAjusteDescuento = idAjusteDescuento;
	}

	public List<ValorDescuento> getValorPorcentual() {
		return valoresDescuento;
	}

	public void setValorPorcentual(ValorPorcentual valor) {
		DAOvalorDescuento dao = new DAOvalorDescuento();
		ValorDescuento nuevoValor = new ValorDescuento();
		nuevoValor.setAjuste(this);
		nuevoValor.setValor(valor);
		dao.createValorDescuento(nuevoValor);
		this.valoresDescuento.add(nuevoValor);
	}

	public float getAjusteDescuento() {
		return ajusteDescuento;
	}

	public void setAjusteDescuento(float ajusteDescuento) {
		this.ajusteDescuento = ajusteDescuento;
	}

	
	
}
