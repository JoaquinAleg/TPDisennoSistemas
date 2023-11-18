package DAOS;

import java.util.List;

import POJOS.AjusteDescuento;
import interfaces.ajusteDescuentoDAO;
import jakarta.persistence.EntityManager;

public class DAOajusteDescuento implements ajusteDescuentoDAO {

	@Override
	public AjusteDescuento getAjusteDescuento(long idAjusteDescuento) {
		EntityManager manager = HibernateUtil.getEntityManager();
		AjusteDescuento ajusteDescuento = manager.getReference(AjusteDescuento.class,idAjusteDescuento);
		return ajusteDescuento;
	}

	@Override
	public void createAjusteDescuento(AjusteDescuento ajusteDescuento) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(ajusteDescuento);
		
	}

	@Override
	public void deleteAjusteDescuento(AjusteDescuento ajusteDescuento) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(ajusteDescuento);
		
	}

	@Override
	public void updateAjusteDescuento(AjusteDescuento ajusteDescuento) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(ajusteDescuento);
	}

	@Override
	public List<AjusteDescuento> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<AjusteDescuento> all = manager.createQuery("From AjustePorDescuentoUnidadAd").getResultList();
		return all;
	}

}
