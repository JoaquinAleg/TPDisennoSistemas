package DAOS;

import java.util.List;

import POJOS.TipoCondicionCliente;
import interfaces.tipoCondicionClienteDAO;
import jakarta.persistence.EntityManager;

public class DAOtipoCondicionCliente implements tipoCondicionClienteDAO {

	@Override
	public TipoCondicionCliente getTipoCondicionCliente(long idTipoCondicionCliente) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();	
			TipoCondicionCliente tipoCondicionCliente = manager.getReference(TipoCondicionCliente.class, idTipoCondicionCliente);
			return tipoCondicionCliente;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createTipoCondicionCliente(TipoCondicionCliente tipoCondicionCliente) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.persist(tipoCondicionCliente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteTipoCondicionCliente(TipoCondicionCliente tipoCondicionCliente) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(tipoCondicionCliente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateTipoCondicionCliente(TipoCondicionCliente tipoCondicionCliente) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(tipoCondicionCliente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<TipoCondicionCliente> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<TipoCondicionCliente> all = manager.createQuery("From TipoCondicionCliente").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}