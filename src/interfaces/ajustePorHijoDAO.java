package interfaces;

import java.util.List;

import POJOS.AjusteHijo;

public interface ajustePorHijoDAO {
	public AjusteHijo getAjusteHijo(long idAjusteHijo);
	public void createAjusteHijo(AjusteHijo ajusteHijo);
	public void deleteAjusteHijo(AjusteHijo ajusteHijo);
	public void updateAjusteHijo(AjusteHijo ajusteHijo);
	public List<AjusteHijo> getAll();
}
