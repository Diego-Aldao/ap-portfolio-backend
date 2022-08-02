package com.portfolio.ap.controller;

import com.portfolio.ap.entity.Educacion;
import com.portfolio.ap.service.IEducacionService;
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
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    @Autowired
    private IEducacionService educacionServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Educacion> verEducaciones() {
        return educacionServ.verEducaciones();
    }
    
    @PostMapping("/crear")
    public void crearEducacion(@RequestBody Educacion educacion){
        educacionServ.crearEducacion(educacion);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarEducacion(@PathVariable Long id){
        educacionServ.eliminarEducacion(id);
    }
    
    @PutMapping("/editar")
    public void editarEducacion(@RequestBody Educacion educacion){
        educacionServ.editarEducacion(educacion);
    }
    
    @GetMapping("/id/{id}")
    public Educacion buscarEducacion(@PathVariable Long id){
        return educacionServ.buscarEducacion(id);
    }
    
}
