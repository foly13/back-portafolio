
package com.portafolio.demo.service;

import com.portafolio.demo.model.Hblandas;
import java.util.List;

public interface iHblandasService {
    public List<Hblandas> verHblandas();
     public void crearHblandas (Hblandas blandas);
     public void borrarHblandas (Long id);
     public Hblandas buscarHblandas (Long id);
     public Hblandas editarHblandas(Hblandas blandas);
}
