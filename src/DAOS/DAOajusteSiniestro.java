package DAOS;

import java.util.List;

import POJOS.AjusteKilometro;
import POJOS.AjusteSiniestro;
import interfaces.ajusteSiniestroDAO;
import jakarta.persistence.EntityManager;

public class DAOajusteSiniestro implements ajusteSiniestroDAO{

	@Override
	public AjusteSiniestro getAjusteSiniestro(long idAjusteSiniestro) {
		EntityManager manager = HibernateUtil.getEntityManager();		
		AjusteSiniestro ajusteSiniestro = manager.getReference(AjusteSiniestro.class, idAjusteSiniestro);
		return ajusteSiniestro;
	}

	@Override
	public void createAjusteSiniestro(AjusteSiniestro ajusteSiniestro) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(ajusteSiniestro);
	}

	@Override
	public void deleteAjusteSiniestro(AjusteSiniestro ajusteSiniestro) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(ajusteSiniestro);
		
	}

	@Override
	public void updateAjusteSiniestro(AjusteSiniestro ajusteSiniestro) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(ajusteSiniestro);
		
	}

	@Override
	public List<AjusteSiniestro> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<AjusteSiniestro> all = manager.createQuery("From AjustePorSiniestro").getResultList();
		return all;
	}

}
