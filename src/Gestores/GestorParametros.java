package Gestores;


public class GestorParametros {
		
    private static GestorParametros instancia = null;

    private GestorParametros() {
    }

    public static GestorParametros getInstance() {
        if (instancia == null) {
            instancia = new GestorParametros();
        }
        return instancia;
    }
}