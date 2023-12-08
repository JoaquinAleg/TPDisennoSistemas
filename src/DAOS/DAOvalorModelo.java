package DAOS;

import java.util.List;
import POJOS.ValorModelo;
import interfaces.valorModeloDAO;
import jakarta.persistence.EntityManager;

public class DAOvalorModelo implements valorModeloDAO{

	@Override
	public ValorModelo getValorModelo(long idModelo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			ValorModelo valorModelo = manager.getReference(ValorModelo.class,idModelo);
			return valorModelo;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createValorModelo(ValorModelo Modelo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(Modelo);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteValorModelo(ValorModelo Modelo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(Modelo);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateValorModelo(ValorModelo Modelo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(Modelo);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ValorModelo> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<ValorModelo> all = manager.createQuery("From ValorModelo").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
