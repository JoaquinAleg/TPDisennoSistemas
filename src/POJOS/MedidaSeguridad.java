package POJOS;
import java.util.List;

import DAOS.DAOvalorMedida;
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
	private List<ValorMedida> valoresMedida;
	@Column
	private String tipoMedidaSeguridad;
	
	public MedidaSeguridad() {}

	public MedidaSeguridad(long idMedida, List<ValorMedida> valoresMedida, String tipoMedidaSeguridad) {
		super();
		this.idMedida = idMedida;
		this.valoresMedida = valoresMedida;
		this.tipoMedidaSeguridad = tipoMedidaSeguridad;
	}

	public long getIdMedida() {
		return idMedida;
	}

	public void setIdMedida(long idMedida) {
		this.idMedida = idMedida;
	}

	public List<ValorMedida> getValorPorcentual() {
		return valoresMedida;
	}

	public void setValorPorcentual(ValorPorcentual valor) {
		DAOvalorMedida dao = new DAOvalorMedida();
		ValorMedida nuevoValor = new ValorMedida();
		nuevoValor.setAjuste(this);
		nuevoValor.setValor(valor);
		dao.createValorMedida(nuevoValor);
		this.valoresMedida.add(nuevoValor);
	}

	public String getTipoMedidaSeguridad() {
		return tipoMedidaSeguridad;
	}

	public void setTipoMedidaSeguridad(String tipoMedidaSeguridad) {
		this.tipoMedidaSeguridad = tipoMedidaSeguridad;
	}

	
}
