package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "TipoFormaPago", schema = "public")
public class TipoFormaPago {
	@Id
	@Column
	private long idFormaPago;
	@Column
	private String descripcion;
	
	public TipoFormaPago() {}

	public TipoFormaPago(long idFormaPago, String descripcion) {
		super();
		this.idFormaPago = idFormaPago;
		this.descripcion = descripcion;
	}

	public long getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(long idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
