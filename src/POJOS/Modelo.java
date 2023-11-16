package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ModeloVehiculo", schema = "public")
public class Modelo {
	@Id
	@Column
	private long idModelo;
	@Column
	private long idMarca;
	@Column
	private long valorPorcentual;
	@Column
	private String nombreModelo;
	
	public Modelo() {}

	public Modelo(long idModelo, long idMarca, long valorPorcentual, String nombreModelo) {
		super();
		this.idModelo = idModelo;
		this.idMarca = idMarca;
		this.valorPorcentual = valorPorcentual;
		this.nombreModelo = nombreModelo;
	}

	public long getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(long idModelo) {
		this.idModelo = idModelo;
	}

	public long getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(long idMarca) {
		this.idMarca = idMarca;
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
