package med.Angel.api.domain.medico;

import med.Angel.api.domain.direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String telefono, String documento, DatosDireccion direccion) {
}
