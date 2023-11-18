package DAOS;

import java.util.List;

import POJOS.TipoEstadoCivil;
import interfaces.tipoEstadoCivilDAO;
import jakarta.persistence.EntityManager;

public class DAOtipoEstadoCivil implements tipoEstadoCivilDAO {

	@Override
	public TipoEstadoCivil getTipoEstadoCivil(long idTipoEstadoCivil) {
		EntityManager manager = HibernateUtil.getEntityManager();		
		TipoEstadoCivil tipoEstadoCivil = manager.getReference(TipoEstadoCivil.class, idTipoEstadoCivil);
		return tipoEstadoCivil;
	}

	@Override
	public void createTipoEstadoCivil(TipoEstadoCivil TipoEstadoCivil) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(TipoEstadoCivil);
		
	}

	@Override
	public void deleteTipoEstadoCivil(TipoEstadoCivil TipoEstadoCivil) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(TipoEstadoCivil);
		
	}

	@Override
	public void updateTipoEstadoCivil(TipoEstadoCivil TipoEstadoCivil) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(TipoEstadoCivil);
		
	}

	@Override
	public List<TipoEstadoCivil> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<TipoEstadoCivil> all = manager.createQuery("From TipoEstadoCivil").getResultList();
		return all;
	}

}
