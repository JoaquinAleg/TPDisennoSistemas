package interfaces;

import java.util.List;

import POJOS.AjusteEmision;

public interface ajusteEmisionDAO {
	public AjusteEmision getAjusteEmision(long idAjusteEmision);
	public void createAjusteEmision(AjusteEmision ajusteEmision);
	public void deleteAjusteEmision(AjusteEmision ajusteEmision);
	public void updateAjusteEmision(AjusteEmision ajusteEmision);
	public List<AjusteEmision> getAll();
}
