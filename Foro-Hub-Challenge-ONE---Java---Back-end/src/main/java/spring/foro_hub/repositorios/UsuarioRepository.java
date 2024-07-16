package spring.foro_hub.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.foro_hub.modelos.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername (String username);

}
