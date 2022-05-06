
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
public class Header {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;
      private String banner;
      private String logoYoP = "./assets/images/logo1.png";
      private String textoYoP;
      private String enlaceG;
      private String logoG;
      private String enlaceL;
      private String logoL;
      private String enlaceI;
      private String logoI;
      private String enlaceW;
      private String logoW;
      
      public Header(Long id,String banner,String logoYoP,String textoYoP,String enlaceG,String logoG, String enlaceL, String logoL, String enlaceI, String logoI, String enlaceW, String logoW ){
      this.id = id;
      this.banner = banner;
      this.logoYoP = logoYoP;
      this.textoYoP= textoYoP;
      this.enlaceG = enlaceG;
      this.logoG = logoG;
      this.enlaceL = enlaceL;
      this.logoL = logoL;
      this.enlaceI = enlaceI;
      this.logoI = logoI;
      this.enlaceW = enlaceW;
      this.logoW = logoW;
      }
     
     
    
}
