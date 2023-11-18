package DAOS;

import java.util.List;

import POJOS.Localidad;
import POJOS.MedidaSeguridad;
import interfaces.medidaSeguridadDAO;
import jakarta.persistence.EntityManager;

public class DAOmedidaSeguridad implements medidaSeguridadDAO {

	@Override
	public MedidaSeguridad getMedidaSeguridad(long idMedidaSeguridad) {
		EntityManager manager = HibernateUtil.getEntityManager();
		MedidaSeguridad medida = manager.getReference(MedidaSeguridad.class, idMedidaSeguridad);
		return medida;
	}

	@Override
	public void createMedidaSeguridad(MedidaSeguridad medidaSeguridad) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(medidaSeguridad);
		
	}

	@Override
	public void deleteMedidaSeguridad(MedidaSeguridad medidaSeguridad) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(medidaSeguridad);
		
	}

	@Override
	public void updateMedidaSeguridad(MedidaSeguridad medidaSeguridad) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(medidaSeguridad);
		
	}

	@Override
	public List<MedidaSeguridad> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<MedidaSeguridad> all = manager.createQuery("From MedidaSeguridad").getResultList();
		return all;
	}

}
