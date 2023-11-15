package Test;

import jakarta.persistence.Persistence;

import java.util.List;

import POJOS.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class TestPersona {
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("persistencia");
		manager = emf.createEntityManager();
		
		
		List<Persona> personas = manager.createQuery("FROM Persona").getResultList();
		System.out.println("Cantidad de Personas" + personas.size());
	}
}
