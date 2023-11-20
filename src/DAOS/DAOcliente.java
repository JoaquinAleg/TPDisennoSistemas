package DAOS;

import java.util.List;

import POJOS.AnioFabricacion;
import POJOS.Cliente;
import interfaces.clienteDAO;
import jakarta.persistence.EntityManager;

public class DAOcliente implements clienteDAO{

	@Override
	public Cliente getCliente(long idCliente) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			Cliente cliente = manager.find(Cliente.class, idCliente);
			return cliente;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createCliente(Cliente cliente) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.persist(cliente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCliente(Cliente cliente) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.remove(cliente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateCliente(Cliente cliente) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.merge(cliente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Cliente> getAll() {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			@SuppressWarnings("unchecked")
			List<Cliente> all = manager.createQuery("from Cliente").getResultList();
			return all;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
