
package com.portafolio.demo.Controller;

import com.portafolio.demo.model.Datos;
import com.portafolio.demo.service.iDatosService;
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
@RestController
public class Controller {
  @Autowired
  private iDatosService datoServ;
    @PostMapping("new/dato")
    public void agregarDatos(@RequestBody Datos dato){
        datoServ.crearDatos(dato);
    }
     @GetMapping("/ver/datos")
     @ResponseBody
    public List <Datos> verDatos(){
      return datoServ.verDatos();
    }
    @DeleteMapping("/ver/datos/{id}")
    public void borrarDatos(@PathVariable Long id){
    datoServ.borrarDatos(id);
    }
    @PutMapping("/ver/datos/{id}")
    public Datos editarDatos(@RequestBody Datos dato){
      return datoServ.editarDatos(dato);  
    }
}
