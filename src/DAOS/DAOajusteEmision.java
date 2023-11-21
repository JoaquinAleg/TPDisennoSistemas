package DAOS;

import java.util.List;

import POJOS.AjusteDescuento;
import POJOS.AjusteEmision;
import interfaces.ajusteEmisionDAO;
import jakarta.persistence.EntityManager;

public class DAOajusteEmision implements ajusteEmisionDAO{

	@Override
	public AjusteEmision getAjusteEmision(long idAjusteEmision) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			AjusteEmision ajuste = manager.getReference(AjusteEmision.class, idAjusteEmision);
			return ajuste;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createAjusteEmision(AjusteEmision ajusteEmision) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.persist(ajusteEmision);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteAjusteEmision(AjusteEmision ajusteEmision) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(ajusteEmision);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateAjusteEmision(AjusteEmision ajusteEmision) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(ajusteEmision);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<AjusteEmision> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<AjusteEmision> all = manager.createQuery("From AjusteEmision").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}



	
}
