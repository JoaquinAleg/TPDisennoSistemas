package POJOS;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorSiniestro", schema = "public")
public class AjusteSiniestro {
	@Id
	@Column
	private long idAjusteSiniestro;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAjusteSiniestro", nullable = true, referencedColumnName = "idAjusteSiniestro", 
	foreignKey=@ForeignKey(name = "fk_valorSiniestro", value = ConstraintMode.CONSTRAINT))
	private List<ValorPorcentual> valorPorcentual;
	@Column
	private int cantidadSiniestros;
	
	public AjusteSiniestro() {}

	
	public AjusteSiniestro(long idAjusteSiniestro, List<ValorPorcentual> valorPorcentual, int cantidadSiniestros) {
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

	
	public List<ValorPorcentual> getValorPorcentual() {
		return valorPorcentual;
	}


	public void setValorPorcentual(List<ValorPorcentual> valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}


	public int getCantidadSiniestros() {
		return cantidadSiniestros;
	}

	public void setCantidadSiniestros(int cantidadSiniestros) {
		this.cantidadSiniestros = cantidadSiniestros;
	}
	
	
}
