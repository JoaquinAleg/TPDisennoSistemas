package interfaces;

import java.util.List;

import POJOS.TipoCondicionCliente;

public interface tipoCondicionClienteDAO {

	public TipoCondicionCliente getTipoCondicionCliente(long idTipoCondicionCliente);
	public void createTipoCondicionCliente(TipoCondicionCliente tipoCondicionCliente);
	public void deleteTipoCondicionCliente(TipoCondicionCliente tipoCondicionCliente);
	public void updateTipoCondicionCliente(TipoCondicionCliente tipoCondicionCliente);
	public List<TipoCondicionCliente> getAll();

}
