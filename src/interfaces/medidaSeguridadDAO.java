package interfaces;

import java.util.List;

import POJOS.MedidaSeguridad;

public interface medidaSeguridadDAO {
	public MedidaSeguridad getMedidaSeguridad(long idMedidaSeguridad);
	public void createMedidaSeguridad(MedidaSeguridad medidaSeguridad);
	public void deleteMedidaSeguridad(MedidaSeguridad medidaSeguridad);
	public void updateMedidaSeguridad(MedidaSeguridad medidaSeguridad);
	public List<MedidaSeguridad> getAll();
}
