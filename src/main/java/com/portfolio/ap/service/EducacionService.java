package com.portfolio.ap.service;

import com.portfolio.ap.entity.Educacion;
import com.portfolio.ap.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    public IEducacionRepository educacionRepo;
    
    @Override
    public List<Educacion> verEducaciones() {
        return educacionRepo.findAll();
    }
   
    @Override
    public void crearEducacion(Educacion educacion) {
        educacionRepo.save(educacion);
    }
    
    @Override
    public void eliminarEducacion(Long id) {
        educacionRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return educacionRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEducacion(Educacion educacion) {
        educacionRepo.save(educacion);
    }
}
