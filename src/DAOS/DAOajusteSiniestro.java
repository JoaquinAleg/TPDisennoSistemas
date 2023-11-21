package DAOS;

import java.util.List;

import POJOS.AjusteSiniestro;
import interfaces.ajusteSiniestroDAO;
import jakarta.persistence.*;

public class DAOajusteSiniestro implements ajusteSiniestroDAO{

	@Override
	public AjusteSiniestro getAjusteSiniestro(long idAjusteSiniestro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			AjusteSiniestro ajuste = manager.getReference(AjusteSiniestro.class, idAjusteSiniestro);
			return ajuste;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createAjusteSiniestro(AjusteSiniestro ajusteSiniestro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.persist(ajusteSiniestro);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteAjusteSiniestro(AjusteSiniestro ajusteSiniestro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(ajusteSiniestro);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateAjusteSiniestro(AjusteSiniestro ajusteSiniestro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(ajusteSiniestro);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<AjusteSiniestro> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<AjusteSiniestro> all = manager.createQuery("From AjusteSiniestro").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
