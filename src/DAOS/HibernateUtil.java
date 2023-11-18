package DAOS;
import jakarta.persistence.*;
public class HibernateUtil {
	public static EntityManager getEntityManager(){
		EntityManager manager = null;
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("persistencia");
		manager = factory.createEntityManager();
		return manager;
	}
}
