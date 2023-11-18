package interfaces;

import java.util.List;

import POJOS.AjusteKilometro;

public interface ajusteKilometroDAO {
	public AjusteKilometro getAjusteKilometro(long idAjusteKilometro);
	public void createAjusteKilometro(AjusteKilometro ajusteKilometro);
	public void deleteAjusteKilometro(AjusteKilometro ajusteKilometro);
	public void updateAjusteKilometro(AjusteKilometro ajusteKilometro);
	public List<AjusteKilometro> getAll();
}
