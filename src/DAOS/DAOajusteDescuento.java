package DAOS;

import java.util.List;

import POJOS.AjusteDescuento;
import interfaces.ajusteDescuentoDAO;
import jakarta.persistence.*;

public class DAOajusteDescuento implements ajusteDescuentoDAO {

	@Override
	public AjusteDescuento getAjusteDescuento(long idAjusteDescuento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			AjusteDescuento ajusteDescuento = manager.getReference(AjusteDescuento.class,idAjusteDescuento);
			return ajusteDescuento;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void createAjusteDescuento(AjusteDescuento ajusteDescuento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.persist(ajusteDescuento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteAjusteDescuento(AjusteDescuento ajusteDescuento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(ajusteDescuento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateAjusteDescuento(AjusteDescuento ajusteDescuento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(ajusteDescuento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<AjusteDescuento> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<AjusteDescuento> all = manager.createQuery("From AjustePorDescuento").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
