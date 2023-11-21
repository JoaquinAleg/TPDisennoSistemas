package Test;

import jakarta.persistence.Persistence;

import java.util.List;

import DAOS.DAOlocalidad;
import DAOS.HibernateUtil;
import Gestores.GestorPoliza;
import POJOS.AjusteSiniestro;
import POJOS.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class TestPersona {
	private static DAOlocalidad daoLocalidad;
	private static GestorPoliza gestorPoliza;
	public static void main(String[] args) {
		HibernateUtil.createEMF();
		EntityManager manager = HibernateUtil.getEntityManager();
		gestorPoliza = GestorPoliza.getInstance();
		List<AjusteSiniestro> ajustes = manager.createQuery("From AjusteSiniestro").getResultList();
		System.out.println(ajustes.get(0).getCantidadSiniestros());
		
		
	}
}
