package DAOS;

import java.util.List;

import POJOS.AnioFabricacion;
import POJOS.Cliente;
import interfaces.clienteDAO;
import jakarta.persistence.EntityManager;

public class DAOcliente implements clienteDAO{

	@Override
	public Cliente getCliente(long idCliente) {
		EntityManager manager = HibernateUtil.getEntityManager();
		Cliente cliente = manager.find(Cliente.class, idCliente);
		return cliente;
	}

	@Override
	public void createCliente(Cliente cliente) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.persist(cliente);
	}

	@Override
	public void deleteCliente(Cliente cliente) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.remove(cliente);
	}

	@Override
	public void updateCliente(Cliente cliente) {
		EntityManager manager = HibernateUtil.getEntityManager();
		manager.merge(cliente);
		
	}

	@Override
	public List<Cliente> getAll() {
		EntityManager manager = HibernateUtil.getEntityManager();
		@SuppressWarnings("unchecked")
		List<Cliente> all = manager.createQuery("from Cliente").getResultList();
		return all;
	}

}
