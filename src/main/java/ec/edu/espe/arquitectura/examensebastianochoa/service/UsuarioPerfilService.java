package ec.edu.espe.arquitectura.examensebastianochoa.service;

import org.springframework.stereotype.Service;

@Service
public class UsuarioPerfilService {
    private final UsuarioService usuarioService;
    private final PerfilService perfilService;

    public UsuarioPerfilService(UsuarioService usuarioService, PerfilService perfilService) {
        this.usuarioService = usuarioService;
        this.perfilService = perfilService;
    }

}
