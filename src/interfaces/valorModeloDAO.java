package interfaces;

import java.util.List;

import POJOS.ValorModelo;

public interface valorModeloDAO {
	public ValorModelo getValorModelo(long idModelo);
	public void createValorModelo(ValorModelo Modelo);
	public void deleteValorModelo(ValorModelo Modelo);
	public void updateValorModelo(ValorModelo Modelo);
	public List<ValorModelo> getAll();
}
