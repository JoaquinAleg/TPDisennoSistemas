package POJOS;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorKilometro", schema = "public")
public class AjusteKilometro {
	@Id
	@Column
	private long idAjusteKilometro;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAjusteKilometro", nullable = true, referencedColumnName = "idAjusteKilometro", 
	foreignKey=@ForeignKey(name = "fk_valorKilometro", value = ConstraintMode.CONSTRAINT))
	private List<ValorPorcentual> valorPorcentual;
	@Column
	private float escalaKM;
	
	public AjusteKilometro() {}

	public AjusteKilometro(long idAjusteKilometro, List<ValorPorcentual> valorPorcentual, float escalaKM) {
		super();
		this.idAjusteKilometro = idAjusteKilometro;
		this.valorPorcentual = valorPorcentual;
		this.escalaKM = escalaKM;
	}

	public long getIdAjusteKilometro() {
		return idAjusteKilometro;
	}

	public void setIdAjusteKilometro(long idAjusteKilometro) {
		this.idAjusteKilometro = idAjusteKilometro;
	}

	public List<ValorPorcentual> getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(List<ValorPorcentual> valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public float getEscalaKM() {
		return escalaKM;
	}

	public void setEscalaKM(float escalaKM) {
		this.escalaKM = escalaKM;
	}

	
	
}
