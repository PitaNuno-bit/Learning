package com.programacao.web.fatec.api_fatec.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacao.web.fatec.api_fatec.entities.User;

@RestController
@RequestMapping("/api/usuario")
public class UserController {
    
    //http://localhost:<port>/api/usuario/register
    //POST
    //Parametro: @RequestBody => enviar no corpo da requisicao (body)
    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return "Bem-vindo, " + user.getName() + "! Você tem " + user.getAge() + " anos.";
    }

    @Override
    public String toString() {
        return "UsuarioController []";
    }
    
}
