package POJOS;
import java.util.List;

import DAOS.DAOvalorLocalidad;
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
	private List<ValorLocalidad> valoresLocalidad;
	
	public Localidad() {}

	

	public Localidad(long idLocalidad, POJOS.Provincia provincia, int codigoPostal, String nombreLocalidad,
			List<ValorLocalidad> valoresLocalidad) {
		super();
		this.idLocalidad = idLocalidad;
		Provincia = provincia;
		this.codigoPostal = codigoPostal;
		this.nombreLocalidad = nombreLocalidad;
		this.valoresLocalidad = valoresLocalidad;
	}



	public List<ValorLocalidad> getValorPorcentual() {
		return valoresLocalidad;
	}



	public void setValorPorcentual(ValorPorcentual valor) {
		DAOvalorLocalidad dao = new DAOvalorLocalidad();
		ValorLocalidad nuevoValor = new ValorLocalidad();
		nuevoValor.setAjuste(this);
		nuevoValor.setValor(valor);
		dao.createValorLocalidad(nuevoValor);
		this.valoresLocalidad.add(nuevoValor);
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
