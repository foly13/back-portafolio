
package com.portafolio.demo.repository;

import com.portafolio.demo.model.Hblandas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HblandasRepository  extends JpaRepository <Hblandas, Long>{
     public Hblandas save(Long id);
}
