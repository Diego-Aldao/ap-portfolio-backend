package com.portfolio.ap.service;


import com.portfolio.ap.entity.Habilidad;
import java.util.List;


public interface IHabilidadService {    
     
    public List<Habilidad> verHabilidades();
    
    
    public void crearHabilidad(Habilidad habilidad);
    
    
    public void eliminarHabilidad(Long id);
    
   
    public void editarHabilidad(Habilidad habilidad);
        
    
    public Habilidad buscarHabilidad(Long id);
    
}