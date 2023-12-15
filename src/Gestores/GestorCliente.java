package Gestores;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import DAOS.DAOcliente;
import DTOS.ClienteDTO;
import POJOS.Cliente;

public class GestorCliente {
	
	//private List<Cliente> clientes;
	
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
			ClienteDTO clienteDTO = new ClienteDTO(e.getIdCliente(), e.getPersona().getNombre(), e.getPersona().getApellido(),e.getNumeroCliente(), e.getDocumento(), e.getTipoDocumento());
			clientesDTO.add(clienteDTO);
		}
		return clientesDTO;
	}

	public ClienteDTO getClienteDTO(Long numeroCliente) {
		Cliente cliente = daoCliente.getCliente(numeroCliente);
		return new ClienteDTO(cliente.getIdCliente(), cliente.getPersona().getNombre(), cliente.getPersona().getApellido(), cliente.getNumeroCliente(), cliente.getDocumento(), cliente.getTipoDocumento());
	}
	
	public List<ClienteDTO> buscarClientes(String numeroCliente, String Apellido, String nombre, Long tipoDocumento, String numeroDocumento){
		List<Cliente> clientes = daoCliente.getClientes(numeroCliente, Apellido, nombre, tipoDocumento, numeroDocumento);
		List<ClienteDTO> clientesDTO = new ArrayList<>();
		if(clientes.size() >= 1) {
			for(Cliente e : clientes) {
				ClienteDTO clienteDTO = new ClienteDTO(e.getIdCliente(), e.getPersona().getNombre(), e.getPersona().getApellido(), e.getNumeroCliente(), e.getDocumento(), e.getTipoDocumento());
				clientesDTO.add(clienteDTO);
			}
			return clientesDTO;
		}
		else {
			JOptionPane.showMessageDialog(null, "No se encontraron Clientes que cumplan los requisitos ingresados","Error",JOptionPane.WARNING_MESSAGE);
			return null;
		}
	}
}
