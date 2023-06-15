package ec.edu.espe.arquitectura.examensebastianochoa.service;

import ec.edu.espe.arquitectura.examensebastianochoa.model.Usuario;
import ec.edu.espe.arquitectura.examensebastianochoa.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public Usuario create(Usuario usuario) {
        Usuario usuarioTmp = usuarioRepository.findByMail(usuario.getMail());
        if (usuarioTmp == null) {
            return usuarioRepository.save(usuario);
        }else{
            throw new RuntimeException("El usuario ya existe");
        }
    }
}
