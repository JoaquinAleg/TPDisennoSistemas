# TPDisennoSistemas

Errores con el diagrama de clases, base de datos y el Diagrama de secuencias del CU01
- Errores con el diagrama de clases
  - Falta la Condicion del Cliente
    Soluciones:
      - Enumerado
      - Clase Condicion
  - Falta de coneccion entre clase Poliza y tipoDNI

- Errores con el diagrama de secuencia del CU01:
  - Problema con DAO mediaSeguridad, al cual en vez de mandarle el tipo de medida, le mando un true
  - Seteo el estado cliente a la poliza, cuando en realidad debe de ir al gestor de cliente
      Soluciones:
        - Aplicar cliente.setEstado(), lo cual no se como se representa en el diagrama de secuencia
        - Aplicar GestorPoliaza.getInstance.seEstado() al gestor
  - Problema con la parte que le sigue al Alt de polizasAsociadas
      Solucion:
        - el getCuotasImpagas() va al DAOCuotas
        - el getIncidentesUltimoAnio() es lo que tenemos como campo en PolizaDTO
        - el clienteActivo() va dirigido al DAOTipoEstadoCliente
  - Problema con el emision de poliza, que es dirigido al gesorCliente, cuando deve de ir dirigido a poliza
  - Error con las cuotas, las mismas deben de crearse con MontoCuota y MontoMora, que deben de calcularse, y a su vez bonificaciones que son los descuentos, tambien con el numero de cuota.
  - Error con los premios y descuentos, los mismos tienen que venir hardcodeados desde la interface, como dijo el profe y que colgue en en hacer, 

- Error con la Base de datos:
  - Falta fechaUltimoDiaPago.
