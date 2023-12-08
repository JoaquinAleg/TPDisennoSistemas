package POJOS;
import java.util.List;

import DAOS.DAOvalorCobertura;
import jakarta.persistence.*;

@Entity
@Table(name = "Cobertura", schema = "public")
public class Cobertura {
	@Id
	@Column
	private long idCobertura;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCobertura", nullable = true, referencedColumnName = "idCobertura", 
	foreignKey=@ForeignKey(name = "fk_valorC", value = ConstraintMode.CONSTRAINT))
	private List<ValorCobertura> valoresCobertura;
	@Column
	private String descripcion;
	
	public Cobertura() {}

	public Cobertura(long idCobertura, List<ValorCobertura> valoresCobertura, String descripcion) {
		super();
		this.idCobertura = idCobertura;
		this.valoresCobertura = valoresCobertura;
		this.descripcion = descripcion;
	}

	public long getIdCobertura() {
		return idCobertura;
	}

	public void setIdCobertura(long idCobertura) {
		this.idCobertura = idCobertura;
	}

	public List<ValorCobertura> getValorPorcentual() {
		return valoresCobertura;
	}

	public void setValorPorcentual(ValorPorcentual valor) {
		DAOvalorCobertura dao = new DAOvalorCobertura();
		ValorCobertura nuevoValor = new ValorCobertura();
		nuevoValor.setAjuste(this);
		nuevoValor.setValor(valor);
		dao.createValorCobertura(nuevoValor);
		this.valoresCobertura.add(nuevoValor);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
}
