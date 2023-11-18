package DAOS;

import java.util.List;

import POJOS.Cobertura;
import POJOS.Cuota;
import interfaces.cuotaDAO;
import jakarta.persistence.EntityManager;

public class DAOcuota implements cuotaDAO{

	@Override
	public Cuota getCuota(long idCuota) {
		EntityManager manager = HibernateUtil.getEntityManager();
		Cuota cuota = manager.getReference(Cuota.class, idCuota);
		return cuota;
	}

	@Override
	public void createCuota(Cuota cuota) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(cuota);
		
	}

	@Override
	public void deleteCuota(Cuota cuota) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(cuota);
		
	}

	@Override
	public void updateCuota(Cuota cuota) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(cuota);
		
	}

	@Override
	public List<Cuota> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<Cuota> all = manager.createQuery("From Cuota").getResultList();
		return all;
	}

}
