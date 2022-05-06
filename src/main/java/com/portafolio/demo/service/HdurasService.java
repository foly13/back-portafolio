
package com.portafolio.demo.service;

import com.portafolio.demo.model.Hduras;
import com.portafolio.demo.repository.HdurasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HdurasService implements iHduras {
    
     @Autowired
    public HdurasRepository durasRepo;

    @Override
    public List<Hduras> verDuras() {
        return durasRepo.findAll();
    }

    @Override
    public void crearHduras(Hduras duras) {
       durasRepo.save(duras);        
    }
    @Override
    public Hduras editarHduras(Hduras duras){
      return durasRepo.save(duras);
    }

    @Override
    public void borrarHduras(Long id) {
       durasRepo.deleteById(id);   
    }

    @Override
    public Hduras buscarHduras(Long id) {
     return durasRepo.findById(id).orElse(null);   
    }
    
}
