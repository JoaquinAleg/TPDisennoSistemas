package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "ValorLocalidad")
public class ValorLocalidad {
	@Id
	@ManyToOne
	@JoinColumn(name = "idLocalidad", nullable = true, referencedColumnName = "idLocalidad", 
	foreignKey=@ForeignKey(name = "fk_LocalidadV", value = ConstraintMode.CONSTRAINT))
	private Localidad Localidad;
	@Id
	@ManyToOne
	@JoinColumn(name = "idValorPorcentual", nullable = true, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_ValorLocalidad", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valor;
	
	public ValorLocalidad() {}

	public ValorLocalidad(Localidad Localidad, ValorPorcentual valor) {
		super();
		this.Localidad = Localidad;
		this.valor = valor;
	}

	public Localidad getAjuste() {
		return Localidad;
	}

	public void setAjuste(Localidad Localidad) {
		this.Localidad = Localidad;
	}

	public ValorPorcentual getValor() {
		return valor;
	}

	public void setValor(ValorPorcentual valor) {
		this.valor = valor;
	}
	
	
}
