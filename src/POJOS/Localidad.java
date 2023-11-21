package POJOS;
import java.util.List;

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
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLocalidad", nullable = true, referencedColumnName = "idLocalidad", 
	foreignKey=@ForeignKey(name = "fk_valorL", value = ConstraintMode.CONSTRAINT))
	private List<ValorPorcentual> valorPorcentual;
	
	public Localidad() {}

	

	public Localidad(long idLocalidad, POJOS.Provincia provincia, int codigoPostal, String nombreLocalidad,
			List<ValorPorcentual> valorPorcentual) {
		super();
		this.idLocalidad = idLocalidad;
		Provincia = provincia;
		this.codigoPostal = codigoPostal;
		this.nombreLocalidad = nombreLocalidad;
		this.valorPorcentual = valorPorcentual;
	}



	public List<ValorPorcentual> getValorPorcentual() {
		return valorPorcentual;
	}



	public void setValorPorcentual(List<ValorPorcentual> valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
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
