package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "TipoEstadoCivil", schema = "public")
public class TipoEstadoCivil {
	@Id
	@Column
	private long idTipoEstadoCivil;
	@Column
	private String descripcion;
	
	public TipoEstadoCivil() {}

	public TipoEstadoCivil(long idTipoEstadoCivil, String descripcion) {
		super();
		this.idTipoEstadoCivil = idTipoEstadoCivil;
		this.descripcion = descripcion;
	}

	public long getIdTipoEstadoCivil() {
		return idTipoEstadoCivil;
	}

	public void setIdTipoEstadoCivil(long idTipoEstadoCivil) {
		this.idTipoEstadoCivil = idTipoEstadoCivil;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
