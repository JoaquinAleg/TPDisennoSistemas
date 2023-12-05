package DAOS;

import java.util.List;

import POJOS.AjusteDescuento;
import POJOS.MedidaSeguridad;
import POJOS.MedidasPoliza;
import interfaces.medidasPolizaDAO;
import jakarta.persistence.EntityManager;

public class DAOmedidasPoliza implements medidasPolizaDAO{

	@Override
	public MedidasPoliza getMedida(long idMedida) {
		// TODO Auto-generated method stub
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			MedidasPoliza medida = manager.getReference(MedidasPoliza.class,idMedida);
			return medida;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public void createMedida(MedidasPoliza medida) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(medida);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteMedida(MedidasPoliza medida) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(medida);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateMedida(MedidasPoliza medida) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(medida);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<MedidasPoliza> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<MedidasPoliza> all = manager.createQuery("From MedidasPoliza").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
