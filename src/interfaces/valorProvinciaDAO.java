package interfaces;

import java.util.List;

import POJOS.ValorProvincia;

public interface valorProvinciaDAO {
	public ValorProvincia getValorProvincia(long idProvincia);
	public void createValorProvincia(ValorProvincia Provincia);
	public void deleteValorProvincia(ValorProvincia Provincia);
	public void updateValorProvincia(ValorProvincia Provincia);
	public List<ValorProvincia> getAll();
}
