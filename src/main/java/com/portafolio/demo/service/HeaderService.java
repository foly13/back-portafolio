
package com.portafolio.demo.service;

import com.portafolio.demo.model.Header;
import com.portafolio.demo.repository.HeadeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaderService implements iHeaderService{
    @Autowired
    public HeadeRepository headerRepo;
    @Override
    public List<Header> verHeader() {
        return headerRepo.findAll();
    }

    @Override
    public void crearHeader(Header head) {
       headerRepo.save(head);        
    }
    @Override
    public Header editarHeader(Header head){
      return headerRepo.save(head);
    }

    @Override
    public void borrarHeader(Long id) {
       headerRepo.deleteById(id);   
    }

    @Override
    public Header buscarHeader(Long id) {
     return headerRepo.findById(id).orElse(null);   
    }
    
}
