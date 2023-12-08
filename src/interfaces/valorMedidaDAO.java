package interfaces;

import java.util.List;

import POJOS.ValorMedida;

public interface valorMedidaDAO {
	public ValorMedida getValorMedida(long idMedida);
	public void createValorMedida(ValorMedida Medida);
	public void deleteValorMedida(ValorMedida Medida);
	public void updateValorMedida(ValorMedida Medida);
	public List<ValorMedida> getAll();
}
