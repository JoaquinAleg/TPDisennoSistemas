package Test;

import jakarta.persistence.Persistence;

import java.util.List;

import DAOS.HibernateUtil;
import POJOS.AjusteDescuento;
import POJOS.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class TestPersona {
	
	public static void main(String[] args) {
		EntityManager manager = HibernateUtil.getEntityManager();
		//List<Persona> personas = manager.createQuery("FROM Persona").getResultList();
		
		
		//System.out.println("Cantidad de Personas " + personas.size());
	}
}
