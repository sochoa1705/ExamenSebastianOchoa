package ec.edu.espe.arquitectura.examensebastianochoa.controller;

import ec.edu.espe.arquitectura.examensebastianochoa.service.PerfilService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/perfil")
public class PerfilController {
    private final PerfilService perfilService;

    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }
}
