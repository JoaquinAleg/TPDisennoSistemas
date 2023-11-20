package interfaces;

import java.util.List;

import POJOS.Localidad;
import POJOS.Provincia;

public interface localidadDAO {
	public Localidad getLocalidad(long idLocalidad);
	public void createLocalidad(Localidad localidad);
	public void deleteLocalidad(Localidad localidad);
	public void updateLocalidad(Localidad localidad);
	public List<Localidad> getAll();
	public List<Localidad> getLocalidadPorProvincia(long idProvincia);
}
