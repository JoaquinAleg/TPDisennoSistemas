package interfaces;

import java.util.List;

import POJOS.TipoSexo;

public interface tipoSexoDAO {
	public TipoSexo getTipoSexo(long idTipoSexo);
	public void createTipoSexo(TipoSexo TipoSexo);
	public void deleteTipoSexo(TipoSexo TipoSexo);
	public void updateTipoSexo(TipoSexo TipoSexo);
	public List<TipoSexo> getAll();
}
