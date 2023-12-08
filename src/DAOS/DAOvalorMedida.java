package DAOS;

import java.util.List;
import POJOS.ValorMedida;
import interfaces.valorMedidaDAO;
import jakarta.persistence.EntityManager;

public class DAOvalorMedida implements valorMedidaDAO{

	@Override
	public ValorMedida getValorMedida(long idMedida) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			ValorMedida valorMedida = manager.getReference(ValorMedida.class,idMedida);
			return valorMedida;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createValorMedida(ValorMedida Medida) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(Medida);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteValorMedida(ValorMedida Medida) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(Medida);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateValorMedida(ValorMedida Medida) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(Medida);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ValorMedida> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<ValorMedida> all = manager.createQuery("From ValorMedida").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
