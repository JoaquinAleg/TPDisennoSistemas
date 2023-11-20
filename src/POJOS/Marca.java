package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Marca", schema = "public")
public class Marca {
	@Id
	@Column
	private long idMarca;
	@OneToOne
	@JoinColumn(name = "idValorPorcentual", nullable = true, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorMarca", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valorPorcentual;
	@Column
	private String nombreMarca;
	
	public Marca() {}

	public Marca(long idMarca, ValorPorcentual valorPorcentual, String nombreMarca) {
		super();
		this.idMarca = idMarca;
		this.valorPorcentual = valorPorcentual;
		this.nombreMarca = nombreMarca;
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
