package ec.edu.espe.arquitectura.examensebastianochoa.repository;

import ec.edu.espe.arquitectura.examensebastianochoa.model.UsuarioPerfil;
import ec.edu.espe.arquitectura.examensebastianochoa.model.UsuarioPerfilPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioPerfilRepository extends JpaRepository<UsuarioPerfil, UsuarioPerfilPK> {
    List<UsuarioPerfil> findByCodigoUsuario(String codigoUsuario);

}
