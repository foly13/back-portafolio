
package com.portafolio.demo.service;

import com.portafolio.demo.model.Login;
import java.util.List;

public interface iLoginService {
     public List<Login> verLogin();
     public void crearLogin (Login log);
     public void borrarLogin (Long id);
     public Login buscarLogin (Long id);
     public Login editarLogin(Login log);
}
