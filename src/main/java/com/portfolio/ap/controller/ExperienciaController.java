package com.portfolio.ap.controller;

import com.portfolio.ap.entity.Experiencia;
import com.portfolio.ap.service.IExperienciaService;
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
@RequestMapping("/experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    @Autowired
    private IExperienciaService experienciaServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return experienciaServ.verExperiencias();
    }
    
    @PostMapping("/crear")
    public void crearExperiencia(@RequestBody Experiencia experiencia){
       experienciaServ.crearExperiencia(experiencia);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarExperiencia(@PathVariable Long id){
        experienciaServ.eliminarExperiencia(id);
    }
    
    @PutMapping("/editar")
    public void editarExperiencia(@RequestBody Experiencia experiencia){
        experienciaServ.editarExperiencia(experiencia);
    }
    
    @GetMapping("/id/{id}")
    public Experiencia buscarExperiencia(@PathVariable Long id){
        return experienciaServ.buscarExperiencia(id);
    }
    
}
