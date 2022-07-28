package com.portfolio.ap.service;

import com.portfolio.ap.entity.Habilidad;
import com.portfolio.ap.repository.IHabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {
    @Autowired
    public IHabilidadRepository habilidadRepo;
    
    @Override
    public List<Habilidad> verHabilidades() {
        return habilidadRepo.findAll();
    }
   
    @Override
    public void crearHabilidad(Habilidad habilidad) {
        habilidadRepo.save(habilidad);
    }
    
    @Override
    public void eliminarHabilidad(Long id) {
        habilidadRepo.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
        return habilidadRepo.findById(id).orElse(null);
    }

    @Override
    public void editarHabilidad(Habilidad habilidad) {
        habilidadRepo.save(habilidad);
    }
}