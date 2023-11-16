package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorSiniestro")
public class AjusteSiniestro {
	@Id
	@Column
	private long idAjusteSiniestro;
	@Column
	private long valorPorcentual;
	@Column
	private int cantidadSiniestros;
	
	public AjusteSiniestro() {}

	public AjusteSiniestro(long idAjusteSiniestro, long valorPorcentual, int cantidadSiniestros) {
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

	public long getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(long valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public int getCantidadSiniestros() {
		return cantidadSiniestros;
	}

	public void setCantidadSiniestros(int cantidadSiniestros) {
		this.cantidadSiniestros = cantidadSiniestros;
	}
	
	
}
