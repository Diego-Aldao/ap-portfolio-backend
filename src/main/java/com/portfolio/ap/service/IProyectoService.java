package com.portfolio.ap.service;


import com.portfolio.ap.entity.Proyecto;
import java.util.List;


public interface IProyectoService {    
     
    public List<Proyecto> verProyectos();
    
    
    public void crearProyecto(Proyecto proyecto);
    
    
    public void eliminarProyecto(Long id);
    
   
    public void editarProyecto(Proyecto proyecto);
        
    
    public Proyecto buscarProyecto(Long id);
    
}