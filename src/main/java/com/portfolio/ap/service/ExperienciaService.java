package com.portfolio.ap.service;

import com.portfolio.ap.entity.Experiencia;
import com.portfolio.ap.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired
    public IExperienciaRepository experienciaRepo;
    
    @Override
    public List<Experiencia> verExperiencias() {
        return experienciaRepo.findAll();
    }
   
    @Override
    public void crearExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }
    
    @Override
    public void eliminarExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return experienciaRepo.findById(id).orElse(null);
    }

    @Override
    public void editarExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }
}
