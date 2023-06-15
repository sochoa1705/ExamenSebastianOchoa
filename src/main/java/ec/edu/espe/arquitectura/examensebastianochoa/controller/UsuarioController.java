package ec.edu.espe.arquitectura.examensebastianochoa.controller;

import ec.edu.espe.arquitectura.examensebastianochoa.model.Usuario;
import ec.edu.espe.arquitectura.examensebastianochoa.model.UsuarioPerfil;
import ec.edu.espe.arquitectura.examensebastianochoa.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping("usuario/perfiles/{codigoUsuario}")
    public ResponseEntity<List<UsuarioPerfil>> obtainUsuariosPerfilesByUsuario(@PathVariable(name = "codigoUsuario") String codigoUsuario){
        List<UsuarioPerfil> usuarioPerfiles = this.usuarioService.obtainUsuarioPerfilByUsuario(codigoUsuario);
        return ResponseEntity.ok(usuarioPerfiles);
    }
    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario){
        try {
            Usuario usuarioRs = this.usuarioService.create(usuario);
            return ResponseEntity.ok(usuarioRs);
        }catch (RuntimeException rte){
            return ResponseEntity.badRequest().build();
        }
    }

}
