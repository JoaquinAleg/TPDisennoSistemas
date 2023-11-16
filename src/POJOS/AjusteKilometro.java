package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorKilometro")
public class AjusteKilometro {
	@Id
	@Column
	private long idAjusteKilometro;
	@Column
	private long valorPorcentual;
	@Column
	private float escalaKM;
	
	public AjusteKilometro() {}

	public AjusteKilometro(long idAjusteKilometro, long valorPorcentual, float escalaKM) {
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

	public long getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(long valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public float getEscalaKM() {
		return escalaKM;
	}

	public void setEscalaKM(float escalaKM) {
		this.escalaKM = escalaKM;
	}
	
}
