
package com.portafolio.demo.service;

import com.portafolio.demo.model.Hduras;
import java.util.List;

public interface iHduras {
    public List<Hduras> verDuras();
     public void crearHduras (Hduras duras);
     public void borrarHduras (Long id);
     public Hduras buscarHduras (Long id);
     public Hduras editarHduras(Hduras duras);
}
