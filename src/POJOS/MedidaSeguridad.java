package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "MedidaSeguridad", schema = "public")
public class MedidaSeguridad {
	@Id
	@Column
	private long idMedida;
	@Column
	private long ValorPorcentual;
	@Column
	private String tipoMedidaSeguridad;
	
	public MedidaSeguridad() {}

	public MedidaSeguridad(long idMedida, long valorPorcentual, String tipoMedidaSeguridad) {
		super();
		this.idMedida = idMedida;
		ValorPorcentual = valorPorcentual;
		this.tipoMedidaSeguridad = tipoMedidaSeguridad;
	}

	public long getIdMedida() {
		return idMedida;
	}

	public void setIdMedida(long idMedida) {
		this.idMedida = idMedida;
	}

	public long getValorPorcentual() {
		return ValorPorcentual;
	}

	public void setValorPorcentual(long valorPorcentual) {
		ValorPorcentual = valorPorcentual;
	}

	public String getTipoMedidaSeguridad() {
		return tipoMedidaSeguridad;
	}

	public void setTipoMedidaSeguridad(String tipoMedidaSeguridad) {
		this.tipoMedidaSeguridad = tipoMedidaSeguridad;
	}
	
}
