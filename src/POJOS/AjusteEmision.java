package POJOS;
import java.util.List;

import DAOS.DAOvalorEmision;
import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorEmision", schema = "public")
public class AjusteEmision {
	@Id
	@Column
	private long idAjusteEmision;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAjusteEmision", nullable = true, referencedColumnName = "idAjusteEmision", 
	foreignKey=@ForeignKey(name = "fk_valorEm", value = ConstraintMode.CONSTRAINT))
	private List<ValorEmision> valoresEmision;
	@Column
	private int ajusteEmision;
	
	public AjusteEmision() {}

	public AjusteEmision(long idAjusteEmision, List<ValorEmision> valoresEmision, int ajusteEmision) {
		super();
		this.idAjusteEmision = idAjusteEmision;
		this.valoresEmision = valoresEmision;
		this.ajusteEmision = ajusteEmision;
	}

	public long getIdAjusteEmision() {
		return idAjusteEmision;
	}

	public void setIdAjusteEmision(long idAjusteEmision) {
		this.idAjusteEmision = idAjusteEmision;
	}

	public List<ValorEmision> getValorPorcentual() {
		return valoresEmision;
	}

	public void setValorPorcentual(ValorPorcentual valor) {
		DAOvalorEmision dao = new DAOvalorEmision();
		ValorEmision nuevoValor = new ValorEmision();
		nuevoValor.setAjuste(this);
		nuevoValor.setValor(valor);
		dao.createValorEmision(nuevoValor);
		this.valoresEmision.add(nuevoValor);
	}



	public int getAjusteEmision() {
		return ajusteEmision;
	}

	public void setAjusteEmision(int ajusteEmision) {
		this.ajusteEmision = ajusteEmision;
	}

	
}
