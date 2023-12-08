package DAOS;

import java.util.List;
import POJOS.ValorEmision;
import interfaces.valorEmisionDAO;
import jakarta.persistence.EntityManager;

public class DAOvalorEmision implements valorEmisionDAO{

	@Override
	public ValorEmision getValorEmision(long idEmision) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			ValorEmision valorEmision = manager.getReference(ValorEmision.class,idEmision);
			return valorEmision;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createValorEmision(ValorEmision Emision) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(Emision);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteValorEmision(ValorEmision Emision) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(Emision);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateValorEmision(ValorEmision Emision) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(Emision);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ValorEmision> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<ValorEmision> all = manager.createQuery("From ValorEmision").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
