package POJOS;
import java.util.List;

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
	private List<ValorPorcentual> valorPorcentual;
	@Column
	private int ajusteEmision;
	
	public AjusteEmision() {}

	public AjusteEmision(long idAjusteEmision, List<POJOS.ValorPorcentual> valorPorcentual, int ajusteEmision) {
		super();
		this.idAjusteEmision = idAjusteEmision;
		this.valorPorcentual = valorPorcentual;
		this.ajusteEmision = ajusteEmision;
	}

	public long getIdAjusteEmision() {
		return idAjusteEmision;
	}

	public void setIdAjusteEmision(long idAjusteEmision) {
		this.idAjusteEmision = idAjusteEmision;
	}

	public List<ValorPorcentual> getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(List<ValorPorcentual> valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}



	public int getAjusteEmision() {
		return ajusteEmision;
	}

	public void setAjusteEmision(int ajusteEmision) {
		this.ajusteEmision = ajusteEmision;
	}

	
}
