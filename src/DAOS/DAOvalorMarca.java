package DAOS;

import java.util.List;
import POJOS.ValorMarca;
import interfaces.valorMarcaDAO;
import jakarta.persistence.EntityManager;

public class DAOvalorMarca implements valorMarcaDAO{

	@Override
	public ValorMarca getValorMarca(long idMarca) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			ValorMarca valorMarca = manager.getReference(ValorMarca.class,idMarca);
			return valorMarca;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createValorMarca(ValorMarca Marca) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(Marca);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteValorMarca(ValorMarca Marca) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(Marca);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateValorMarca(ValorMarca Marca) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(Marca);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ValorMarca> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<ValorMarca> all = manager.createQuery("From ValorMarca").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
