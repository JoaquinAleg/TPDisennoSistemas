package interfaces;

import java.util.List;

import POJOS.ValorDescuento;

public interface valorDescuentoDAO {
	public ValorDescuento getValorDescuento(long idDescuento);
	public void createValorDescuento(ValorDescuento descuento);
	public void deleteValorDescuento(ValorDescuento descuento);
	public void updateValorDescuento(ValorDescuento descuento);
	public List<ValorDescuento> getAll();
}
