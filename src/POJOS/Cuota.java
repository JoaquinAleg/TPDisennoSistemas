package POJOS;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Cuota", schema = "public")
public class Cuota {
	@Id
	@Column
	private long idPago;
	@ManyToOne
	@JoinColumn(name = "numeroPoliza", nullable = false, referencedColumnName = "numeroPoliza", 
	foreignKey=@ForeignKey(name = "fk_PolizaCuota", value = ConstraintMode.CONSTRAINT))
	private Poliza poliza;
	@Column
	private Date fechaPago;
	@Column
	private int nroCuota;
	@Column
	private float montoCuota;
	@Column
	private float montoMora;
	@Column
	private float bonificaciones;
	
	public Cuota() {}

	public Cuota(long idPago, Poliza poliza, Date fechaPago, int nroCuota, float montoCuota, float montoMora,
			float bonificaciones) {
		super();
		this.idPago = idPago;
		this.poliza = poliza;
		this.fechaPago = fechaPago;
		this.nroCuota = nroCuota;
		this.montoCuota = montoCuota;
		this.montoMora = montoMora;
		this.bonificaciones = bonificaciones;
	}

	public long getIdPago() {
		return idPago;
	}

	public void setIdPago(long idPago) {
		this.idPago = idPago;
	}

	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public int getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}

	public float getMontoCuota() {
		return montoCuota;
	}

	public void setMontoCuota(float montoCuota) {
		this.montoCuota = montoCuota;
	}

	public float getMontoMora() {
		return montoMora;
	}

	public void setMontoMora(float montoMora) {
		this.montoMora = montoMora;
	}

	public float getBonificaciones() {
		return bonificaciones;
	}

	public void setBonificaciones(float bonificaciones) {
		this.bonificaciones = bonificaciones;
	}

	
	
}
