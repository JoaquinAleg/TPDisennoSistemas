package interfaces;

import java.util.List;

import POJOS.Cuota;

public interface cuotaDAO {
	public Cuota getCuota(long idCuota);
	public void createCuota(Cuota cuota);
	public void deleteCuota(Cuota cuota);
	public void updateCuota(Cuota cuota);
	public List<Cuota> getAll();
}
