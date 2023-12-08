package interfaces;

import java.util.List;

import POJOS.ValorEmision;

public interface valorEmisionDAO {
	public ValorEmision getValorEmision(long idEmision);
	public void createValorEmision(ValorEmision Emision);
	public void deleteValorEmision(ValorEmision Emision);
	public void updateValorEmision(ValorEmision Emision);
	public List<ValorEmision> getAll();
}
