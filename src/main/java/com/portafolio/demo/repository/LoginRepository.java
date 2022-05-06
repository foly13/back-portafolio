
package com.portafolio.demo.repository;

import com.portafolio.demo.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository <Login, Long>{
    public Login save(Long id);
}
