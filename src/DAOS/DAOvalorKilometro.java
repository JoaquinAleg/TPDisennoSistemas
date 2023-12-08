package DAOS;

import java.util.List;
import POJOS.ValorKilometro;
import interfaces.valorKilometroDAO;
import jakarta.persistence.EntityManager;

public class DAOvalorKilometro implements valorKilometroDAO{

	@Override
	public ValorKilometro getValorKilometro(long idKilometro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			ValorKilometro valorKilometro = manager.getReference(ValorKilometro.class,idKilometro);
			return valorKilometro;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createValorKilometro(ValorKilometro Kilometro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(Kilometro);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteValorKilometro(ValorKilometro Kilometro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(Kilometro);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateValorKilometro(ValorKilometro Kilometro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(Kilometro);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ValorKilometro> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<ValorKilometro> all = manager.createQuery("From ValorKilometro").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
