package DAOS;
import jakarta.persistence.*;
public class HibernateUtil {
	private static EntityManagerFactory emf;

	public static EntityManager getEntityManager(){
		try {
			EntityManager manager = null;
			manager = emf.createEntityManager();
			return manager;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public static void createEMF(){
		emf = Persistence.createEntityManagerFactory("persistencia");
	}
}
