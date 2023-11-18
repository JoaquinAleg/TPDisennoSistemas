package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "MedidaSeguridad", schema = "public")
public class MedidaSeguridad {
	@Id
	@Column
	private long idMedida;
	@OneToOne
	@JoinColumn(name = "idValorPorcentual", nullable = false, referencedColumnName = "idValorPorcentual", 
	foreignKey=@ForeignKey(name = "fk_valorMedida", value = ConstraintMode.CONSTRAINT))
	private ValorPorcentual valorPorcentual;
	@Column
	private String tipoMedidaSeguridad;
	
	public MedidaSeguridad() {}

	public MedidaSeguridad(long idMedida, ValorPorcentual valorPorcentual, String tipoMedidaSeguridad) {
		super();
		this.idMedida = idMedida;
		this.valorPorcentual = valorPorcentual;
		this.tipoMedidaSeguridad = tipoMedidaSeguridad;
	}

	public long getIdMedida() {
		return idMedida;
	}

	public void setIdMedida(long idMedida) {
		this.idMedida = idMedida;
	}

	public ValorPorcentual getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(ValorPorcentual valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public String getTipoMedidaSeguridad() {
		return tipoMedidaSeguridad;
	}

	public void setTipoMedidaSeguridad(String tipoMedidaSeguridad) {
		this.tipoMedidaSeguridad = tipoMedidaSeguridad;
	}

	
}
