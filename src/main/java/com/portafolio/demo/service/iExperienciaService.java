
package com.portafolio.demo.service;

import com.portafolio.demo.model.Experiencia;
import java.util.List;

public interface iExperienciaService {
    public List<Experiencia> verExperiencia();
     public void crearExperiencia (Experiencia exp);
     public void borrarExperiencia (Long id);
     public Experiencia buscarExperiencia (Long id);
     public Experiencia editarExperiencia(Experiencia exp);
}
