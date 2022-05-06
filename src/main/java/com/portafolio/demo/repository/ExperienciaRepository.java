
package com.portafolio.demo.repository;

import com.portafolio.demo.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaRepository extends JpaRepository <Experiencia, Long>{
     public Experiencia save(Long id);
}
