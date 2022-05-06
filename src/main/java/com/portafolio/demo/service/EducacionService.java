
package com.portafolio.demo.service;

import com.portafolio.demo.model.Educacion;
import com.portafolio.demo.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements iEducacionService{
    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
       eduRepo.save(edu);        
    }
    @Override
    public Educacion editarEducacion(Educacion edu){
      return eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
       eduRepo.deleteById(id);   
    }

    @Override
    public Educacion buscarEducacion(Long id) {
     return eduRepo.findById(id).orElse(null);   
    }
    
    
}
