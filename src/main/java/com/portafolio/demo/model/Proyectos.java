
package com.portafolio.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@NoArgsConstructor
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private String nombre;
     private String descripcion;
     private String img;
     private String fecha;
     private String enlace;
     
     public Proyectos(Long id,String nombre,String descripcion,String img, String fecha,String enlace  ){
         this.id = id;
         this.nombre = nombre;
         this.descripcion = descripcion;
         this.fecha = fecha;
         this.enlace = enlace;
     }
}
