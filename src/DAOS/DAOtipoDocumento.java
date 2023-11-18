package DAOS;

import java.util.List;

import POJOS.TipoDocumento;
import interfaces.tipoDocumentoDAO;
import jakarta.persistence.EntityManager;

public class DAOtipoDocumento implements tipoDocumentoDAO {

	@Override
	public TipoDocumento getTipoDocumento(long idTipoDocumento) {
		EntityManager manager = HibernateUtil.getEntityManager();		
		TipoDocumento tipoDocumento = manager.getReference(TipoDocumento.class, idTipoDocumento);
		return tipoDocumento;
	}

	@Override
	public void createTipoDocumento(TipoDocumento tipoDocumento) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(tipoDocumento);
	}

	@Override
	public void deleteTipoDocumento(TipoDocumento tipoDocumento) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(tipoDocumento);
		
	}

	@Override
	public void updateTipoDocumento(TipoDocumento tipoDocumento) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(tipoDocumento);
		
	}

	@Override
	public List<TipoDocumento> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<TipoDocumento> all = manager.createQuery("From TipoDocumento").getResultList();
		return all;
	}

}
