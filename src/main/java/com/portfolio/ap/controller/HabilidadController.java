package com.portfolio.ap.controller;

import com.portfolio.ap.entity.Experiencia;
import com.portfolio.ap.entity.Habilidad;
import com.portfolio.ap.service.IHabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/habilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadController {
    @Autowired
    private IHabilidadService habilidadServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Habilidad> verHabilidades() {
        return habilidadServ.verHabilidades();
    }
    
    @PostMapping("/crear")
    public void crearHabilidad(@RequestBody Habilidad habilidad){
       habilidadServ.crearHabilidad(habilidad);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarHabilidad(@PathVariable Long id){
        habilidadServ.eliminarHabilidad(id);
    }
    
    @PutMapping("/editar")
    public void editarHabilidad(@RequestBody Habilidad habilidad){
       habilidadServ.editarHabilidad(habilidad);
    }
    
    @GetMapping("/id/{id}")
    public Habilidad buscarHabilidad(@PathVariable Long id){
        return habilidadServ.buscarHabilidad(id);
    }
    
}
