package DAOS;

import java.util.List;

import POJOS.Cliente;
import interfaces.clienteDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Root;

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
			manager.getTransaction().begin();
			manager.persist(cliente);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCliente(Cliente cliente) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.remove(cliente);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateCliente(Cliente cliente) {
		try {
			EntityManager manager = HibernateUtil.getEntityManager();
			manager.getTransaction().begin();
			manager.merge(cliente);
			manager.getTransaction().commit();
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
	
	
	public List<Cliente> getClientes(Long numeroCliente, String apellido, String nombre, Long tipoDocumento, String numeroDocumento){
		return this.getAll().stream().filter(a -> (numeroCliente == null || a.getIdCliente() == (long)numeroCliente))
									 .filter(a -> (apellido == null || apellido.equals("") || a.getPersona().getApellido().toLowerCase().contains(apellido.toLowerCase())))
									 .filter(a -> (nombre == null || nombre.equals("") || a.getPersona().getNombre().toLowerCase().contains(nombre.toLowerCase())))
									 .filter(a -> (tipoDocumento == null || a.getPersona().getIdTipoDocumento().getIdTipoDocumento() == (long)tipoDocumento))
									 .filter(a -> (numeroDocumento == null || numeroDocumento.equals("") || a.getPersona().getDocumento().startsWith(numeroDocumento))).toList();									  
	}
}
