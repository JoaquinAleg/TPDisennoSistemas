package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorKilometro", schema = "public")
public class AjusteKilometro {
	@Id
	@Column
	private long idAjusteKilometro;
	@OneToOne
	@JoinColumn(name = "idValorPorcentual", nullable = false, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_valorKilometro", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valorPorcentual;
	@Column
	private float escalaKM;
	
	public AjusteKilometro() {}

	public AjusteKilometro(long idAjusteKilometro, ValorPorcentual valorPorcentual, float escalaKM) {
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

	public ValorPorcentual getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(ValorPorcentual valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public float getEscalaKM() {
		return escalaKM;
	}

	public void setEscalaKM(float escalaKM) {
		this.escalaKM = escalaKM;
	}

	
}
