package DAOS;

import java.util.List;

import POJOS.Modelo;
import interfaces.modeloDAO;
import jakarta.persistence.EntityManager;

public class DAOmodelo implements modeloDAO{

	@Override
	public Modelo getModelo(long idModelo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();		
			Modelo modelo = manager.getReference(Modelo.class, idModelo);
			return modelo;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createModelo(Modelo modelo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(modelo);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteModelo(Modelo modelo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(modelo);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateModelo(Modelo modelo) {
		// TODO Auto-generated method stub
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(modelo);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Modelo> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<Modelo> all = manager.createQuery("From Modelo").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
