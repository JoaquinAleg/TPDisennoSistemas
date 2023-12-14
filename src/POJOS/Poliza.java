package POJOS;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import DAOS.DAOmedidasPoliza;

import java.time.ZoneId;

import jakarta.persistence.*;
@Entity

@Table(name = "Poliza", schema = "public")
public class Poliza {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numeroPoliza;
	@ManyToOne
	@JoinColumn(name = "idModelo", nullable = false, referencedColumnName = "idModelo", 
	foreignKey=@ForeignKey(name = "fk_ModeloPoliza", value = ConstraintMode.CONSTRAINT))
	private Modelo modelo;
	@ManyToOne
	@JoinColumn(name = "idAjusteHijo", nullable = false, referencedColumnName = "idAjusteHijo", 
	foreignKey=@ForeignKey(name = "fk_AjusteHijo", value = ConstraintMode.CONSTRAINT))
	private AjusteHijo ajusteHijo;
	@ManyToOne
	@JoinColumn(name = "idAjusteKilometro", nullable = false, referencedColumnName = "idAjusteKilometro", 
	foreignKey=@ForeignKey(name = "fk_AjusteKilometro", value = ConstraintMode.CONSTRAINT))
	private AjusteKilometro ajusteKilometro;
	@ManyToOne
	@JoinColumn(name = "idAjusteSiniestro", nullable = false, referencedColumnName = "idAjusteSiniestro", 
	foreignKey=@ForeignKey(name = "fk_AjusteSiniestro", value = ConstraintMode.CONSTRAINT))
	private AjusteSiniestro idAjusteSiniestro;
	@ManyToOne
	@JoinColumn(name = "idAnioFabricacion", nullable = false, referencedColumnName = "idAnioFabricacion", 
	foreignKey=@ForeignKey(name = "fk_AnioFabricacion", value = ConstraintMode.CONSTRAINT))
	private AnioFabricacion anioFabricacion;
	@ManyToOne
	@JoinColumn(name = "idAjusteDescuento", nullable = false, referencedColumnName = "idAjusteDescuento", 
	foreignKey=@ForeignKey(name = "fk_AjusteDescuento", value = ConstraintMode.CONSTRAINT))
	private AjusteDescuento ajusteDescuento;
	@ManyToOne
	@JoinColumn(name = "idAjusteEmision", nullable = false, referencedColumnName = "idAjusteEmision", 
	foreignKey=@ForeignKey(name = "fk_AjusteEmision", value = ConstraintMode.CONSTRAINT))
	private AjusteEmision ajusteEmision;
	@ManyToOne
	@JoinColumn(name = "idLocalidad", nullable = false, referencedColumnName = "idLocalidad", 
	foreignKey=@ForeignKey(name = "fk_LocalidadPoliza", value = ConstraintMode.CONSTRAINT))
	private Localidad localidad;
	@ManyToOne
	@JoinColumn(name = "idTipoDocumento", nullable = false, referencedColumnName = "idTipoDocumento", 
	foreignKey=@ForeignKey(name = "fk_tipoDocumentoPoliza", value = ConstraintMode.CONSTRAINT))
	private TipoDocumento tipoDocumento;
	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false, referencedColumnName = "idCliente", 
	foreignKey=@ForeignKey(name = "fk_polizaCliente", value = ConstraintMode.CONSTRAINT))
	private Cliente cliente;
	@Column
	private float sumaAsegurada;
	@Column
	private int kilometrosRealizadosAnio;
	@Column
	private int cantSiniestrosUA;
	@Column
	private LocalDate fechaDeInicio;
	@Column
	private LocalDate fechaDeFin;
	@Column
	private float premio;
	@Column
	private float prima;
	@Column
	private float descuentos;
	@Column
	private LocalDate ultimoDiaPago;
	@Column
	private float montoTotalAbonar;
	@Column
	private String chasis;
	@Column
	private String patente;
	@Column
	private String estadoPoliza;
	@Column
	private String motor;
	@Column
	private String nombreCliente;
	@Column
	private String dniCliente;
	@Column
	private LocalDate fechaCreacion;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "NroPoliza", nullable = false, referencedColumnName = "numeroPoliza", 
	foreignKey=@ForeignKey(name = "fk_polizaCuota", value = ConstraintMode.CONSTRAINT))
	private List<Cuota> cuotas= new ArrayList<Cuota>();
	@ManyToOne
	@JoinColumn(name = "idFormaPago", nullable = false, referencedColumnName = "idFormaPago", 
	foreignKey=@ForeignKey(name = "fk_TipoFormaPago", value = ConstraintMode.CONSTRAINT))
	private TipoFormaPago FormaPago;
	@ManyToOne
	@JoinColumn(name = "idCobertura", nullable = false, referencedColumnName = "idCobertura", 
	foreignKey=@ForeignKey(name = "fk_CoberturaPoliza", value = ConstraintMode.CONSTRAINT))
	private Cobertura Cobertura;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "numeroPoliza", nullable = true, referencedColumnName = "numeroPoliza", 
	foreignKey=@ForeignKey(name = "fk_MedidaSeguridad", value = ConstraintMode.CONSTRAINT))
	private List<MedidasPoliza> Medidas = new ArrayList<MedidasPoliza>();
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "numeroPoliza", nullable = true, referencedColumnName = "numeroPoliza", 
	foreignKey=@ForeignKey(name = "fk_ModificacionPoliza", value = ConstraintMode.CONSTRAINT))
	private List<Modificacion> modificaciones= new ArrayList<Modificacion>();
	@OneToMany
	@JoinColumn(name = "numeroPoliza", nullable = true, referencedColumnName = "numeroPoliza", 
	foreignKey=@ForeignKey(name = "fk_HijosPoliza", value = ConstraintMode.CONSTRAINT))
	private List<Hijo> hijos= new ArrayList<Hijo>();
	
	public Poliza(){}

	
	







	public Poliza(long numeroPoliza, Modelo modelo, AjusteHijo ajusteHijo, AjusteKilometro ajusteKilometro,
			AjusteSiniestro idAjusteSiniestro, AnioFabricacion anioFabricacion, AjusteDescuento ajusteDescuento,
			AjusteEmision ajusteEmision, Localidad localidad, TipoDocumento tipoDocumento,
			Cliente cliente, float sumaAsegurada, int kilometrosRealizadosAnio, int cantSiniestrosUA,
			LocalDate fechaDeInicio, LocalDate fechaDeFin, float premio, float prima, float descuentos,
			LocalDate ultimoDiaPago, float montoTotalAbonar, String chasis, String patente, String estadoPoliza,
			String motor, String nombreCliente, String dniCliente, LocalDate fechaCreacion, List<Cuota> cuotas,
			TipoFormaPago formaPago, POJOS.Cobertura cobertura, List<MedidasPoliza> medida,
			List<Modificacion> modificaciones, List<Hijo> hijos) {
		super();
		this.numeroPoliza = numeroPoliza;
		this.modelo = modelo;
		this.ajusteHijo = ajusteHijo;
		this.ajusteKilometro = ajusteKilometro;
		this.idAjusteSiniestro = idAjusteSiniestro;
		this.anioFabricacion = anioFabricacion;
		this.ajusteDescuento = ajusteDescuento;
		this.ajusteEmision = ajusteEmision;
		this.localidad = localidad;
		this.tipoDocumento = tipoDocumento;
		this.cliente = cliente;
		this.sumaAsegurada = sumaAsegurada;
		this.kilometrosRealizadosAnio = kilometrosRealizadosAnio;
		this.cantSiniestrosUA = cantSiniestrosUA;
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFin = fechaDeFin;
		this.premio = premio;
		this.prima = prima;
		this.descuentos = descuentos;
		this.ultimoDiaPago = ultimoDiaPago;
		this.montoTotalAbonar = montoTotalAbonar;
		this.chasis = chasis;
		this.patente = patente;
		this.estadoPoliza = estadoPoliza;
		this.motor = motor;
		this.nombreCliente = nombreCliente;
		this.dniCliente = dniCliente;
		this.fechaCreacion = fechaCreacion;
		this.cuotas = cuotas;
		this.FormaPago = formaPago;
		this.Cobertura = cobertura;
		this.Medidas = medida;
		this.modificaciones = modificaciones;
		this.hijos = hijos;
	}










	public List<Hijo> getHijos() {
		return hijos;
	}










	public void setHijos(List<Hijo> hijos) {
		this.hijos = hijos;
	}
	
	public void setHijo(Hijo hijo) {
		this.hijos.add(hijo);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cuota> getCuotas() {
		return cuotas;
	}

	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}
	
	public void setCuota(Cuota cuota) {
		this.cuotas.add(cuota);
	}

	public List<Modificacion> getModificaciones() {
		return modificaciones;
	}


	public void setModificaciones(List<Modificacion> modificaciones) {
		this.modificaciones = modificaciones;
	}


	public long getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(long numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
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

	public AjusteSiniestro getIdAjusteSiniestro() {
		return idAjusteSiniestro;
	}

	public void setIdAjusteSiniestro(AjusteSiniestro idAjusteSiniestro) {
		this.idAjusteSiniestro = idAjusteSiniestro;
		this.cantSiniestrosUA = idAjusteSiniestro.getCantidadSiniestros();
	}

	public AnioFabricacion getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(AnioFabricacion anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
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

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public float getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(float sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	public int getKilometrosRealizadosAnio() {
		return kilometrosRealizadosAnio;
	}

	public void setKilometrosRealizadosAnio(int kilometrosRealizadosAnio) {
		this.kilometrosRealizadosAnio = kilometrosRealizadosAnio;
	}

	public int getCantSiniestrosUA() {
		return cantSiniestrosUA;
	}

	public void setCantSiniestrosUA(int cantSiniestrosUA) {
		this.cantSiniestrosUA = cantSiniestrosUA;
	}

	public LocalDate getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(LocalDate fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	public LocalDate getFechaDeFin() {
		return fechaDeFin;
	}

	public void setFechaDeFin(LocalDate fechaDeFin) {
		this.fechaDeFin = fechaDeFin;
	}

	public float getPremio() {
		return premio;
	}

	public void setPremio(float premio) {
		this.premio = premio;
	}

	public float getPrima() {
		return prima;
	}

	public void setPrima(float prima) {
		this.prima = prima;
	}

	public float getDescuentos() {
		return descuentos;
	}

	public void setDescuentos(float descuentos) {
		this.descuentos = descuentos;
	}

	public LocalDate getUltimoDiaPago() {
		return ultimoDiaPago;
	}

	public void setUltimoDiaPago(LocalDate ultimoDiaPago) {
		this.ultimoDiaPago = ultimoDiaPago;
	}

	public float getMontoTotalAbonar() {
		return montoTotalAbonar;
	}

	public void setMontoTotalAbonar(float montoTotalAbonar) {
		this.montoTotalAbonar = montoTotalAbonar;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getEstadoPoliza() {
		return estadoPoliza;
	}

	public void setEstadoPoliza(String estadoPoliza) {
		this.estadoPoliza = estadoPoliza;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public TipoFormaPago getFormaPago() {
		return FormaPago;
	}

	public void setFormaPago(TipoFormaPago formaPago) {
		FormaPago = formaPago;
	}

	public Cobertura getCobertura() {
		return Cobertura;
	}

	public void setCobertura(Cobertura cobertura) {
		Cobertura = cobertura;
	}

	public List<MedidasPoliza> getMedida() {
		return Medidas;
	}

	public void setMedida(MedidaSeguridad medida) {
		MedidasPoliza nuevaMedida = new MedidasPoliza();
		nuevaMedida.setMedida(medida);
		nuevaMedida.setPoliza(this);
		Medidas.add(nuevaMedida);
	}


	public void setDatosVehiculo(String chasis, String motor, String patente, Float sumaAsegurada) {
		this.chasis = chasis;
		this.motor = motor;
		this.patente = patente;
		this.sumaAsegurada = sumaAsegurada;
		
	}

	
	public void setDatosPoliza(LocalDate comienzoVigencia, LocalDate ultimoDiaPago, Float premio, Float prima, Float descuento,
			Float montoTotalAbonar, Integer kilometrosPorAnio, LocalDate finVigencia) {
		LocalDate fechaActual = LocalDate.now();
		this.fechaCreacion = fechaActual;
		this.fechaDeInicio = comienzoVigencia;
		this.ultimoDiaPago = ultimoDiaPago;
		this.premio = premio;
		this.prima = prima;
		this.descuentos = descuento;
		this.montoTotalAbonar = montoTotalAbonar;
		this.kilometrosRealizadosAnio = kilometrosPorAnio;
		this.fechaDeFin = finVigencia;
	}


	public void setDatosCliente(String nombre, String apellido, TipoDocumento tipoDNI,
			String dniCliente2) {
		this.nombreCliente = nombre+" "+apellido;
		this.tipoDocumento = tipoDNI;
		this.dniCliente = dniCliente2;
		
	}

}










