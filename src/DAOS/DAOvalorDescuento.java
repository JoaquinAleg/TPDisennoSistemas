package DAOS;

import java.util.List;
import POJOS.ValorDescuento;
import interfaces.valorDescuentoDAO;
import jakarta.persistence.EntityManager;

public class DAOvalorDescuento implements valorDescuentoDAO{

	@Override
	public ValorDescuento getValorDescuento(long idDescuento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			ValorDescuento valorDescuento = manager.getReference(ValorDescuento.class,idDescuento);
			return valorDescuento;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createValorDescuento(ValorDescuento descuento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(descuento);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteValorDescuento(ValorDescuento descuento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(descuento);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateValorDescuento(ValorDescuento descuento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(descuento);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ValorDescuento> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<ValorDescuento> all = manager.createQuery("From ValorDescuento").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
