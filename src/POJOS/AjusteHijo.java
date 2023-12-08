package POJOS;
import java.util.List;

import DAOS.DAOvalorHijo;
import jakarta.persistence.*;

@Entity
@Table(name = "ajusteHijo", schema = "public")
public class AjusteHijo {
	@Id
	@Column
	private long idAjusteHijo;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAjusteHijo", nullable = true, referencedColumnName = "idAjusteHijo", 
	foreignKey=@ForeignKey(name = "fk_valorH", value = ConstraintMode.CONSTRAINT))
	private List<ValorHijo> valoresHijo;
	@Column
	private int cantHijos;
	
	public AjusteHijo() {}

	public AjusteHijo(long idAjusteHijo, List<ValorHijo> valoresHijo, int cantHijos) {
		super();
		this.idAjusteHijo = idAjusteHijo;
		this.valoresHijo = valoresHijo;
		this.cantHijos = cantHijos;
	}

	public long getIdAjusteHijo() {
		return idAjusteHijo;
	}

	public void setIdAjusteHijo(long idAjusteHijo) {
		this.idAjusteHijo = idAjusteHijo;
	}

	public List<ValorHijo> getValorPorcentual() {
		return valoresHijo;
	}

	public void setValorPorcentual(ValorPorcentual valor) {
		DAOvalorHijo dao = new DAOvalorHijo();
		ValorHijo nuevoValor = new ValorHijo();
		nuevoValor.setAjuste(this);
		nuevoValor.setValor(valor);
		dao.createValorHijo(nuevoValor);
		this.valoresHijo.add(nuevoValor);
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	
}
