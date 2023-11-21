package POJOS;
import java.util.List;

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
	private List<ValorPorcentual> valorPorcentual;
	@Column
	private int cantHijos;
	
	public AjusteHijo() {}

	public AjusteHijo(long idAjusteHijo, List<ValorPorcentual> valorPorcentual, int cantHijos) {
		super();
		this.idAjusteHijo = idAjusteHijo;
		this.valorPorcentual = valorPorcentual;
		this.cantHijos = cantHijos;
	}

	public long getIdAjusteHijo() {
		return idAjusteHijo;
	}

	public void setIdAjusteHijo(long idAjusteHijo) {
		this.idAjusteHijo = idAjusteHijo;
	}

	public List<ValorPorcentual> getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(List<ValorPorcentual> valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	
}
