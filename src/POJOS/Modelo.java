package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ModeloVehiculo", schema = "public")
public class Modelo {
	@Id
	@Column
	private long idModelo;
	@ManyToOne
	@JoinColumn(name = "idMarca", nullable = false, referencedColumnName = "idMarca", 
	foreignKey=@ForeignKey(name = "fk_ModeloMarca", value = ConstraintMode.CONSTRAINT))
	private Marca marca;
	@OneToOne
	@JoinColumn(name = "idValorPorcentual", nullable = false, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorPorcentualModelo", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valorPorcentual;
	@Column
	private String nombreModelo;
	
	public Modelo() {}

	public Modelo(long idModelo, Marca marca, ValorPorcentual valorPorcentual, String nombreModelo) {
		super();
		this.idModelo = idModelo;
		this.marca = marca;
		this.valorPorcentual = valorPorcentual;
		this.nombreModelo = nombreModelo;
	}

	public long getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(long idModelo) {
		this.idModelo = idModelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public ValorPorcentual getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(ValorPorcentual valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public String getNombreModelo() {
		return nombreModelo;
	}

	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}

	
	
}
