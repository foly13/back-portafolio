
package com.portafolio.demo.repository;

import com.portafolio.demo.model.Hduras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HdurasRepository extends JpaRepository <Hduras, Long>{
    public Hduras save(Long id);
}
