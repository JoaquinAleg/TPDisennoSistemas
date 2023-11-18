package interfaces;

import java.util.List;

import POJOS.Cobertura;

public interface coberturaDAO {
	public Cobertura getCobertura(long idCobertura);
	public void createCobertura(Cobertura cobertura);
	public void deleteCobertura(Cobertura cobertura);
	public void updateCobertura(Cobertura cobertura);
	public List<Cobertura> getAll();
}
