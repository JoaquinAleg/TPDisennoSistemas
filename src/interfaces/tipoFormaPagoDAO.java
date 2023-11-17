package interfaces;

import java.util.List;

import POJOS.TipoFormaPago;

public interface tipoFormaPagoDAO {
	public TipoFormaPago getTipoFormaPago(long idTipoDocumento);
	public void createTipoFormaPago(TipoFormaPago TipoFormaPago);
	public void deleteTipoFormaPago(TipoFormaPago TipoFormaPago);
	public void updateTipoFormaPago(TipoFormaPago TipoFormaPago);
	public List<TipoFormaPago> getAll();
}
