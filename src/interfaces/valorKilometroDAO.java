package interfaces;

import java.util.List;

import POJOS.ValorKilometro;

public interface valorKilometroDAO {
	public ValorKilometro getValorKilometro(long idKilometro);
	public void createValorKilometro(ValorKilometro Kilometro);
	public void deleteValorKilometro(ValorKilometro Kilometro);
	public void updateValorKilometro(ValorKilometro Kilometro);
	public List<ValorKilometro> getAll();
}
