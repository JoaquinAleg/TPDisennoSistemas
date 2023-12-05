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
			manager.getTransaction().begin();
			manager.persist(ajusteDescuento);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteAjusteDescuento(AjusteDescuento ajusteDescuento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(ajusteDescuento);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateAjusteDescuento(AjusteDescuento ajusteDescuento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(ajusteDescuento);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<AjusteDescuento> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<AjusteDescuento> all = manager.createQuery("From AjusteDescuento").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public AjusteDescuento buscarAjusteUnidadAd(Integer cantUnidades) {
		List<AjusteDescuento> ajuste = this.getAll().stream().filter(a -> a.getAjusteDescuento() <= (Integer)cantUnidades).toList();
		return ajuste.get(ajuste.size()-1);
	}
}
