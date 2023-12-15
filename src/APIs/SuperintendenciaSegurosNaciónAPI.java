package APIs;

import java.util.Random;

import DTOS.InfoVehicularDTO;

public class SuperintendenciaSegurosNaciónAPI {
	
	private static SuperintendenciaSegurosNaciónAPI instancia = null;
	
	public SuperintendenciaSegurosNaciónAPI() {}
	
	public static SuperintendenciaSegurosNaciónAPI getInstance() {
        if (instancia == null) {
            instancia = new SuperintendenciaSegurosNaciónAPI();
        }
        return instancia;
    }
	
	public Float getValorUnidadAsegurada(InfoVehicularDTO infoVehicularDTO) {
		Random random = new Random();
        Float rangoInicioValorAsegurado = 2000000.0F;
        Float rangoFinValorAsegurado = 100000.0F;
        Float ValorAsegurado = rangoInicioValorAsegurado + random.nextFloat() * (rangoFinValorAsegurado - rangoInicioValorAsegurado);
		return ValorAsegurado;
	}
}
