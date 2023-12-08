package DAOS;

import java.util.List;
import POJOS.ValorCobertura;
import interfaces.valorCoberturaDAO;
import jakarta.persistence.EntityManager;

public class DAOvalorCobertura implements valorCoberturaDAO{

	@Override
	public ValorCobertura getValorCobertura(long idCobertura) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			ValorCobertura valorCobertura = manager.getReference(ValorCobertura.class,idCobertura);
			return valorCobertura;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createValorCobertura(ValorCobertura Cobertura) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(Cobertura);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteValorCobertura(ValorCobertura Cobertura) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(Cobertura);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateValorCobertura(ValorCobertura Cobertura) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(Cobertura);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ValorCobertura> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<ValorCobertura> all = manager.createQuery("From ValorCobertura").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
