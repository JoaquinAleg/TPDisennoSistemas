package pantalla;

import DAOS.HibernateUtil;

public class App {
	public static void main(String[] args) {
		HibernateUtil.createEMF();
		PantallaInicio_ProductorDeSeguro.main(args);
	}
}
