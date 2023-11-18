package DAOS;

import java.util.List;

import POJOS.AjusteEmision;
import interfaces.ajusteEmisionDAO;
import jakarta.persistence.EntityManager;

public class DAOajusteEmision implements ajusteEmisionDAO{

	@Override
	public AjusteEmision getAjusteEmision(long idAjusteEmision) {
		EntityManager manager = HibernateUtil.getEntityManager();
		AjusteEmision ajusteEmision = manager.getReference(AjusteEmision.class, idAjusteEmision);
		return ajusteEmision;
	}

	@Override
	public void createAjusteEmision(AjusteEmision ajusteEmision) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(ajusteEmision);
		
	}

	@Override
	public void deleteAjusteEmision(AjusteEmision ajusteEmision) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(ajusteEmision);
	}

	@Override
	public void updateAjusteEmision(AjusteEmision ajusteEmision) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(ajusteEmision);
	}

	@Override
	public List<AjusteEmision> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<AjusteEmision> all = manager.createQuery("From AjustePorEmision").getResultList();
		return all;
	}



	
}
