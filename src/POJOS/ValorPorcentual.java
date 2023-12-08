package POJOS;
import java.time.LocalDate;
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
	private LocalDate fechaAsignacion;
	@Column
	private LocalDate fechaModificacion;
	
	public ValorPorcentual() {}

	public ValorPorcentual(long idValorPorcentual, float valorPorcentual, LocalDate fechaAsignacion,
			LocalDate fechaModificacion) {
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

	public LocalDate getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(LocalDate fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	
	
	
	
}
