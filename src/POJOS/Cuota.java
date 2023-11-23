package POJOS;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "Cuota", schema = "public")
public class Cuota {
	@Id
	@Column
	private long idPago;
	@ManyToOne
	@JoinColumn(name = "numeroPoliza", nullable = false, referencedColumnName = "numeroPoliza", 
	foreignKey=@ForeignKey(name = "fk_Cuotapoliza", value = ConstraintMode.CONSTRAINT))
	private Poliza poliza;
	@ManyToOne
	@JoinColumn(name = "idNroRecibo", nullable = false, referencedColumnName = "idNroRecibo", 
	foreignKey=@ForeignKey(name = "fk_ReciboCuota", value = ConstraintMode.CONSTRAINT))
	private Recibo recibo;
	@Column
	private LocalDate fechaPago;
	@Column
	private LocalDate fechaUltimoPago;
	@Column
	private int nroCuota;
	@Column
	private float montoCuota;
	@Column
	private float montoMora;
	@Column
	private float bonificaciones;
	
	public Cuota() {}

	public Cuota(Poliza poliza, LocalDate fechaPago, LocalDate fechaUltimoPago, int nroCuota, float montoCuota, float montoMora,
			float bonificaciones) {
		super();
		//this.idPago = idPago;
		this.poliza = poliza;
		this.fechaPago = fechaPago;
		this.nroCuota = nroCuota;
		this.montoCuota = montoCuota;
		this.montoMora = montoMora;
		this.bonificaciones = bonificaciones;
		this.fechaUltimoPago = fechaUltimoPago;
	}
	
	public Cuota(Poliza poliza, LocalDate fechaPago, LocalDate fechaUltimoPago, int nroCuota, float montoCuota) {
		super();
		//this.idPago = idPago;
		this.poliza = poliza;
		this.fechaPago = fechaPago;
		this.nroCuota = nroCuota;
		this.montoCuota = montoCuota;
		this.fechaUltimoPago = fechaUltimoPago;
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

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public int getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}
	
	public LocalDate getFechaUltimaPago() {
		return this.fechaUltimoPago;
	}

	public void setFechaUltimaPago(LocalDate fechaUltimoPago) {
		this.fechaUltimoPago = fechaUltimoPago;
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

	public Recibo getRecibo() {
		return recibo;
	}

	public void setRecibo(Recibo recibo) {
		this.recibo = recibo;
	}

	public LocalDate getFechaUltimoPago() {
		return fechaUltimoPago;
	}

	public void setFechaUltimoPago(LocalDate fechaUltimoPago) {
		this.fechaUltimoPago = fechaUltimoPago;
	}

	
	
}
