package POJOS;
import java.util.List;

import DAOS.DAOvalorSiniestro;
import jakarta.persistence.*;

@Entity
@Table(name = "AjustePorSiniestro", schema = "public")
public class AjusteSiniestro {
	@Id
	@Column
	private long idAjusteSiniestro;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAjusteSiniestro", nullable = true, referencedColumnName = "idAjusteSiniestro", 
	foreignKey=@ForeignKey(name = "fk_valorS", value = ConstraintMode.CONSTRAINT))
	private List<ValorSiniestro> valoresSiniestro;
	@Column
	private int cantidadSiniestros;
	
	public AjusteSiniestro() {}

	
	public AjusteSiniestro(long idAjusteSiniestro, List<ValorSiniestro> valoresSiniestro, int cantidadSiniestros) {
		super();
		this.idAjusteSiniestro = idAjusteSiniestro;
		this.valoresSiniestro = valoresSiniestro;
		this.cantidadSiniestros = cantidadSiniestros;
	}


	public long getIdAjusteSiniestro() {
		return idAjusteSiniestro;
	}

	public void setIdAjusteSiniestro(long idAjusteSiniestro) {
		this.idAjusteSiniestro = idAjusteSiniestro;
	}

	
	public List<ValorSiniestro> getValorPorcentual() {
		return valoresSiniestro;
	}


	public void setValorPorcentual(ValorPorcentual valor) {
		DAOvalorSiniestro dao = new DAOvalorSiniestro();
		ValorSiniestro nuevoValor = new ValorSiniestro();
		nuevoValor.setAjuste(this);
		nuevoValor.setValor(valor);
		dao.createValorSiniestro(nuevoValor);
		this.valoresSiniestro.add(nuevoValor);
	}


	public int getCantidadSiniestros() {
		return cantidadSiniestros;
	}

	public void setCantidadSiniestros(int cantidadSiniestros) {
		this.cantidadSiniestros = cantidadSiniestros;
	}
	
	
}
