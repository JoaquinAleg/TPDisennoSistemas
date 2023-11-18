package interfaces;

import java.util.List;

import POJOS.Modelo;

public interface modeloDAO {
	public Modelo getModelo(long idModelo);
	public void createModelo(Modelo localidad);
	public void deleteModelo(Modelo localidad);
	public void updateModelo(Modelo localidad);
	public List<Modelo> getAll();
}
