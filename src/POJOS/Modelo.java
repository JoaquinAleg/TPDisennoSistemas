package POJOS;
import java.util.List;

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
	private List<ValorPorcentual> valorPorcentual;
	@Column
	private String nombreModelo;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idModelo", nullable = false, referencedColumnName = "idModelo", 
	foreignKey=@ForeignKey(name = "fk_	", value = ConstraintMode.CONSTRAINT))
	private List<fabricado> anioFabricacion;
	
	
	public Modelo() {}


	public Modelo(long idModelo, List<ValorPorcentual> valorPorcentual, String nombreModelo,
			List<fabricado> anioFabricacion) {
		super();
		this.idModelo = idModelo;
		this.valorPorcentual = valorPorcentual;
		this.nombreModelo = nombreModelo;
		this.anioFabricacion = anioFabricacion;
	}


	public long getIdModelo() {
		return idModelo;
	}


	public void setIdModelo(long idModelo) {
		this.idModelo = idModelo;
	}


	public List<ValorPorcentual> getValorPorcentual() {
		return valorPorcentual;
	}


	public void setValorPorcentual(List<ValorPorcentual> valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
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
