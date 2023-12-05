package DAOS;

import java.util.List;

import POJOS.TipoDocumento;
import interfaces.tipoDocumentoDAO;
import jakarta.persistence.EntityManager;

public class DAOtipoDocumento implements tipoDocumentoDAO {

	@Override
	public TipoDocumento getTipoDocumento(long idTipoDocumento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();		
			TipoDocumento tipoDocumento = manager.getReference(TipoDocumento.class, idTipoDocumento);
			return tipoDocumento;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createTipoDocumento(TipoDocumento tipoDocumento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(tipoDocumento);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteTipoDocumento(TipoDocumento tipoDocumento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(tipoDocumento);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateTipoDocumento(TipoDocumento tipoDocumento) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(tipoDocumento);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<TipoDocumento> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<TipoDocumento> all = manager.createQuery("From TipoDocumento").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
