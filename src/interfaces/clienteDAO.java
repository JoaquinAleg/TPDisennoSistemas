package interfaces;

import java.util.List;

import POJOS.Cliente;

public interface clienteDAO {
	public Cliente getCliente(long idCliente);
	public void createCliente(Cliente cliente);
	public void deleteCliente(Cliente cliente);
	public void updateCliente(Cliente cliente);
	public List<Cliente> getAll();
}
