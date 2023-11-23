package Test;

import jakarta.persistence.Persistence;

import java.util.List;

import DAOS.DAOlocalidad;
import DAOS.DAOtipoSexo;
import DAOS.HibernateUtil;
import DTOS.ListadoDTO;
import Gestores.GestorPoliza;
import POJOS.AjusteSiniestro;
import POJOS.Persona;
import POJOS.TipoSexo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class TestPersona {
	private static DAOtipoSexo daoTipoSexo;
	private static GestorPoliza gestorPoliza;
	public static void main(String[] args) {
		HibernateUtil.createEMF();
		EntityManager manager = HibernateUtil.getEntityManager();
		daoTipoSexo = new DAOtipoSexo();
		gestorPoliza = GestorPoliza.getInstance();
		//List<AjusteSiniestro> ajustes = manager.createQuery("From AjusteSiniestro").getResultList();
		//System.out.println(ajustes.get(0).getCantidadSiniestros());
		List<TipoSexo> sexos = daoTipoSexo.getAll();
		System.out.println(sexos.get(0).getIdTipoSexo());
		
		List<ListadoDTO> sexoDTO = gestorPoliza.getSexos();
		System.out.println(sexoDTO.get(1).getId());
		
	}
}
