
package com.portafolio.demo.service;
import com.portafolio.demo.model.Login;
import com.portafolio.demo.repository.LoginRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements iLoginService {
    @Autowired
    public LoginRepository loginRepo;
    @Override
    public List<Login> verLogin() {
        return loginRepo.findAll();
    }

    @Override
    public void crearLogin(Login log) {
       loginRepo.save(log);        
    }
    @Override
    public Login editarLogin(Login log){
      return loginRepo.save(log);
    }

    @Override
    public void borrarLogin(Long id) {
       loginRepo.deleteById(id);   
    }

    @Override
    public Login buscarLogin(Long id) {
     return loginRepo.findById(id).orElse(null);   
    }
    
    
}
