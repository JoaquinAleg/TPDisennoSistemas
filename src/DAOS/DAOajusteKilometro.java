package DAOS;

import java.util.List;

import POJOS.AjusteDescuento;
import POJOS.AjusteHijo;
import POJOS.AjusteKilometro;
import interfaces.ajusteKilometroDAO;
import jakarta.persistence.EntityManager;

public class DAOajusteKilometro implements ajusteKilometroDAO{

	@Override
	public AjusteKilometro getAjusteKilometro(long idAjusteKilometro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			AjusteKilometro ajuste = manager.getReference(AjusteKilometro.class, idAjusteKilometro);
			return ajuste;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createAjusteKilometro(AjusteKilometro ajusteKilometro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(ajusteKilometro);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAjusteKilometro(AjusteKilometro ajusteKilometro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(ajusteKilometro);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateAjusteKilometro(AjusteKilometro ajusteKilometro) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.persist(ajusteKilometro);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<AjusteKilometro> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			List<AjusteKilometro> all = manager.createQuery("From AjusteKilometro").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public AjusteKilometro buscarAjusteKilometro(Integer integer) {
		List<AjusteKilometro> ajuste = this.getAll().stream().filter(a -> a.getEscalaKM() <= integer).toList();
		return ajuste.get(ajuste.size()-1);
		}
}
