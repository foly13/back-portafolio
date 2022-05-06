
package com.portafolio.demo.repository;

import com.portafolio.demo.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    public Educacion save(Long id);
}
