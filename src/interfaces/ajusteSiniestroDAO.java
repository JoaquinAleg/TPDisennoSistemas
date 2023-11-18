package interfaces;

import java.util.List;

import POJOS.AjusteSiniestro;

public interface ajusteSiniestroDAO {
	public AjusteSiniestro getAjusteSiniestro(long idAjusteSiniestro);
	public void createAjusteSiniestro(AjusteSiniestro ajusteSiniestro);
	public void deleteAjusteSiniestro(AjusteSiniestro ajusteSiniestro);
	public void updateAjusteSiniestro(AjusteSiniestro ajusteSiniestro);
	public List<AjusteSiniestro> getAll();
}
