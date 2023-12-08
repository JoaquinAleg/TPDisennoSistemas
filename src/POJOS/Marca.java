package POJOS;
import java.util.List;

import DAOS.DAOvalorMarca;
import jakarta.persistence.*;

@Entity
@Table(name = "Marca", schema = "public")
public class Marca {
	@Id
	@Column
	private long idMarca;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMarca", nullable = true, referencedColumnName = "idMarca", 
	foreignKey=@ForeignKey(name = "fk_valorMa", value = ConstraintMode.CONSTRAINT))
	private List<ValorMarca> valoresMarca;
	@Column
	private String nombreMarca;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMarca", nullable = true, referencedColumnName = "idMarca", 
	foreignKey=@ForeignKey(name = "fk_ModelosMarca", value = ConstraintMode.CONSTRAINT))
	private List<Modelo> modelos;
	public Marca() {}
	public Marca(long idMarca, List<ValorMarca> valoresMarca, String nombreMarca, List<Modelo> modelos) {
		super();
		this.idMarca = idMarca;
		this.valoresMarca = valoresMarca;
		this.nombreMarca = nombreMarca;
		this.modelos = modelos;
	}
	public long getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(long idMarca) {
		this.idMarca = idMarca;
	}
	public List<ValorMarca> getValorPorcentual() {
		return valoresMarca;
	}
	public void setValorPorcentual(ValorPorcentual valor) {
		DAOvalorMarca dao = new DAOvalorMarca();
		ValorMarca nuevoValor = new ValorMarca();
		nuevoValor.setAjuste(this);
		nuevoValor.setValor(valor);
		dao.createValorMarca(nuevoValor);
		this.valoresMarca.add(nuevoValor);
	}
	public String getNombreMarca() {
		return nombreMarca;
	}
	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}
	public List<Modelo> getModelos() {
		return modelos;
	}
	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}

	

	
}
