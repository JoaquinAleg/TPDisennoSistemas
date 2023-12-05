package DAOS;

import java.util.List;

import POJOS.AjusteSiniestro;
import POJOS.Cobertura;
import interfaces.coberturaDAO;
import jakarta.persistence.EntityManager;

public class DAOcobertura implements coberturaDAO {

	@Override
	public Cobertura getCobertura(long idCobertura) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			Cobertura cobertura = manager.getReference(Cobertura.class, idCobertura);
			return cobertura;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createCobertura(Cobertura cobertura) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(cobertura);
		manager.getTransaction().commit();
		
	}

	@Override
	public void deleteCobertura(Cobertura cobertura) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.remove(cobertura);
		manager.getTransaction().commit();
	}

	@Override
	public void updateCobertura(Cobertura cobertura) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.merge(cobertura);
		manager.getTransaction().commit();		
	}

	@Override
	public List<Cobertura> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<Cobertura> all = manager.createQuery("From Cobertura").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
