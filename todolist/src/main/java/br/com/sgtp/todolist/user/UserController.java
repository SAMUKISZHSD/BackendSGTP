package br.com.sgtp.todolist.user;

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
    
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) { // Alterado para @RequestBody
         System.out.println(userModel.getUsername());
    }
}

