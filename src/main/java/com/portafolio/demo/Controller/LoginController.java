
package com.portafolio.demo.Controller;

/*import com.portafolio.demo.model.Login;
import com.portafolio.demo.service.iLoginService;
import com.portafolio.demo.utils.JWTutil;
import org.springframework.beans.factory.annotation.Autowired;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;*/

import com.portafolio.demo.model.Login;
import com.portafolio.demo.service.iLoginService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://portafolio-4a0f1.web.app", maxAge = 3600)
/*@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)*/
@RestController
public class LoginController {
    @Autowired
  private iLoginService loginServ;
    @PostMapping("ver/login")
    public void agregarLogin(@RequestBody Login log){
        loginServ.crearLogin(log);
    }
     @GetMapping("/ver/login")
     @ResponseBody
    public List <Login> verLogin(){
      return loginServ.verLogin();
    }
    @DeleteMapping("/ver/login/{id}")
    public void borrarLogin(@PathVariable Long id){
    loginServ.borrarLogin(id);
    }
    @PutMapping("/ver/login/{id}")
    public Login editarLogin(@RequestBody Login log){
      return loginServ.editarLogin(log);  
    }
}

