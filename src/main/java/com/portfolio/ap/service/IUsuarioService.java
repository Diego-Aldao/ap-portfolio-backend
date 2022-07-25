package com.portfolio.ap.service;

import com.portfolio.ap.entity.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    //Obtener todos los usuarios   
    public List<Usuario> verUsuarios();
    
    //Crear usuario de tipo Usuario
    public void crearUsuario(Usuario usuario);
    
    //Eliminar usuario
    public void eliminarUsuario(Long id);
        
    //Buscar usuario
    public Usuario buscarUsuario(Long id);
    
}
