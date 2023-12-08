package DAOS;

import java.util.List;
import POJOS.ValorHijo;
import interfaces.valorHijoDAO;
import jakarta.persistence.EntityManager;

public class DAOvalorHijo implements valorHijoDAO{

	@Override
	public ValorHijo getValorHijo(long idHijo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			ValorHijo valorHijo = manager.getReference(ValorHijo.class,idHijo);
			return valorHijo;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createValorHijo(ValorHijo Hijo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(Hijo);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteValorHijo(ValorHijo Hijo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(Hijo);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateValorHijo(ValorHijo Hijo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(Hijo);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ValorHijo> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<ValorHijo> all = manager.createQuery("From ValorHijo").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch blockDAOvalorDescuento.java
			e.printStackTrace();
			return null;
		}
	}

}
