package DAOS;
import jakarta.persistence.*;
public class HibernateUtil {
	public static EntityManager getEntityManager(){
		try {
			EntityManager manager = null;
			EntityManagerFactory factory;
			factory = Persistence.createEntityManagerFactory("persistencia");
			manager = factory.createEntityManager();
			return manager;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
