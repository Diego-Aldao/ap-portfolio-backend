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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Usuario> verUsuarios() {
        return usuarioServ.verUsuarios();
    }
    
    @PostMapping("/crear")
    public void crearUsuario(@RequestBody Usuario usuario){
        usuarioServ.crearUsuario(usuario);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuarioServ.eliminarUsuario(id);
    }
    
    @PutMapping("/editar")
    public void editarUsuario(@RequestBody Usuario usuario){
        usuarioServ.editarUsuario(usuario);
    }
    
    @GetMapping("/id/{id}")
    public Usuario buscarUsuario(@PathVariable Long id){
        return usuarioServ.buscarUsuario(id);
    }
    
}
