package Gestores;

public class GestorEmpleado {
	
    private static GestorEmpleado instancia = null;

    private GestorEmpleado() {
    }

    public static GestorEmpleado getInstance() {
        if (instancia == null) {
            instancia = new GestorEmpleado();
        }
        return instancia;
    }
}
