package DAOS;

import java.util.List;
import POJOS.ValorProvincia;
import interfaces.valorProvinciaDAO;
import jakarta.persistence.EntityManager;

public class DAOvalorProvincia implements valorProvinciaDAO{

	@Override
	public ValorProvincia getValorProvincia(long idProvincia) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			ValorProvincia valorProvincia = manager.getReference(ValorProvincia.class,idProvincia);
			return valorProvincia;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createValorProvincia(ValorProvincia Provincia) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(Provincia);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteValorProvincia(ValorProvincia Provincia) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(Provincia);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateValorProvincia(ValorProvincia Provincia) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(Provincia);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ValorProvincia> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<ValorProvincia> all = manager.createQuery("From ValorProvincia").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
