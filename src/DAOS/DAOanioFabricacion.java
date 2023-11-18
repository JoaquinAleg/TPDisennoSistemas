package DAOS;

import java.util.List;
import jakarta.persistence.*;
import POJOS.AnioFabricacion;
import interfaces.anioFabricacionDAO;

public class DAOanioFabricacion implements anioFabricacionDAO{
	@Override
	public AnioFabricacion getAnioFabricacion(long idAnioFabricacion) {
		EntityManager manager = HibernateUtil.getEntityManager();
		AnioFabricacion anioFabricacion = manager.find(AnioFabricacion.class, idAnioFabricacion);
		return anioFabricacion;
	}

	@Override
	public void createAnioFabricacion(AnioFabricacion anioFabricacion) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(anioFabricacion);
	}

	@Override
	public void deleteAnioFabricacion(AnioFabricacion anioFabricacion) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(anioFabricacion);
		
	}

	@Override
	public void updateAnioFabricacion(AnioFabricacion AnioFabricacion) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(AnioFabricacion);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AnioFabricacion> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<AnioFabricacion> all = manager.createQuery("from AnioFabricacion").getResultList();
		return all;
	}

}
