package com.portfolio.ap.controller;

import com.portfolio.ap.entity.Proyecto;
import com.portfolio.ap.service.IProyectoService;
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
@RequestMapping("/proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    @Autowired
    private IProyectoService proyectoServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return proyectoServ.verProyectos();
    }
    
    @PostMapping("/crear")
    public void crearHabilidad(@RequestBody Proyecto proyecto){
       proyectoServ.crearProyecto(proyecto);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarProyecto(@PathVariable Long id){
        proyectoServ.eliminarProyecto(id);
    }
    
    @PutMapping("/editar")
    public void editarProyecto(@RequestBody Proyecto proyecto){
       proyectoServ.editarProyecto(proyecto);
    }
    
    @GetMapping("/id/{id}")
    public Proyecto buscarHabilidad(@PathVariable Long id){
        return proyectoServ.buscarProyecto(id);
    }
    
}
