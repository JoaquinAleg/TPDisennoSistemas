package POJOS;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente", schema = "public")
public class Cliente {
	@Id
	@Column
	private long idCliente;
	@Column
	private LocalDate fechaRegistro;
	@Column
	private String profesion;
	@OneToOne
	@JoinColumn(name = "cuit", nullable = false, referencedColumnName = "cuit", 
			foreignKey=@ForeignKey(name = "fk_cuitCliente", value = ConstraintMode.CONSTRAINT))
	private Persona persona;
	@ManyToOne
	@JoinColumn(name = "idTipoEstadoCliente", nullable = false, referencedColumnName = "idTipoEstadoCliente", 
	foreignKey=@ForeignKey(name = "fk_estadoCliente", value = ConstraintMode.CONSTRAINT))
	private TipoEstadoCliente TipoEstadoCliente;
	@ManyToOne
	@JoinColumn(name = "idTipoCondicionIVA", nullable = false, referencedColumnName = "idTipoCondicionIVA", 
	foreignKey=@ForeignKey(name = "fk_condicionIVA", value = ConstraintMode.CONSTRAINT))
	private TipoCondicionIVA TipoCondicionIVA;
	@OneToMany
	@JoinColumn(name = "idCliente", nullable = true, referencedColumnName = "idCliente", 
	foreignKey=@ForeignKey(name = "fk_clientePoliza", value = ConstraintMode.CONSTRAINT))
	private List<Poliza> polizas;
	@ManyToOne
	@JoinColumn(name = "idTipoCondicionCliente", nullable = true, referencedColumnName = "idTipoCondicionCliente", 
	foreignKey=@ForeignKey(name = "fk_condicionCliente", value = ConstraintMode.CONSTRAINT))
	private TipoCondicionCliente condicionCliente;
	
	
	public Cliente() {}




	public Cliente(long idCliente, String profesion, Persona persona,
			POJOS.TipoEstadoCliente tipoEstadoCliente, POJOS.TipoCondicionIVA tipoCondicionIVA, List<Poliza> polizas) {
		super();
		LocalDateTime fechaHoraActual = LocalDateTime.now();
		this.idCliente = idCliente;
		this.fechaRegistro = fechaHoraActual.toLocalDate();;
		this.profesion = profesion;
		this.persona = persona;
		TipoEstadoCliente = tipoEstadoCliente;
		TipoCondicionIVA = tipoCondicionIVA;
		this.polizas = polizas;
	}




	public List<Poliza> getPolizas() {
		return polizas;
	}




	public void setPolizas(List<Poliza> polizas) {
		this.polizas = polizas;
	}

	
	public String getDocumento(){
		String documento = this.persona.getDocumento(); 
		return documento;
	}
	public long getTipoDocumento(){
		long tipoDocumento = this.persona.getIdTipoDocumento().getIdTipoDocumento(); 
		return tipoDocumento;
	}


	public long getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}


	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public TipoEstadoCliente getTipoEstadoCliente() {
		return TipoEstadoCliente;
	}


	public void setTipoEstadoCliente(TipoEstadoCliente tipoEstadoCliente) {
		TipoEstadoCliente = tipoEstadoCliente;
	}


	public TipoCondicionIVA getTipoCondicionIVA() {
		return TipoCondicionIVA;
	}


	public void setTipoCondicionIVA(TipoCondicionIVA tipoCondicionIVA) {
		TipoCondicionIVA = tipoCondicionIVA;
	}

	
	
	
}
