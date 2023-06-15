package ec.edu.espe.arquitectura.examensebastianochoa.repository;

import ec.edu.espe.arquitectura.examensebastianochoa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByMail(String mail);
}
