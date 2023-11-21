package DTOS;

public class ClienteDTO {
	private String nombre;
	private String apellido;
	private Long numeroCliente;
	private Integer numeroDocumento;
	private Long idTipoDocumento;
	
	public ClienteDTO(String nombre, String apellido, Long numeroCliente, Integer numeroDocumento,
			Long idTipoDocumento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroCliente = numeroCliente;
		this.numeroDocumento = numeroDocumento;
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(Long numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public Integer getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(Integer numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Long getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Long idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

}
