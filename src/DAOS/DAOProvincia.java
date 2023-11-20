package DAOS;

import java.util.List;

import POJOS.Provincia;
import interfaces.provinciaDAO;
import jakarta.persistence.EntityManager;

public class DAOProvincia implements provinciaDAO{
	public Provincia getProvincia(long idProvincia) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			Provincia provincia = manager.getReference(Provincia.class, idProvincia);
			return provincia;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createProvincia(Provincia provincia) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.persist(provincia);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProvincia(Provincia provincia) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(provincia);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateProvincia(Provincia provincia) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(provincia);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Provincia> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<Provincia> all = manager.createQuery("From Provincia").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
