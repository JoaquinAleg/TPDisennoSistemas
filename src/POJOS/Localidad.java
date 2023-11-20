package POJOS;
import jakarta.persistence.*;

@Entity
@Table(name = "Localidad", schema = "public")
public class Localidad {
	@Id
	@Column
	private long idLocalidad;
	@ManyToOne
	@JoinColumn(name = "idProvincia", nullable = false, referencedColumnName = "idProvincia", 
	foreignKey=@ForeignKey(name = "fk_Provincia", value = ConstraintMode.CONSTRAINT))
	private Provincia Provincia;
	@Column
	private int codigoPostal;
	@Column
	private String nombreLocalidad;
	
	public Localidad() {}

	public Localidad(long idLocalidad, Provincia provincia, int codigoPostal, String nombreLocalidad) {
		super();
		this.idLocalidad = idLocalidad;
		Provincia = provincia;
		this.codigoPostal = codigoPostal;
		this.nombreLocalidad = nombreLocalidad;
	}

	public long getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(long idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public Provincia getProvincia() {
		return Provincia;
	}

	public void setProvincia(Provincia provincia) {
		Provincia = provincia;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getNombreLocalidad() {
		return nombreLocalidad;
	}

	public void setNombreLocalidad(String nombreLocalidad) {
		this.nombreLocalidad = nombreLocalidad;
	}

	
}
