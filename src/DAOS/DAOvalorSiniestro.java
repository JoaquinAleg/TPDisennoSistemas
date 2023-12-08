package DAOS;

import java.util.List;
import POJOS.ValorSiniestro;
import interfaces.valorSiniestroDAO;
import jakarta.persistence.EntityManager;

public class DAOvalorSiniestro implements valorSiniestroDAO{

	@Override
	public ValorSiniestro getValorSiniestro(long idSiniestro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			ValorSiniestro valorSiniestro = manager.getReference(ValorSiniestro.class,idSiniestro);
			return valorSiniestro;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createValorSiniestro(ValorSiniestro Siniestro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(Siniestro);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteValorSiniestro(ValorSiniestro Siniestro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(Siniestro);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateValorSiniestro(ValorSiniestro Siniestro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(Siniestro);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ValorSiniestro> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<ValorSiniestro> all = manager.createQuery("From ValorSiniestro").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
