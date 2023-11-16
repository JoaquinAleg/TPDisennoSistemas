package POJOS;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "ValorPorcentual", schema = "public")
public class ValorPorcentual {
	@Id
	@Column
	private long idValorPorcentual;
	@Column
	private float valorPorcentual;
	@Column
	private Date fechaAsignacion;
	@Column
	private Date fechaModificacion;
	
	public ValorPorcentual() {}

	public ValorPorcentual(long idValorPorcentual, float valorPorcentual, Date fechaAsignacion,
			Date fechaModificacion) {
		super();
		this.idValorPorcentual = idValorPorcentual;
		this.valorPorcentual = valorPorcentual;
		this.fechaAsignacion = fechaAsignacion;
		this.fechaModificacion = fechaModificacion;
	}

	public long getIdValorPorcentual() {
		return idValorPorcentual;
	}

	public void setIdValorPorcentual(long idValorPorcentual) {
		this.idValorPorcentual = idValorPorcentual;
	}

	public float getValorPorcentual() {
		return valorPorcentual;
	}

	public void setValorPorcentual(float valorPorcentual) {
		this.valorPorcentual = valorPorcentual;
	}

	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	
	
}
