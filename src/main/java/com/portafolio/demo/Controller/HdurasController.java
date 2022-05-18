
package com.portafolio.demo.Controller;

import com.portafolio.demo.model.Datos;
import com.portafolio.demo.model.Hduras;
import com.portafolio.demo.service.HdurasService;
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

/*@CrossOrigin(origins = "https://portafolio-4a0f1.web.app", maxAge = 3600)*/
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class HdurasController {
    @Autowired
  private HdurasService durasServ;
    @PostMapping("/ver/Hduras")
    public void agregarHduras(@RequestBody Hduras duras){
        durasServ.crearHduras(duras);
    }
     @GetMapping("/ver/Hduras")
     @ResponseBody
    public List <Hduras> verHduras(){
      return durasServ.verDuras();
    }
    @DeleteMapping("/ver/Hduras/{id}")
    public void borrarHduras(@PathVariable Long id){
    durasServ.borrarHduras(id);
    }
    @PutMapping("/ver/Hduras/{id}")
    public Hduras editarHduras(@RequestBody Hduras duras){
      return durasServ.editarHduras(duras);  
    }
}
