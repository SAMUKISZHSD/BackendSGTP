package br.com.sgtp.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; // Corrigido para importar RequestBody
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MODIFICADORES:
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel) { // Alterado para @RequestBody
         //System.out.println(userModel.getUsername());
         var user = this.userRepository.findByUsername(userModel.getUsername());

         if(user != null) {
            System.out.println("Usuário já existe");
            return null;
         }

        var userCreated = this.userRepository.save(userModel);
        return userCreated;
    }
}

