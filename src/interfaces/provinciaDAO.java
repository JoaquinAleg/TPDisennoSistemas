package interfaces;

import java.util.List;

import POJOS.Provincia;

public interface provinciaDAO {
	public Provincia getProvincia(long idProvincia);
	public void createProvincia(Provincia provincia);
	public void deleteProvincia(Provincia provincia);
	public void updateProvincia(Provincia provincia);
	public List<Provincia> getAll();
}
