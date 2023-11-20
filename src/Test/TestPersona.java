package Test;

import jakarta.persistence.Persistence;

import java.util.List;

import DAOS.DAOlocalidad;
import DAOS.HibernateUtil;
import POJOS.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class TestPersona {
	private static DAOlocalidad daoLocalidad;
	
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("persistencia");
		manager = factory.createEntityManager();
		
		
		
	}
}
