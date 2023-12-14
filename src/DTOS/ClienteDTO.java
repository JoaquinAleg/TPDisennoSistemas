package DTOS;

public class ClienteDTO {
	private Long idCliente;
	private String nombre;
	private String apellido;
	private String numeroCliente;
	private String numeroDocumento;
	private Long idTipoDocumento;

	public ClienteDTO(Long idCliente, String nombre, String apellido, String numeroCliente, String numeroDocumento,
			Long idTipoDocumento) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroCliente = numeroCliente;
		this.numeroDocumento = numeroDocumento;
		this.idTipoDocumento = idTipoDocumento;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
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

	public String getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Long getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Long idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

}
