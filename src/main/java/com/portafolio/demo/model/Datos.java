
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
public class Datos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String titulo;
    private String sobreMi;
    private String imagenPerfil;
    
    public Datos(Long id,String nombre, String titulo, String sobreMi, String imagenPerfil ){
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.sobreMi = sobreMi;
        this.imagenPerfil = imagenPerfil;
    }
    
}
