package DAOS;

import java.util.List;

import POJOS.MedidaSeguridad;
import POJOS.Poliza;
import interfaces.polizaDAO;
import jakarta.persistence.EntityManager;

public class DAOpoliza implements polizaDAO{

	@Override
	public Poliza getPoliza(long idPoliza) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			Poliza poliza = manager.getReference(Poliza.class, idPoliza);
			return poliza;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createPoliza(Poliza poliza) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.persist(poliza);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deletePoliza(Poliza poliza) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(poliza);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updatePoliza(Poliza poliza) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(poliza);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Poliza> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<Poliza> all = manager.createQuery("From Poliza").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
