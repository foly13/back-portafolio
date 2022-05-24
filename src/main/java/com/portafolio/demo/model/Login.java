
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
public class Login {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;
      private String email;
      private String password;
       public Login(Long id,String email, String password ){
           this.id = id;
           this.email = email;
           this.password = password;
       }
     
}

