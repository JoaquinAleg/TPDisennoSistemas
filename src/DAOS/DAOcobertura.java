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
		manager.persist(cobertura);
		
	}

	@Override
	public void deleteCobertura(Cobertura cobertura) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(cobertura);
	}

	@Override
	public void updateCobertura(Cobertura cobertura) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(cobertura);		
	}

	@Override
	public List<Cobertura> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<Cobertura> all = manager.createQuery("From AjustePorHijo").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
