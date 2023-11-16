package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "PolizaHijo")
public class PolizaHijo {
	@Id
	@Column
	private long idHijo;
	@Id
	@Column
	private long numeroPoliza;
	
	public PolizaHijo() {}

	public PolizaHijo(long idHijo, long numeroPoliza) {
		super();
		this.idHijo = idHijo;
		this.numeroPoliza = numeroPoliza;
	}

	public long getIdHijo() {
		return idHijo;
	}

	public void setIdHijo(long idHijo) {
		this.idHijo = idHijo;
	}

	public long getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(long numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}
	
	
}
