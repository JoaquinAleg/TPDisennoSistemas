package interfaces;

import java.util.List;

import POJOS.TipoDocumento;

public interface tipoDocumentoDAO {
	public TipoDocumento getTipoDocumento(long idTipoDocumento);
	public void createTipoDocumento(TipoDocumento tipoDocumento);
	public void deleteTipoDocumento(TipoDocumento tipoDocumento);
	public void updateTipoDocumento(TipoDocumento tipoDocumento);
	public List<TipoDocumento> getAll();
}
