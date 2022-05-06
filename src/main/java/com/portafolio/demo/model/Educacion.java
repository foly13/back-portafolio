
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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descripcion;
    private String imagen;
    public Educacion(Long id,String titulo,String descripcion, String imagen){
        this.id = id;
        this.titulo = titulo;
        this.descripcion =descripcion;    
        this.imagen = imagen;
    }
}
