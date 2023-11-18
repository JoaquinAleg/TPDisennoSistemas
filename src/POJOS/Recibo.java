package POJOS;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Recibo", schema = "public")
public class Recibo {
	@Id
	@Column
	private long idNroRecibo;
	@Column
	private String descripcion;
	@Column
	private Date fechaRecibo;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idNroRecibo", nullable = false, referencedColumnName = "idNroRecibo", 
	foreignKey=@ForeignKey(name = "fk_Coutas", value = ConstraintMode.CONSTRAINT))
	private List<Cuota> cuotas;
	
	public Recibo() {}

	public Recibo(long idNroRecibo, long idPago, String descripcion, Date fechaRecibo) {
		super();
		this.idNroRecibo = idNroRecibo;
		this.descripcion = descripcion;
		this.fechaRecibo = fechaRecibo;
	}

	public long getIdNroRecibo() {
		return idNroRecibo;
	}

	public void setIdNroRecibo(long idNroRecibo) {
		this.idNroRecibo = idNroRecibo;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaRecibo() {
		return fechaRecibo;
	}

	public void setFechaRecibo(Date fechaRecibo) {
		this.fechaRecibo = fechaRecibo;
	}
	
}
