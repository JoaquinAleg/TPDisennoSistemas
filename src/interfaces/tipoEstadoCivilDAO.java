package interfaces;

import java.util.List;

import POJOS.TipoEstadoCivil;

public interface tipoEstadoCivilDAO {
	public TipoEstadoCivil getTipoEstadoCivil(long idTipoEstadoCivil);
	public void createTipoEstadoCivil(TipoEstadoCivil TipoEstadoCivil);
	public void deleteTipoEstadoCivil(TipoEstadoCivil TipoEstadoCivil);
	public void updateTipoEstadoCivil(TipoEstadoCivil TipoEstadoCivil);
	public List<TipoEstadoCivil> getAll();
}
