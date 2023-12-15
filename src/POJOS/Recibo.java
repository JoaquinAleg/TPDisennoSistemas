package POJOS;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Recibo", schema = "public")
public class Recibo {
	@Id
	@Column
	private long idNroRecibo;
	@Column
	private String descripcion;
	@Column
	private LocalDate fechaHoraRecibo;
	@Column
	private Float importe;
	@Column
	private Float premio;
	@Column
	private Float recargoPorMora;
	@Column
	private Float bonificacionPagoAdelantado;
	@ManyToOne
	@JoinColumn(name = "idCobrador", nullable = false, referencedColumnName = "idCobrador", 
	foreignKey=@ForeignKey(name = "fk_Cobrador", value = ConstraintMode.CONSTRAINT))
	private Cobrador cobrador;
	@OneToMany
	@JoinColumn(name = "idNroRecibo", nullable = true, referencedColumnName = "idNroRecibo", 
	foreignKey=@ForeignKey(name = "fk_Cuotas", value = ConstraintMode.CONSTRAINT))
	private List<Cuota> cuotas;

	
	public Recibo() {}


	public Recibo(long idNroRecibo, String descripcion, LocalDate fechaHoraRecibo, Float importe, Float premio,
			Float recargoPorMora, Float bonificacionPagoAdelantado, Cobrador cobrador, List<Cuota> cuotas) {
		super();
		this.idNroRecibo = idNroRecibo;
		this.descripcion = descripcion;
		this.fechaHoraRecibo = fechaHoraRecibo;
		this.importe = importe;
		this.premio = premio;
		this.recargoPorMora = recargoPorMora;
		this.bonificacionPagoAdelantado = bonificacionPagoAdelantado;
		this.cobrador = cobrador;
		this.cuotas = cuotas;
	}


	public long getIdNroRecibo() {
		return idNroRecibo;
	}


	public void setIdNroRecibo(long idNroRecibo) {
		this.idNroRecibo = idNroRecibo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public LocalDate getFechaHoraRecibo() {
		return fechaHoraRecibo;
	}


	public void setFechaHoraRecibo(LocalDate fechaHoraRecibo) {
		this.fechaHoraRecibo = fechaHoraRecibo;
	}


	public Float getImporte() {
		return importe;
	}


	public void setImporte(Float importe) {
		this.importe = importe;
	}


	public Float getPremio() {
		return premio;
	}


	public void setPremio(Float premio) {
		this.premio = premio;
	}


	public Float getRecargoPorMora() {
		return recargoPorMora;
	}


	public void setRecargoPorMora(Float recargoPorMora) {
		this.recargoPorMora = recargoPorMora;
	}


	public Float getBonificacionPagoAdelantado() {
		return bonificacionPagoAdelantado;
	}


	public void setBonificacionPagoAdelantado(Float bonificacionPagoAdelantado) {
		this.bonificacionPagoAdelantado = bonificacionPagoAdelantado;
	}


	public Cobrador getCobrador() {
		return cobrador;
	}


	public void setCobrador(Cobrador cobrador) {
		this.cobrador = cobrador;
	}


	public List<Cuota> getCuotas() {
		return cuotas;
	}


	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}

	
	
}
