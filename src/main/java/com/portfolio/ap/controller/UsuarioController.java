package com.portfolio.ap.controller;

import com.portfolio.ap.entity.Usuario;
import com.portfolio.ap.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioServ;
    
    @GetMapping("/ver/usuarios")
    @ResponseBody
    public List<Usuario> verUsuarios() {
        return usuarioServ.verUsuarios();
    }
    
    @PostMapping("crear/usuario")
    public void crearUsuario(@RequestBody Usuario usuario){
        usuarioServ.crearUsuario(usuario);
    }
    
    @DeleteMapping("usuario/eliminar/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuarioServ.eliminarUsuario(id);
    }
    
    @PutMapping("usuario/editar/{id}")
    public Usuario editarUsuario(@PathVariable Long id,
                              @RequestParam("nombre") String nombreEdit,
                              @RequestParam("apellido") String apellidoEdit,
                              @RequestParam("img") String imgEdit){
    
        Usuario usuario = usuarioServ.buscarUsuario(id);
                
        usuario.setNombre(nombreEdit);
        usuario.setApellido(apellidoEdit);
        usuario.setImg(imgEdit);
        
        usuarioServ.crearUsuario(usuario);
        return usuario;
    }
}
