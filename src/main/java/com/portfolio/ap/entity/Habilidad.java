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
public class Habilidad implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHab;
    private String nombreHab;
    private int porcentajeHab;
    private String descripcionHab;

    public Habilidad() {
    }

    public Habilidad(Long idHab, String nombreHab, int porcentajeHab, String descripcionHab) {
        this.idHab = idHab;
        this.nombreHab = nombreHab;
        this.porcentajeHab = porcentajeHab;
        this.descripcionHab = descripcionHab;
    }
    
}
