package DAOS;
import java.util.List;

import POJOS.*;
import interfaces.localidadDAO;
import jakarta.persistence.*;
public class DAOlocalidad implements localidadDAO {

	@Override
	public Localidad getLocalidad(long idLocalidad) {
		EntityManager manager = HibernateUtil.getEntityManager();
		Localidad localidad = manager.getReference(Localidad.class, idLocalidad);
		return localidad;
	}

	@Override
	public void createLocalidad(Localidad localidad) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(localidad);
		
	}

	@Override
	public void deleteLocalidad(Localidad localidad) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(localidad);
		
	}

	@Override
	public void updateLocalidad(Localidad localidad) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(localidad);
		
	}

	@Override
	public List<Localidad> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<Localidad> all = manager.createQuery("From Localidad").getResultList();
		return all;
	}
}
