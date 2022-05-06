
package com.portafolio.demo.service;

import com.portafolio.demo.model.Hblandas;
import com.portafolio.demo.repository.HblandasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HblandasService implements iHblandasService {
    @Autowired
    public HblandasRepository blandasRepo;
    @Override
    public List<Hblandas> verHblandas() {
        return blandasRepo.findAll();
    }

    @Override
    public void crearHblandas(Hblandas blandas) {
       blandasRepo.save(blandas);        
    }
    @Override
    public Hblandas editarHblandas(Hblandas blandas){
      return blandasRepo.save(blandas);
    }

    @Override
    public void borrarHblandas(Long id) {
       blandasRepo.deleteById(id);   
    }

    @Override
    public Hblandas buscarHblandas(Long id) {
     return blandasRepo.findById(id).orElse(null);   
    }
    
}
