package interfaces;

import java.util.List;

import POJOS.MedidasPoliza;

public interface medidasPolizaDAO {
	public MedidasPoliza getMedida(long idMedida);
	public void createMedida(MedidasPoliza medida);
	public void deleteMedida(MedidasPoliza medida);
	public void updateMedida(MedidasPoliza medida);
	public List<MedidasPoliza> getAll();
}
