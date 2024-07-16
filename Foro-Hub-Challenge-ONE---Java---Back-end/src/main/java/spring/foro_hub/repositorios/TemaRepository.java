package spring.foro_hub.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.foro_hub.modelos.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {

}
