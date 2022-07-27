package com.portfolio.ap.repository;

import com.portfolio.ap.entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadesRepository extends JpaRepository<Habilidades,Long> {
    
}
