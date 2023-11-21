package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "TipoCondicionCliente", schema = "public")
public class TipoCondicionCliente {
	@Id
	@Column
	private long idTipoCondicionCliente;
	@Column
	private String descripcion;
	
	public TipoCondicionCliente() {};
	
	public TipoCondicionCliente(long idTipoCondicionCliente, String descripcion) {
		super();
		this.idTipoCondicionCliente = idTipoCondicionCliente;
		this.descripcion = descripcion;
	}
	public long getIdTipoCondicionCliente() {
		return idTipoCondicionCliente;
	}
	public void setIdTipoCondicionCliente(long idTipoCondicionCliente) {
		this.idTipoCondicionCliente = idTipoCondicionCliente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
