
package com.portafolio.demo.service;

import com.portafolio.demo.model.Header;
import java.util.List;

public interface iHeaderService {
    public List<Header> verHeader();
     public void crearHeader (Header head);
     public void borrarHeader (Long id);
     public Header buscarHeader (Long id);
     public Header editarHeader(Header head);
    
}
