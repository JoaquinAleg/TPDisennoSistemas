package interfaces;

import java.util.List;

import POJOS.ValorCobertura;

public interface valorCoberturaDAO {
	public ValorCobertura getValorCobertura(long idCobertura);
	public void createValorCobertura(ValorCobertura Cobertura);
	public void deleteValorCobertura(ValorCobertura Cobertura);
	public void updateValorCobertura(ValorCobertura Cobertura);
	public List<ValorCobertura> getAll();
}
