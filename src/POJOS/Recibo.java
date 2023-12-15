package POJOS;
import java.time.LocalDate;

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
	
	//FALTA RELACION CON CUOTAS
	
	//FALTA RELACION CON COBRADOR
	
	public Recibo() {}

	public Recibo(long idNroRecibo, long idPago, String descripcion, LocalDate fechaRecibo) {
		super();
		this.idNroRecibo = idNroRecibo;
		this.descripcion = descripcion;
		this.fechaHoraRecibo = fechaRecibo;
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

	public LocalDate getFechaRecibo() {
		return fechaHoraRecibo;
	}

	public void setFechaRecibo(LocalDate fechaRecibo) {
		this.fechaHoraRecibo = fechaRecibo;
	}
	
}
