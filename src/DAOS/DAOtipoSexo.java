package DAOS;

import java.util.List;

import POJOS.Poliza;
import POJOS.TipoSexo;
import interfaces.tipoSexoDAO;
import jakarta.persistence.EntityManager;

public class DAOtipoSexo implements tipoSexoDAO {

	@Override
	public TipoSexo getTipoSexo(long idTipoSexo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			TipoSexo sexo = manager.getReference(TipoSexo.class, idTipoSexo);
			return sexo;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createTipoSexo(TipoSexo TipoSexo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(TipoSexo);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteTipoSexo(TipoSexo TipoSexo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(TipoSexo);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateTipoSexo(TipoSexo TipoSexo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(TipoSexo);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<TipoSexo> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<TipoSexo> all = manager.createQuery("From TipoSexo").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
