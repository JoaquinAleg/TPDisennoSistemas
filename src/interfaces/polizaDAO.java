package interfaces;

import java.util.List;

import POJOS.Poliza;

public interface polizaDAO {
	public Poliza getPoliza(long idPoliza);
	public void createPoliza(Poliza poliza);
	public void deletePoliza(Poliza poliza);
	public void updatePoliza(Poliza poliza);
	public List<Poliza> getAll();
}
