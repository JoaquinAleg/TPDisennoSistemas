package POJOS;
import java.util.List;

import DAOS.DAOvalorKilometro;
import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorKilometro", schema = "public")
public class AjusteKilometro {
	@Id
	@Column
	private long idAjusteKilometro;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAjusteKilometro", nullable = true, referencedColumnName = "idAjusteKilometro", 
	foreignKey=@ForeignKey(name = "fk_valorKm", value = ConstraintMode.CONSTRAINT))
	private List<ValorKilometro> valoresKilometro;
	@Column
	private float escalaKM;
	
	public AjusteKilometro() {}

	public AjusteKilometro(long idAjusteKilometro, List<ValorKilometro> valoresKilometro, float escalaKM) {
		super();
		this.idAjusteKilometro = idAjusteKilometro;
		this.valoresKilometro = valoresKilometro;
		this.escalaKM = escalaKM;
	}

	public long getIdAjusteKilometro() {
		return idAjusteKilometro;
	}

	public void setIdAjusteKilometro(long idAjusteKilometro) {
		this.idAjusteKilometro = idAjusteKilometro;
	}

	public List<ValorKilometro> getValorPorcentual() {
		return valoresKilometro;
	}

	public void setValorPorcentual(ValorPorcentual valor) {
		DAOvalorKilometro dao = new DAOvalorKilometro();
		ValorKilometro nuevoValor = new ValorKilometro();
		nuevoValor.setAjuste(this);
		nuevoValor.setValor(valor);
		dao.createValorKilometro(nuevoValor);
		this.valoresKilometro.add(nuevoValor);
	}

	public float getEscalaKM() {
		return escalaKM;
	}

	public void setEscalaKM(float escalaKM) {
		this.escalaKM = escalaKM;
	}

	
	
}
