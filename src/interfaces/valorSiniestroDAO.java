package interfaces;

import java.util.List;

import POJOS.ValorSiniestro;

public interface valorSiniestroDAO {
	public ValorSiniestro getValorSiniestro(long idSiniestro);
	public void createValorSiniestro(ValorSiniestro Siniestro);
	public void deleteValorSiniestro(ValorSiniestro Siniestro);
	public void updateValorSiniestro(ValorSiniestro Siniestro);
	public List<ValorSiniestro> getAll();
}
