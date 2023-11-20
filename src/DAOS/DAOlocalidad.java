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
			manager.persist(localidad);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteLocalidad(Localidad localidad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(localidad);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateLocalidad(Localidad localidad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(localidad);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Localidad> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<Localidad> all = manager.createQuery("From Localidad").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Localidad> getLocalidadPorProvincia(Provincia Provincia) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<Localidad> localidades = manager.createQuery("From Localidad where idLocalidad = " + Provincia.getIdProvincia()).getResultList();
			return localidades;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
