package POJOS;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "MedidaSeguridad", schema = "public")
public class MedidaSeguridad {
	@Id
	@Column
	private long idMedida;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMedida", nullable = true, referencedColumnName = "idMedida", 
	foreignKey=@ForeignKey(name = "fk_valorMS", value = ConstraintMode.CONSTRAINT))
	private List<ValorPorcentual> valorPorcentual;
	@Column
	private String tipoMedidaSeguridad;
	
	public MedidaSeguridad() {}

	public MedidaSeguridad(long idMedida, List<ValorPorcentual> valorPorcentual, String tipoMedidaSeguridad) {
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

	public List<ValorPorcentual> getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(List<ValorPorcentual> valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public String getTipoMedidaSeguridad() {
		return tipoMedidaSeguridad;
	}

	public void setTipoMedidaSeguridad(String tipoMedidaSeguridad) {
		this.tipoMedidaSeguridad = tipoMedidaSeguridad;
	}

	
}
