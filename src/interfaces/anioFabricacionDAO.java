package interfaces;
import java.util.List;

import POJOS.AnioFabricacion;
public interface anioFabricacionDAO {
	public AnioFabricacion getAnioFabricacion(long idAnioFabricacion);
	public void createAnioFabricacion(AnioFabricacion AnioFabricacion);
	public void deleteAnioFabricacion(AnioFabricacion AnioFabricacion);
	public void updateAnioFabricacion(AnioFabricacion AnioFabricacion);
	public List<AnioFabricacion> getAll();
}
