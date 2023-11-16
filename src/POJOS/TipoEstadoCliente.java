package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "TipoEstadoCliente")
public class TipoEstadoCliente {
	@Id
	@Column
	private long idTipoEstadoCliente;
	@Column
	private String Descripcion;
	
	public TipoEstadoCliente() {}

	public TipoEstadoCliente(long idTipoEstadoCliente, String descripcion) {
		super();
		this.idTipoEstadoCliente = idTipoEstadoCliente;
		Descripcion = descripcion;
	}

	public long getIdTipoEstadoCliente() {
		return idTipoEstadoCliente;
	}

	public void setIdTipoEstadoCliente(long idTipoEstadoCliente) {
		this.idTipoEstadoCliente = idTipoEstadoCliente;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
}
