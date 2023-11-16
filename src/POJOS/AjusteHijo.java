package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ajusteHijo")
public class AjusteHijo {
	@Id
	@Column
	private long idAjusteHijo;
	@Column
	private long ValorPocentual;
	@Column
	private int cantHijos;
	
	public AjusteHijo() {}

	public AjusteHijo(long idAjusteHijo, long valorPocentual, int cantHijos) {
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

	public long getValorPocentual() {
		return ValorPocentual;
	}

	public void setValorPocentual(long valorPocentual) {
		ValorPocentual = valorPocentual;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	
}
