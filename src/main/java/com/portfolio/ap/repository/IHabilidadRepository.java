package com.portfolio.ap.repository;

import com.portfolio.ap.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadRepository extends JpaRepository<Habilidad,Long> {
    
}
