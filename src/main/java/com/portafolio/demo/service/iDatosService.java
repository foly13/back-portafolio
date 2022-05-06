
package com.portafolio.demo.service;

import com.portafolio.demo.model.Datos;
import java.util.List;

public interface iDatosService {
    
     public List<Datos> verDatos();
     public void crearDatos (Datos dato);
     public void borrarDatos (Long id);
     public Datos buscarDatos (Long id);
     public Datos editarDatos(Datos dato);
     
    
}
