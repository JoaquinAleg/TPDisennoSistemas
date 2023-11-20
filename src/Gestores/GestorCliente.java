package Gestores;

import java.util.ArrayList;
import java.util.List;

import DAOS.DAOcliente;
import DTOS.ClienteDTO;
import DTOS.ListadoDTO;
import POJOS.Cliente;
import POJOS.Empleado;

public class GestorCliente {
	
	private DAOcliente daoCliente;
	
    private static GestorCliente instancia = null;

    private GestorCliente() {
    	this.daoCliente = new DAOcliente();
    }

    public static GestorCliente getInstance() {
        if (instancia == null) {
            instancia = new GestorCliente();
        }
        return instancia;
    }
    
    public Cliente getCliente(long numeroCliente) {
    	
    	Cliente cliente = daoCliente.getCliente(numeroCliente);
    	
    	return cliente;
    }
    
    public List<ClienteDTO> getClientes(){
		List<Cliente> clientes = daoCliente.getAll();
		List<ClienteDTO> clientesDTO = new ArrayList<>();
		//ClienteDTO clienteDTO = new ClienteDTO(" ", null);
		//clientesDTO.add(clienteDTO);
		for(Cliente e : clientes) {
			ClienteDTO clienteDTO = new ClienteDTO(e.getIdCliente(), e.getPersona().getNombre(), e.getPersona().getApellido(), e.getPersona().getNumeroDocumento(), e.getPersona().getIdTipoDocumento().getIdTipoDocumento());
			clientesDTO.add(clienteDTO);
		}
		return clientesDTO;
	}
    
}
