
package com.portfolio.ap.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    
    private String empresaExp;
    
    private String tituloExp;
    
    private String descripcionExp;
    
    private String fechaIniExp;
    
    private String fechaFinExp;
    
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String EmpresaExp, String tituloExp, String descripcionExp, String fechaIniExp, String fechaFinExp, String imgExp) {
        this.idExp = idExp;
        this.empresaExp = empresaExp;
        this.tituloExp = tituloExp;
        this.descripcionExp = descripcionExp;
        this.fechaIniExp = fechaIniExp;
        this.fechaFinExp = fechaFinExp;
        this.imgExp = imgExp;
    }    
}
