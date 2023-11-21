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
	@ManyToOne
	@JoinColumn(name = "idAjusteSiniestro", nullable = true, referencedColumnName = "idAjusteSiniestro", 
	foreignKey=@ForeignKey(name = "fk_valorSiniestro", value = ConstraintMode.CONSTRAINT))
	private AjusteSiniestro ajusteSiniestro;
	@ManyToOne
	@JoinColumn(name = "idAjusteHijo", nullable = true, referencedColumnName = "idAjusteHijo", 
	foreignKey=@ForeignKey(name = "fk_valorHijo", value = ConstraintMode.CONSTRAINT))
	private AjusteHijo ajusteHijo;
	@ManyToOne
	@JoinColumn(name = "idAjusteKilometro", nullable = true, referencedColumnName = "idAjusteKilometro", 
	foreignKey=@ForeignKey(name = "fk_valorKm", value = ConstraintMode.CONSTRAINT))
	private AjusteKilometro ajusteKilometro;
	@ManyToOne
	@JoinColumn(name = "idAjusteDescuento", nullable = true, referencedColumnName = "idAjusteDescuento", 
	foreignKey=@ForeignKey(name = "fk_valorDescuento", value = ConstraintMode.CONSTRAINT))
	private AjusteDescuento ajusteDescuento;
	@ManyToOne
	@JoinColumn(name = "idAjusteEmision", nullable = true, referencedColumnName = "idAjusteEmision", 
	foreignKey=@ForeignKey(name = "fk_valorEmision", value = ConstraintMode.CONSTRAINT))
	private AjusteEmision ajusteEmision;
	@ManyToOne
	@JoinColumn(name = "idCobertura", nullable = true, referencedColumnName = "idCobertura", 
	foreignKey=@ForeignKey(name = "fk_valorCobertura", value = ConstraintMode.CONSTRAINT))
	private Cobertura Cobertura;
	@ManyToOne
	@JoinColumn(name = "idModelo", nullable = true, referencedColumnName = "idModelo", 
	foreignKey=@ForeignKey(name = "fk_valorModelo", value = ConstraintMode.CONSTRAINT))
	private Modelo Modelo;
	@ManyToOne
	@JoinColumn(name = "idMarca", nullable = true, referencedColumnName = "idMarca", 
	foreignKey=@ForeignKey(name = "fk_valorMarca", value = ConstraintMode.CONSTRAINT))
	private Marca Marca;
	@ManyToOne
	@JoinColumn(name = "idLocalidad", nullable = true, referencedColumnName = "idLocalidad", 
	foreignKey=@ForeignKey(name = "fk_valorLocalidad", value = ConstraintMode.CONSTRAINT))
	private Localidad localidad;
	@ManyToOne
	@JoinColumn(name = "idProvincia", nullable = true, referencedColumnName = "idProvincia", 
	foreignKey=@ForeignKey(name = "fk_valorLocalidad", value = ConstraintMode.CONSTRAINT))
	private Provincia provincia;
	@ManyToOne
	@JoinColumn(name = "idMedida", nullable = true, referencedColumnName = "idMedida", 
	foreignKey=@ForeignKey(name = "fk_valorProvincia", value = ConstraintMode.CONSTRAINT))
	private MedidaSeguridad medida;
	@Column
	private LocalDate fechaAsignacion;
	@Column
	private LocalDate fechaModificacion;
	
	public ValorPorcentual() {}

	public ValorPorcentual(long idValorPorcentual, float valorPorcentual, AjusteSiniestro ajusteSiniestro,
			AjusteHijo ajusteHijo, AjusteKilometro ajusteKilometro, AjusteDescuento ajusteDescuento,
			AjusteEmision ajusteEmision, POJOS.Cobertura cobertura, POJOS.Modelo modelo, POJOS.Marca marca,
			Localidad localidad, Provincia provincia, MedidaSeguridad medida, LocalDate fechaAsignacion,
			LocalDate fechaModificacion) {
		super();
		this.idValorPorcentual = idValorPorcentual;
		this.valorPorcentual = valorPorcentual;
		this.ajusteSiniestro = ajusteSiniestro;
		this.ajusteHijo = ajusteHijo;
		this.ajusteKilometro = ajusteKilometro;
		this.ajusteDescuento = ajusteDescuento;
		this.ajusteEmision = ajusteEmision;
		Cobertura = cobertura;
		Modelo = modelo;
		Marca = marca;
		this.localidad = localidad;
		this.provincia = provincia;
		this.medida = medida;
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

	public AjusteSiniestro getAjusteSiniestro() {
		return ajusteSiniestro;
	}

	public void setAjusteSiniestro(AjusteSiniestro ajusteSiniestro) {
		this.ajusteSiniestro = ajusteSiniestro;
	}

	public AjusteHijo getAjusteHijo() {
		return ajusteHijo;
	}

	public void setAjusteHijo(AjusteHijo ajusteHijo) {
		this.ajusteHijo = ajusteHijo;
	}

	public AjusteKilometro getAjusteKilometro() {
		return ajusteKilometro;
	}

	public void setAjusteKilometro(AjusteKilometro ajusteKilometro) {
		this.ajusteKilometro = ajusteKilometro;
	}

	public AjusteDescuento getAjusteDescuento() {
		return ajusteDescuento;
	}

	public void setAjusteDescuento(AjusteDescuento ajusteDescuento) {
		this.ajusteDescuento = ajusteDescuento;
	}

	public AjusteEmision getAjusteEmision() {
		return ajusteEmision;
	}

	public void setAjusteEmision(AjusteEmision ajusteEmision) {
		this.ajusteEmision = ajusteEmision;
	}

	public Cobertura getCobertura() {
		return Cobertura;
	}

	public void setCobertura(Cobertura cobertura) {
		Cobertura = cobertura;
	}

	public Modelo getModelo() {
		return Modelo;
	}

	public void setModelo(Modelo modelo) {
		Modelo = modelo;
	}

	public Marca getMarca() {
		return Marca;
	}

	public void setMarca(Marca marca) {
		Marca = marca;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public MedidaSeguridad getMedida() {
		return medida;
	}

	public void setMedida(MedidaSeguridad medida) {
		this.medida = medida;
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
