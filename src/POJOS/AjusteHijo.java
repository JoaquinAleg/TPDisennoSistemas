package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ajusteHijo", schema = "public")
public class AjusteHijo {
	@Id
	@Column
	private long idAjusteHijo;
	@OneToOne
	@JoinColumn(name = "idValorPorcentual", nullable = false, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_valorHijo", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual ValorPocentual;
	@Column
	private int cantHijos;
	
	public AjusteHijo() {}

	public AjusteHijo(long idAjusteHijo, ValorPorcentual valorPocentual, int cantHijos) {
		super();
		this.idAjusteHijo = idAjusteHijo;
		ValorPocentual = valorPocentual;
		this.cantHijos = cantHijos;
	}

	public long getIdAjusteHijo() {
		return idAjusteHijo;
	}

	public void setIdAjusteHijo(long idAjusteHijo) {
		this.idAjusteHijo = idAjusteHijo;
	}

	public ValorPorcentual getValorPocentual() {
		return ValorPocentual;
	}

	public void setValorPocentual(ValorPorcentual valorPocentual) {
		ValorPocentual = valorPocentual;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	
}
