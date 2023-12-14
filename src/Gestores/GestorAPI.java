package Gestores;

import APIs.SuperintendenciaSegurosNaciónAPI;
import DTOS.InfoVehicularDTO;

public class GestorAPI {
	
	private static GestorAPI instancia = null;
	
	public GestorAPI() {}
	
	public static GestorAPI getInstance() {
        if (instancia == null) {
            instancia = new GestorAPI();
        }
        return instancia;
    }
	
	public Float getValorUnidadAsegurada(InfoVehicularDTO infoVehicularDTO) {
		SuperintendenciaSegurosNaciónAPI sspAPI = SuperintendenciaSegurosNaciónAPI.getInstance();
		return sspAPI.getValorUnidadAsegurada(infoVehicularDTO);
	}
	
}
