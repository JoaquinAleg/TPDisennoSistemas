package DAOS;
import java.util.List;

import POJOS.*;
import interfaces.localidadDAO;
import jakarta.persistence.*;
public class DAOlocalidad implements localidadDAO {

	@Override
	public Localidad getLocalidad(long idLocalidad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			Localidad localidad = manager.getReference(Localidad.class, idLocalidad);
			return localidad;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createLocalidad(Localidad localidad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(localidad);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteLocalidad(Localidad localidad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(localidad);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateLocalidad(Localidad localidad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(localidad);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Localidad> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			@SuppressWarnings("unchecked")
			List<Localidad> all = manager.createQuery("From Localidad").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
