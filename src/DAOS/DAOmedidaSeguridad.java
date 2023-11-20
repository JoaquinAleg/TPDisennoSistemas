package DAOS;

import java.util.List;

import POJOS.Cuota;
import POJOS.MedidaSeguridad;
import interfaces.medidaSeguridadDAO;
import jakarta.persistence.EntityManager;

public class DAOmedidaSeguridad implements medidaSeguridadDAO {

	@Override
	public MedidaSeguridad getMedidaSeguridad(long idMedidaSeguridad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			MedidaSeguridad medida = manager.getReference(MedidaSeguridad.class, idMedidaSeguridad);
			return medida;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createMedidaSeguridad(MedidaSeguridad medidaSeguridad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.persist(medidaSeguridad);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMedidaSeguridad(MedidaSeguridad medidaSeguridad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(medidaSeguridad);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateMedidaSeguridad(MedidaSeguridad medidaSeguridad) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(medidaSeguridad);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<MedidaSeguridad> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<MedidaSeguridad> all = manager.createQuery("From AjustePorHijo").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
