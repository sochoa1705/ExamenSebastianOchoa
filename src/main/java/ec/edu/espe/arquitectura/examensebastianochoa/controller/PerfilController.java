package ec.edu.espe.arquitectura.examensebastianochoa.controller;

import ec.edu.espe.arquitectura.examensebastianochoa.model.Perfil;
import ec.edu.espe.arquitectura.examensebastianochoa.service.PerfilService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/perfil")
public class PerfilController {
    private final PerfilService perfilService;

    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }
    @GetMapping
    public ResponseEntity<List<Perfil>> obtainPerfilSorted(){
        List<Perfil> perfiles = this.perfilService.listAllOrderByName();
        return ResponseEntity.ok(perfiles);
    }
}
