package DAOS;

import java.util.List;

import POJOS.AjusteEmision;
import POJOS.AjusteHijo;
import interfaces.ajustePorHijoDAO;
import jakarta.persistence.EntityManager;

public class DAOajusteHijo implements ajustePorHijoDAO {

	@Override
	public AjusteHijo getAjusteHijo(long idAjusteHijo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			AjusteHijo ajuste = manager.getReference(AjusteHijo.class, idAjusteHijo);
			return ajuste;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createAjusteHijo(AjusteHijo ajusteHijo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.persist(ajusteHijo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteAjusteHijo(AjusteHijo ajusteHijo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(ajusteHijo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateAjusteHijo(AjusteHijo ajusteHijo) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(ajusteHijo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<AjusteHijo> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<AjusteHijo> all = manager.createQuery("From AjustePorHijo").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public AjusteHijo buscarAjusteHijo(Integer cantHijos) {
		List<AjusteHijo> ajuste = this.getAll().stream().filter(a -> (a.getCantHijos() == cantHijos)).toList();
		return ajuste.get(0);
	}

}
