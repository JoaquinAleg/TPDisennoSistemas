package APIs;

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
		return 200000F;
	}
}
