package DAOS;

import java.util.List;

import POJOS.AjusteKilometro;
import interfaces.ajusteKilometroDAO;
import jakarta.persistence.EntityManager;

public class DAOajusteKilometro implements ajusteKilometroDAO{

	@Override
	public AjusteKilometro getAjusteKilometro(long idAjusteKilometro) {
		EntityManager manager = HibernateUtil.getEntityManager();
		AjusteKilometro ajusteKilometro = manager.getReference(AjusteKilometro.class, idAjusteKilometro);
		return ajusteKilometro;
	}

	@Override
	public void createAjusteKilometro(AjusteKilometro ajusteKilometro) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(ajusteKilometro);
	}

	@Override
	public void deleteAjusteKilometro(AjusteKilometro ajusteKilometro) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(ajusteKilometro);
	}

	@Override
	public void updateAjusteKilometro(AjusteKilometro ajusteKilometro) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(ajusteKilometro);
	}

	@Override
	public List<AjusteKilometro> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		List<AjusteKilometro> all = manager.createQuery("From AjustePorKilometro").getResultList();
		return all;
	}

}
