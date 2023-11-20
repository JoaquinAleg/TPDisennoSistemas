package DAOS;

import java.util.List;
import jakarta.persistence.*;
import POJOS.AnioFabricacion;
import interfaces.anioFabricacionDAO;

public class DAOanioFabricacion implements anioFabricacionDAO{
	@Override
	public AnioFabricacion getAnioFabricacion(long idAnioFabricacion) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			AnioFabricacion anioFabricacion = manager.find(AnioFabricacion.class, idAnioFabricacion);
			return anioFabricacion;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createAnioFabricacion(AnioFabricacion anioFabricacion) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.persist(anioFabricacion);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAnioFabricacion(AnioFabricacion anioFabricacion) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(anioFabricacion);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateAnioFabricacion(AnioFabricacion AnioFabricacion) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(AnioFabricacion);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AnioFabricacion> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<AnioFabricacion> all = manager.createQuery("from AnioFabricacion").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
