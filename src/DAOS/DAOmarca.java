package DAOS;

import java.util.List;

import POJOS.Localidad;
import POJOS.Marca;
import interfaces.marcaDAO;
import jakarta.persistence.EntityManager;

public class DAOmarca implements marcaDAO{

	@Override
	public Marca getMarca(long idMarca) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			Marca Marca = manager.getReference(Marca.class, idMarca);
			return Marca;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createMarca(Marca marca) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(marca);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMarca(Marca marca) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(marca);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateMarca(Marca marca) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(marca);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Marca> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<Marca> all = manager.createQuery("From Marca").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
