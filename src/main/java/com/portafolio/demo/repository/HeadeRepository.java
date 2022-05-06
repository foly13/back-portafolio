
package com.portafolio.demo.repository;

import com.portafolio.demo.model.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadeRepository extends JpaRepository <Header, Long>{

    public Header save(Long id);
    
}
    

