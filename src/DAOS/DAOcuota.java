package DAOS;

import java.util.List;

import POJOS.Cobertura;
import POJOS.Cuota;
import interfaces.cuotaDAO;
import jakarta.persistence.EntityManager;

public class DAOcuota implements cuotaDAO{

	@Override
	public Cuota getCuota(long idCuota) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			Cuota Cuota = manager.getReference(Cuota.class, idCuota);
			return Cuota;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createCuota(Cuota cuota) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(cuota);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteCuota(Cuota cuota) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(cuota);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateCuota(Cuota cuota) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(cuota);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Cuota> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<Cuota> all = manager.createQuery("From Cuota").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
