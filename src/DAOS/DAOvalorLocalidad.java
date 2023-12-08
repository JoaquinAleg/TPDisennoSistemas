package DAOS;

import java.util.List;
import POJOS.ValorLocalidad;
import interfaces.valorLocalidadDAO;
import jakarta.persistence.EntityManager;

public class DAOvalorLocalidad implements valorLocalidadDAO{

	@Override
	public ValorLocalidad getValorLocalidad(long idLocalidad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			ValorLocalidad valorLocalidad = manager.getReference(ValorLocalidad.class,idLocalidad);
			return valorLocalidad;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createValorLocalidad(ValorLocalidad Localidad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(Localidad);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteValorLocalidad(ValorLocalidad Localidad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(Localidad);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateValorLocalidad(ValorLocalidad Localidad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(Localidad);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ValorLocalidad> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<ValorLocalidad> all = manager.createQuery("From ValorLocalidad").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
