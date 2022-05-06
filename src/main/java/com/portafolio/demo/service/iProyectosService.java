
package com.portafolio.demo.service;

import com.portafolio.demo.model.Proyectos;
import java.util.List;

public interface iProyectosService {
    public List<Proyectos> verProyectos();
     public void crearProyectos (Proyectos poryecto);
     public void borrarProyectos (Long id);
     public Proyectos buscarProyectos (Long id);
     public Proyectos editarProyectos(Proyectos poryecto);
}
