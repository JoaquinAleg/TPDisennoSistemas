package interfaces;

import java.util.List;

import POJOS.Marca;

public interface marcaDAO {
	public Marca getMarca(long Marca);
	public void createMarca(Marca marca);
	public void deleteMarca(Marca marca);
	public void updateMarca(Marca marca);
	public List<Marca> getAll();
}
