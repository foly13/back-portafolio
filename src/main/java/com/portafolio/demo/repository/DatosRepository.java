package com.portafolio.demo.repository;

import com.portafolio.demo.model.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosRepository extends JpaRepository <Datos, Long>{

    public Datos save(Long id);
    
}
