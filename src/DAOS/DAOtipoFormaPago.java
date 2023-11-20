package DAOS;

import java.util.List;

import POJOS.TipoFormaPago;
import interfaces.tipoFormaPagoDAO;
import jakarta.persistence.EntityManager;

public class DAOtipoFormaPago implements tipoFormaPagoDAO {

	@Override
	public TipoFormaPago getTipoFormaPago(long idTipoFormaPago) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();	
			TipoFormaPago tipoFormaPago = manager.getReference(TipoFormaPago.class, idTipoFormaPago);
			return tipoFormaPago;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createTipoFormaPago(TipoFormaPago tipoFormaPago) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.persist(tipoFormaPago);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteTipoFormaPago(TipoFormaPago tipoFormaPago) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(tipoFormaPago);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateTipoFormaPago(TipoFormaPago tipoFormaPago) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(tipoFormaPago);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<TipoFormaPago> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<TipoFormaPago> all = manager.createQuery("From TipoFormaPago").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
