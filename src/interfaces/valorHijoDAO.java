package interfaces;

import java.util.List;

import POJOS.ValorHijo;

public interface valorHijoDAO {
	public ValorHijo getValorHijo(long idHijo);
	public void createValorHijo(ValorHijo Hijo);
	public void deleteValorHijo(ValorHijo Hijo);
	public void updateValorHijo(ValorHijo Hijo);
	public List<ValorHijo> getAll();
}
