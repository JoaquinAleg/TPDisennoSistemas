package DAOS;

import java.util.List;

import POJOS.TipoFormaPago;
import POJOS.TipoSexo;
import interfaces.tipoSexoDAO;
import jakarta.persistence.EntityManager;

public class DAOtipoSexo implements tipoSexoDAO {

	@Override
	public TipoSexo getTipoSexo(long idTipoSexo) {
		EntityManager manager = HibernateUtil.getEntityManager();
		TipoSexo sexo = manager.getReference(TipoSexo.class, idTipoSexo);
		return sexo;
	}

	@Override
	public void createTipoSexo(TipoSexo TipoSexo) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(TipoSexo);
	}

	@Override
	public void deleteTipoSexo(TipoSexo TipoSexo) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(TipoSexo);
	}

	@Override
	public void updateTipoSexo(TipoSexo TipoSexo) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(TipoSexo);
		
	}

	@Override
	public List<TipoSexo> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<TipoSexo> all = manager.createQuery("From TipoSexo").getResultList();
		return all;
	}

}
