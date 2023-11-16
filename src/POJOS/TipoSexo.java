package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "TipoSexo")
public class TipoSexo {
	@Id
	@Column
	private long idTipoSexo;
	@Column
	private String descripcion;
	
	public TipoSexo() {}

	public TipoSexo(long idTipoSexo, String descripcion) {
		super();
		this.idTipoSexo = idTipoSexo;
		this.descripcion = descripcion;
	}

	public long getIdTipoSexo() {
		return idTipoSexo;
	}

	public void setIdTipoSexo(long idTipoSexo) {
		this.idTipoSexo = idTipoSexo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
