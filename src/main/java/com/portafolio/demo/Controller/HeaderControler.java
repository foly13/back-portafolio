
package com.portafolio.demo.Controller;

import com.portafolio.demo.model.Header;
import com.portafolio.demo.service.iHeaderService;
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
public class HeaderControler {
     @Autowired
  private iHeaderService headerServ;
    @PostMapping("ver/header")
    public void agregarHeader(@RequestBody Header head){
        headerServ.crearHeader(head);
    }
     @GetMapping("/ver/header")
     @ResponseBody
    public List <Header> verHeader(){
      return headerServ.verHeader();
    }
    @DeleteMapping("/ver/header/{id}")
    public void borrarHeader(@PathVariable Long id){
    headerServ.borrarHeader(id);
    }
    @PutMapping("/ver/header/{id}")
    public Header editarDatos(@RequestBody Header head){
      return headerServ.editarHeader(head);  
    }
    
}
