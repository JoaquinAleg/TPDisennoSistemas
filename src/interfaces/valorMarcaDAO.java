package interfaces;

import java.util.List;

import POJOS.ValorMarca;

public interface valorMarcaDAO {
	public ValorMarca getValorMarca(long idMarca);
	public void createValorMarca(ValorMarca Marca);
	public void deleteValorMarca(ValorMarca Marca);
	public void updateValorMarca(ValorMarca Marca);
	public List<ValorMarca> getAll();
}
