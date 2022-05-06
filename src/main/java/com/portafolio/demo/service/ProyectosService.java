
package com.portafolio.demo.service;

import com.portafolio.demo.model.Proyectos;
import com.portafolio.demo.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements iProyectosService{
    
    @Autowired
    public ProyectosRepository proyectosRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proyectosRepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos proyecto) {
       proyectosRepo.save(proyecto);        
    }
    @Override
    public Proyectos editarProyectos(Proyectos proyecto){
      return proyectosRepo.save(proyecto);
    }

    @Override
    public void borrarProyectos(Long id) {
       proyectosRepo.deleteById(id);   
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
     return proyectosRepo.findById(id).orElse(null);   
    }
    
}
