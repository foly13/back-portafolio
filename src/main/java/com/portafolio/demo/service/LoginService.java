
package com.portafolio.demo.service;

/*import com.portafolio.demo.model.Login;
import com.portafolio.demo.repository.LoginRepository;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;*/

import com.portafolio.demo.model.Login;
import com.portafolio.demo.repository.LoginRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements iLoginService {
    @Autowired
    public LoginRepository loginRepo;
    @Override
    public List<Login> verLogin() {
        return loginRepo.findAll();
    }

    @Override
    public void crearLogin(Login log) {
       loginRepo.save(log);        
    }
    @Override
    public Login editarLogin(Login log){
      return loginRepo.save(log);
    }

    @Override
    public void borrarLogin(Long id) {
       loginRepo.deleteById(id);   
    }

    @Override
    public Login buscarLogin(Long id) {
     return loginRepo.findById(id).orElse(null);   
    }
    
    
}
/*@Repository
@Transactional
public class LoginService implements iLoginService {
    @Autowired
    @PersistenceContext
    EntityManager entityManager;        
    public LoginRepository loginRepo;


    @Override
    @Transactional
    public List<Login> getUsuarios() {
                return loginRepo.findAll();

    }

    @Override
    public void eliminar(Long id) {
        Login log = entityManager.find(Login.class, id);
        entityManager.remove(log);
    }

    @Override
    public void registrar(Login log) {
        entityManager.merge(log);
    }

    @Override
    public Login obtenerUsuarioPorCredenciales(Login log) {
        String query = "FROM Login WHERE email = :email";
        List<Login> lista = entityManager.createQuery(query)
                .setParameter("email", log.getEmail())
                .getResultList();

        if (lista.isEmpty()) {
            return null;
        }

        String passwordHashed = lista.get(0).getPassword();

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        if (argon2.verify(passwordHashed, log.getPassword())) {
            return lista.get(0);
        }
        return null;
    }


}*/