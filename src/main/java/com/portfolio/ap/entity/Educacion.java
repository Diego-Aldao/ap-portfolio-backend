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
public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    
    private String institucionEdu;
    
    private String tituloEdu;
    
    private String fechaIniEdu;
    
    private String fechaFinEdu;
    
    private String descripcionEdu;
    
    private String linkEdu;
    
    private String imgEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String InstitucionEdu, String tituloEdu, String fechaIniEdu, String fechaFinEdu, String descripcionEdu, String linkEdu, String imgEdu) {
        this.idEdu = idEdu;
        this.institucionEdu = institucionEdu;
        this.tituloEdu = tituloEdu;
        this.fechaIniEdu = fechaIniEdu;
        this.fechaFinEdu = fechaFinEdu;
        this.descripcionEdu = descripcionEdu;
        this.linkEdu = linkEdu;
        this.imgEdu = imgEdu;
    }
    
}
