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

        if (user.getName() == null || user.getName().trim().isEmpty()) {
            if (user.getAge() == null || user.getAge() < 0) {
                return "Nome e Idade inválidos";
            }
            return "Nome não pode ser vazio.";
        }

        if (user.getAge() == null || user.getAge() < 0) {
            return "Idade inválida";
        }

        return "Bem-vindo, " + user.getName() + "! Você tem " + user.getAge() + " anos.";
    }
}
