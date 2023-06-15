package ec.edu.espe.arquitectura.examensebastianochoa.service;

import ec.edu.espe.arquitectura.examensebastianochoa.model.Perfil;
import ec.edu.espe.arquitectura.examensebastianochoa.repository.PerfilRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {
    private final PerfilRepository perfilRepository;

    public PerfilService(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    public List<Perfil> listAllOrderByName() {
        return perfilRepository.findAll(Sort.by("nombre"));
    }
}
