
package com.portafolio.demo.Controller;

import com.portafolio.demo.model.Proyectos;
import com.portafolio.demo.service.iProyectosService;
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
public class ProyectosController {
    @Autowired
  private iProyectosService proyectosServ;
    @PostMapping("ver/proyectos")
    public void agregarProyectos(@RequestBody Proyectos proyecto){
        proyectosServ.crearProyectos(proyecto);
    }
     @GetMapping("/ver/proyectos")
     @ResponseBody
    public List <Proyectos> verProyectos(){
      return proyectosServ.verProyectos();
    }
    @DeleteMapping("/ver/proyectos/{id}")
    public void borrarProyectos(@PathVariable Long id){
    proyectosServ.borrarProyectos(id);
    }
    @PutMapping("/ver/proyectos/{id}")
    public Proyectos editarProyectos(@RequestBody Proyectos proyecto){
      return proyectosServ.editarProyectos(proyecto);  
    }
}
