package DAOS;

import java.util.List;

import POJOS.TipoEstadoCivil;
import interfaces.tipoEstadoCivilDAO;
import jakarta.persistence.EntityManager;

public class DAOtipoEstadoCivil implements tipoEstadoCivilDAO {

	@Override
	public TipoEstadoCivil getTipoEstadoCivil(long idTipoEstadoCivil) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();		
			TipoEstadoCivil tipoEstadoCivil = manager.getReference(TipoEstadoCivil.class, idTipoEstadoCivil);
			return tipoEstadoCivil;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createTipoEstadoCivil(TipoEstadoCivil TipoEstadoCivil) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.persist(TipoEstadoCivil);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteTipoEstadoCivil(TipoEstadoCivil TipoEstadoCivil) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(TipoEstadoCivil);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateTipoEstadoCivil(TipoEstadoCivil TipoEstadoCivil) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(TipoEstadoCivil);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<TipoEstadoCivil> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<TipoEstadoCivil> all = manager.createQuery("From TipoEstadoCivil").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
