package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorSiniestro")
public class AjusteSiniestro {
	@Id
	@Column
	private long idAjusteSiniestro;
	@OneToOne(optional = false)
	private ValorPorcentual valorPorcentual;
	@Column
	private int cantidadSiniestros;
	
	public AjusteSiniestro() {}

	public AjusteSiniestro(long idAjusteSiniestro, ValorPorcentual valorPorcentual, int cantidadSiniestros) {
		super();
		this.idAjusteSiniestro = idAjusteSiniestro;
		this.valorPorcentual = valorPorcentual;
		this.cantidadSiniestros = cantidadSiniestros;
	}

	public long getIdAjusteSiniestro() {
		return idAjusteSiniestro;
	}

	public void setIdAjusteSiniestro(long idAjusteSiniestro) {
		this.idAjusteSiniestro = idAjusteSiniestro;
	}

	public ValorPorcentual getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(ValorPorcentual valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public int getCantidadSiniestros() {
		return cantidadSiniestros;
	}

	public void setCantidadSiniestros(int cantidadSiniestros) {
		this.cantidadSiniestros = cantidadSiniestros;
	}
	
	
}
