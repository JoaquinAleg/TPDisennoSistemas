package interfaces;

import java.util.List;

import POJOS.ValorLocalidad;

public interface valorLocalidadDAO {
	public ValorLocalidad getValorLocalidad(long idLocalidad);
	public void createValorLocalidad(ValorLocalidad Localidad);
	public void deleteValorLocalidad(ValorLocalidad Localidad);
	public void updateValorLocalidad(ValorLocalidad Localidad);
	public List<ValorLocalidad> getAll();
}
