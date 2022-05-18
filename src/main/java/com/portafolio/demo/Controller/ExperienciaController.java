
package com.portafolio.demo.Controller;

import com.portafolio.demo.model.Experiencia;
import com.portafolio.demo.service.iExperienciaService;
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
public class ExperienciaController {
    @Autowired
  private iExperienciaService expServ;
    @PostMapping("ver/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
     @GetMapping("/ver/experiencia")
     @ResponseBody
    public List <Experiencia> verExperiencia(){
      return expServ.verExperiencia();
    }
    @DeleteMapping("/ver/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
    expServ.borrarExperiencia(id);
    }
    @PutMapping("/ver/experiencia/{id}")
    public Experiencia editarExperiencia(@RequestBody Experiencia exp){
      return expServ.editarExperiencia(exp);  
    }
}
