
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
public class Hduras {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String porcentaje;
    private String style;
    private String clases;
    private String alinearTexto;
    
    public Hduras (Long id, String titulo, String porcentaje, String style, String clases,String alinearTexto ){
    this.id = id;
    this.titulo = titulo;
    this.porcentaje = porcentaje;
    this.style = style;
    this.clases = clases;
    this.alinearTexto = alinearTexto;
          
    }
}