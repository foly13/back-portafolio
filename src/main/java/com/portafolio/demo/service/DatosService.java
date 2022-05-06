
package com.portafolio.demo.service;

import com.portafolio.demo.model.Datos;
import com.portafolio.demo.repository.DatosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DatosService implements iDatosService{
    
    @Autowired
    public DatosRepository datosRepo;

    @Override
    public List<Datos> verDatos() {
        return datosRepo.findAll();
    }

    @Override
    public void crearDatos(Datos dato) {
       datosRepo.save(dato);        
    }
    @Override
    public Datos editarDatos(Datos dato){
      return datosRepo.save(dato);
    }

    @Override
    public void borrarDatos(Long id) {
       datosRepo.deleteById(id);   
    }

    @Override
    public Datos buscarDatos(Long id) {
     return datosRepo.findById(id).orElse(null);   
    }
    
}
