
package com.portafolio.demo.Controller;

import com.portafolio.demo.model.Educacion;
import com.portafolio.demo.service.iEducacionService;
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
public class EducacionController {
     @Autowired
  private iEducacionService eduServ;
    @PostMapping("ver/educacion")
    public void agregarEducacion(@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
     @GetMapping("/ver/educacion")
     @ResponseBody
    public List <Educacion> verEducacion(){
      return eduServ.verEducacion();
    }
    @DeleteMapping("/ver/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
    eduServ.borrarEducacion(id);
    }
    @PutMapping("/ver/educacion/{id}")
    public Educacion editarEducacion(@RequestBody Educacion edu){
      return eduServ.editarEducacion(edu);  
    }
}
