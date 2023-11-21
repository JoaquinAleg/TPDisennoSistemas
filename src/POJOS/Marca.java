package POJOS;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Marca", schema = "public")
public class Marca {
	@Id
	@Column
	private long idMarca;
	@ManyToOne
	@JoinColumn(name = "idValorPorcentual", nullable = true, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorMarca", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valorPorcentual;
	@Column
	private String nombreMarca;
	@OneToMany
	@JoinColumn(name = "idMarca", nullable = true, referencedColumnName = "idMarca", 
	foreignKey=@ForeignKey(name = "fk_ModelosMarca", value = ConstraintMode.CONSTRAINT))
	private List<Modelo> modelos;
	public Marca() {}

	

	public Marca(long idMarca, ValorPorcentual valorPorcentual, String nombreMarca, List<Modelo> modelos) {
		super();
		this.idMarca = idMarca;
		this.valorPorcentual = valorPorcentual;
		this.nombreMarca = nombreMarca;
		this.modelos = modelos;
	}

	

	public List<Modelo> getModelos() {
		return modelos;
	}



	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}



	public long getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(long idMarca) {
		this.idMarca = idMarca;
	}

	public ValorPorcentual getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(ValorPorcentual valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	
}
