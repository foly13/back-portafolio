
package com.portafolio.demo.repository;

import com.portafolio.demo.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Long>{
     public Proyectos save(Long id);
}
