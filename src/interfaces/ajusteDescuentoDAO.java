package interfaces;

import java.util.List;

import POJOS.AjusteDescuento;

public interface ajusteDescuentoDAO {
	public AjusteDescuento getAjusteDescuento(long idAjusteDescuento);
	public void createAjusteDescuento(AjusteDescuento ajusteDescuento);
	public void deleteAjusteDescuento(AjusteDescuento ajusteDescuento);
	public void updateAjusteDescuento(AjusteDescuento ajusteDescuento);
	public List<AjusteDescuento> getAll();
}
