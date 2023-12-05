package POJOS;
import jakarta.persistence.*;
@Entity
@Table(name = "MedidasPoliza")
public class MedidasPoliza {
	@Id
	@ManyToOne
	@JoinColumn(name = "numeroPoliza", nullable = false, referencedColumnName = "numeroPoliza", 
	foreignKey=@ForeignKey(name = "fk_PolizaM", value = ConstraintMode.CONSTRAINT))
	private Poliza poliza;
	@Id
	@ManyToOne
	@JoinColumn(name = "idMedida", nullable = false, referencedColumnName = "idMedida", 
	foreignKey=@ForeignKey(name = "fk_MedidaP", value = ConstraintMode.CONSTRAINT))
	private MedidaSeguridad Medida;
	public MedidasPoliza() {}
	public MedidasPoliza(Poliza poliza, MedidaSeguridad medida) {
		super();
		this.poliza = poliza;
		Medida = medida;
	}
	public Poliza getPoliza() {
		return poliza;
	}
	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}
	public MedidaSeguridad getMedida() {
		return Medida;
	}
	public void setMedida(MedidaSeguridad medida) {
		Medida = medida;
	}
	
	
}
