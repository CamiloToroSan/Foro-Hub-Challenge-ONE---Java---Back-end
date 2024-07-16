package spring.foro_hub.dto;

import java.time.LocalDateTime;
import spring.foro_hub.modelos.Curso;
import spring.foro_hub.modelos.Tema;

public record DTODetalleTema(
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Curso curso
) {

    public DTODetalleTema(Tema tema) {
        this(tema.getTitulo(), tema.getMensaje(), tema.getFecha_creacion(), tema.getCurso());
    }
}
