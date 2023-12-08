package POJOS;
import java.util.List;

import DAOS.DAOvalorModelo;
import jakarta.persistence.*;

@Entity
@Table(name = "ModeloVehiculo", schema = "public")
public class Modelo {
	@Id
	@Column
	private long idModelo;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idModelo", nullable = true, referencedColumnName = "idModelo", 
	foreignKey=@ForeignKey(name = "fk_valorMd", value = ConstraintMode.CONSTRAINT))
	private List<ValorModelo> valoresModelo;
	@Column
	private String nombreModelo;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idModelo", nullable = false, referencedColumnName = "idModelo", 
	foreignKey=@ForeignKey(name = "fk_	", value = ConstraintMode.CONSTRAINT))
	private List<fabricado> anioFabricacion;
	
	
	public Modelo() {}


	public Modelo(long idModelo, List<ValorModelo> valoresModelo, String nombreModelo,
			List<fabricado> anioFabricacion) {
		super();
		this.idModelo = idModelo;
		this.valoresModelo = valoresModelo;
		this.nombreModelo = nombreModelo;
		this.anioFabricacion = anioFabricacion;
	}


	public long getIdModelo() {
		return idModelo;
	}


	public void setIdModelo(long idModelo) {
		this.idModelo = idModelo;
	}


	public List<ValorModelo> getValorPorcentual() {
		return valoresModelo;
	}


	public void setValorPorcentual(ValorPorcentual valor) {
		DAOvalorModelo dao = new DAOvalorModelo();
		ValorModelo nuevoValor = new ValorModelo();
		nuevoValor.setAjuste(this);
		nuevoValor.setValor(valor);
		dao.createValorModelo(nuevoValor);
		this.valoresModelo.add(nuevoValor);
	}


	public String getNombreModelo() {
		return nombreModelo;
	}


	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}


	public List<fabricado> getAnioFabricacion() {
		return anioFabricacion;
	}


	public void setAnioFabricacion(List<fabricado> anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	

	


	
	
}
