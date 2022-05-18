
package com.portafolio.demo.Controller;

import com.portafolio.demo.model.Hblandas;
import com.portafolio.demo.service.iHblandasService;
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
public class HblandasController {
    @Autowired
  private iHblandasService blandasServ;
    @PostMapping("ver/Hblandas")
    public void agregarHblandas(@RequestBody Hblandas blandas){
        blandasServ.crearHblandas(blandas);
    }
     @GetMapping("/ver/Hblandas")
     @ResponseBody
    public List <Hblandas> verHblandas(){
      return blandasServ.verHblandas();
    }
    @DeleteMapping("/ver/Hblandas/{id}")
    public void borrarHblandas(@PathVariable Long id){
    blandasServ.borrarHblandas(id);
    }
    @PutMapping("/ver/Hblandas/{id}")
    public Hblandas editarHblandas(@RequestBody Hblandas blandas){
      return blandasServ.editarHblandas(blandas);  
    }
}
