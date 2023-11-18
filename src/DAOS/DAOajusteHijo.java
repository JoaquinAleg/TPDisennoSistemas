package DAOS;

import java.util.List;

import POJOS.AjusteEmision;
import POJOS.AjusteHijo;
import interfaces.ajustePorHijoDAO;
import jakarta.persistence.EntityManager;

public class DAOajusteHijo implements ajustePorHijoDAO {

	@Override
	public AjusteHijo getAjusteHijo(long idAjusteHijo) {
		EntityManager manager = HibernateUtil.getEntityManager();
		AjusteHijo ajusteHijo = manager.getReference(AjusteHijo.class, idAjusteHijo);
		return ajusteHijo;
	}

	@Override
	public void createAjusteHijo(AjusteHijo ajusteHijo) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(ajusteHijo);
		
	}

	@Override
	public void deleteAjusteHijo(AjusteHijo ajusteHijo) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(ajusteHijo);
	}

	@Override
	public void updateAjusteHijo(AjusteHijo ajusteHijo) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(ajusteHijo);
	}

	@Override
	public List<AjusteHijo> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<AjusteHijo> all = manager.createQuery("From AjustePorHijo").getResultList();
		return all;
	}

}
