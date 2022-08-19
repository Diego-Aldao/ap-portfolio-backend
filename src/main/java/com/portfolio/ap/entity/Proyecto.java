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
public class Proyecto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPro;
    
    private String tituloPro;
    
    private String fechaPro;
    
    private String descripcionPro;
    
    private String imgPro;
    
    private String linkCode;
    
    private String linkSitio;
    
    private String mainTecno;
    
    private String subTecnoA;
    
    private String subTecnoB;

    public Proyecto() {
    }

    public Proyecto(Long idPro, String tituloPro, String fechaPro, String descripcionPro, String imgPro, String linkCode, String linkSitio, String mainTecno, String subTecnoA, String subTecnoB) {
        this.idPro = idPro;
        this.tituloPro = tituloPro;
        this.fechaPro = fechaPro;
        this.descripcionPro = descripcionPro;
        this.imgPro = imgPro;
        this.linkCode = linkCode;
        this.linkSitio = linkSitio;
        this.mainTecno = mainTecno;
        this.subTecnoA = subTecnoA;
        this.subTecnoB = subTecnoB;
    }
    
     
}
