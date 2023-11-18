package DAOS;

import java.util.List;

import POJOS.Cobertura;
import interfaces.coberturaDAO;
import jakarta.persistence.EntityManager;

public class DAOcobertura implements coberturaDAO {

	@Override
	public Cobertura getCobertura(long idCobertura) {
		EntityManager manager = HibernateUtil.getEntityManager();		
		Cobertura cobertura = manager.getReference(Cobertura.class, idCobertura);
		return cobertura;
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
		EntityManager manager = HibernateUtil.getEntityManager();
		List<Cobertura> all = manager.createQuery("From Cobertura").getResultList();
		return all;
	}

}
