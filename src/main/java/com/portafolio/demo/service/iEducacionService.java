
package com.portafolio.demo.service;

import com.portafolio.demo.model.Educacion;
import java.util.List;


public interface iEducacionService {
    public List<Educacion> verEducacion();
     public void crearEducacion (Educacion edu);
     public void borrarEducacion (Long id);
     public Educacion buscarEducacion (Long id);
     public Educacion editarEducacion(Educacion edu);
}
