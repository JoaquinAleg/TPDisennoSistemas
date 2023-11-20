package Gestores;

import DAOS.DAOcliente;
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
    
}
