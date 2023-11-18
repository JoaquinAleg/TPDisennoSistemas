package DAOS;

import java.util.List;

import POJOS.Poliza;
import interfaces.polizaDAO;
import jakarta.persistence.EntityManager;

public class DAOpoliza implements polizaDAO{

	@Override
	public Poliza getPoliza(long idPoliza) {
		EntityManager manager = HibernateUtil.getEntityManager();
		Poliza poliza = manager.getReference(Poliza.class, idPoliza);
		return poliza;
	}

	@Override
	public void createPoliza(Poliza poliza) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(poliza);
		
	}

	@Override
	public void deletePoliza(Poliza poliza) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(poliza);
	}

	@Override
	public void updatePoliza(Poliza poliza) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(poliza);
	}

	@Override
	public List<Poliza> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<Poliza> all = manager.createQuery("From Poliza").getResultList();
		return all;
	}

}
