package Gestores;

import POJOS.Cliente;
import POJOS.Empleado;

public class GestorCliente {
	
    private static GestorCliente instancia = null;

    private GestorCliente() {
    }

    public static GestorCliente obtenerInstancia(Empleado empleado) {
        if (instancia == null) {
            instancia = new GestorCliente();
        }
        return instancia;
    }
    
    public Cliente getCliente(long numeroCliente) {
    	
    	Cliente cliente = DAOcliente.getInstance().getCliente(numeroCliente);
    	
    	return cliente;
    }
    
    public void setCondicionNormal(long cliente) {
    	DAOcliente.getInstance().getCliente(numeroCliente).setCondicionNormal();
    }
	
    public void setCondicionPlata(long cliente) {
    	DAOcliente.getInstance().getCliente(numeroCliente).setCondicionPlata();
    }
    
    public void emisionDePoliza() {
    	//Do something
    }
    
}
