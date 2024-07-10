package med.Angel.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.Angel.api.domain.direccion.DatosDireccion;

public record DatosActualizacionPaciente(
        @NotNull
        Long id,
        String nombre,
        String telefono,
        DatosDireccion direccion) {
}