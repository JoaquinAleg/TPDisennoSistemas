package DAOS;

import java.util.List;

import POJOS.Modelo;
import interfaces.modeloDAO;
import jakarta.persistence.EntityManager;

public class DAOmodelo implements modeloDAO{

	@Override
	public Modelo getModelo(long idModelo) {
		EntityManager manager = HibernateUtil.getEntityManager();		
		Modelo modelo = manager.getReference(Modelo.class, idModelo);
		return modelo;
	}

	@Override
	public void createModelo(Modelo modelo) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(modelo);
		
	}

	@Override
	public void deleteModelo(Modelo modelo) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(modelo);
		
	}

	@Override
	public void updateModelo(Modelo modelo) {
		// TODO Auto-generated method stub
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(modelo);
	}

	@Override
	public List<Modelo> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<Modelo> all = manager.createQuery("From Modelo").getResultList();
		return all;
	}

}
