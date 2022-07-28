package com.portfolio.ap.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private Long id;
    
    @NotNull
    private String nombre;
    
    @NotNull
    private String apellido;
    
    private String img;
    
    private String titulo;
    
    private String descripcion;
    
    private String imgPortada;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idHab")
    private List<Habilidad> habilidadList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List<Proyecto> proyectoList;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, String img, String titulo, String descripcion, String imgPortada) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imgPortada = imgPortada;
    }    
}
