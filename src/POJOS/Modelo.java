package POJOS;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "ModeloVehiculo", schema = "public")
public class Modelo {
	@Id
	@Column
	private long idModelo;
	@ManyToOne
	@JoinColumn(name = "idMarca", nullable = false, referencedColumnName = "idMarca", 
	foreignKey=@ForeignKey(name = "fk_ReciboCuota", value = ConstraintMode.CONSTRAINT))
	private Marca Marca;
	@Column
	private long valorPorcentual;
	@Column
	private String nombreModelo;
	@OneToMany
	@JoinColumn(name = "idModelo", nullable = false, referencedColumnName = "idModelo", 
	foreignKey=@ForeignKey(name = "fk_	", value = ConstraintMode.CONSTRAINT))
	private List<fabricado> anioFabricacion;
	
	
	public Modelo() {}

	

	


	public Modelo(long idModelo, POJOS.Marca marca, long valorPorcentual, String nombreModelo,
			List<fabricado> anioFabricacion) {
		super();
		this.idModelo = idModelo;
		Marca = marca;
		this.valorPorcentual = valorPorcentual;
		this.nombreModelo = nombreModelo;
		this.anioFabricacion = anioFabricacion;
	}






	public List<fabricado> getAnioFabricacion() {
		return anioFabricacion;
	}






	public void setAnioFabricacion(List<fabricado> anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}






	public Marca getMarca() {
		return Marca;
	}



	public void setMarca(Marca marca) {
		Marca = marca;
	}



	public long getIdModelo() {
		return idModelo;
	}



	public void setIdModelo(long idModelo) {
		this.idModelo = idModelo;
	}


	public long getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(long valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public String getNombreModelo() {
		return nombreModelo;
	}

	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}
	
	
}
