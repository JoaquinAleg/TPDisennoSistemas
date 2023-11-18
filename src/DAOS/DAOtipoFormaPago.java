package DAOS;

import java.util.List;

import POJOS.TipoFormaPago;
import interfaces.tipoFormaPagoDAO;
import jakarta.persistence.EntityManager;

public class DAOtipoFormaPago implements tipoFormaPagoDAO {

	@Override
	public TipoFormaPago getTipoFormaPago(long idTipoFormaPago) {
		EntityManager manager = HibernateUtil.getEntityManager();	
		TipoFormaPago tipoFormaPago = manager.getReference(TipoFormaPago.class, idTipoFormaPago);
		return tipoFormaPago;
	}

	@Override
	public void createTipoFormaPago(TipoFormaPago tipoFormaPago) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(tipoFormaPago);
	}

	@Override
	public void deleteTipoFormaPago(TipoFormaPago tipoFormaPago) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(tipoFormaPago);
		
	}

	@Override
	public void updateTipoFormaPago(TipoFormaPago tipoFormaPago) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(tipoFormaPago);
	}

	@Override
	public List<TipoFormaPago> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<TipoFormaPago> all = manager.createQuery("From TipoFormaPago").getResultList();
		return all;
	}

}
