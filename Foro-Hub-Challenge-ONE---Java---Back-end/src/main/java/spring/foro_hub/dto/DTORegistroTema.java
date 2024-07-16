package spring.foro_hub.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import spring.foro_hub.modelos.Curso;

public record DTORegistroTema(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull @Valid
        Curso curso
) {
}
