package com.portfolio.ap.service;

import com.portfolio.ap.entity.Experiencia;
import java.util.List;


public interface IExperienciaService {    
     
    public List<Experiencia> verExperiencias();
    
    
    public void crearExperiencia(Experiencia experiencia);
    
    
    public void eliminarExperiencia(Long id);
    
   
    public void editarExperiencia(Experiencia experiencia);
        
    
    public Experiencia buscarExperiencia(Long id);
    
}
