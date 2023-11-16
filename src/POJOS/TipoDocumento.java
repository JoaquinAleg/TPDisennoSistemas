package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "TipoDocumento", schema = "public")
public class TipoDocumento {
	@Id
	@Column
	private long idTipoDocumento;
	@Column
	private String descripcion;
	
	public TipoDocumento() {}

	public TipoDocumento(long idTipoDocumento, String descripcion) {
		super();
		this.idTipoDocumento = idTipoDocumento;
		this.descripcion = descripcion;
	}

	public long getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(long idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
