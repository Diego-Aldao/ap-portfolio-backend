package com.portfolio.ap.service;

import com.portfolio.ap.entity.Educacion;
import java.util.List;


public interface IEducacionService {    
     
    public List<Educacion> verEducaciones();
    
    
    public void crearEducacion(Educacion educacion);
    
    
    public void eliminarEducacion(Long id);
    
   
    public void editarEducacion(Educacion educacion);
        
    
    public Educacion buscarEducacion(Long id);
    
}
