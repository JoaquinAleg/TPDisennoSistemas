package pantalla;

import java.util.List;

import DAOS.HibernateUtil;
import POJOS.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		HibernateUtil.createEMF();
		CrearPoliza_1.main(args);
	}
}
