package com.programacao.web.fatec.api_fatec.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioController {

    @GetMapping
    public String HelloWord(){
        return "Home";
    }

    @GetMapping ("/endpoint1")
    public String endPointMethod1(){
        return "END POINT 1";
    }

    @GetMapping ("/endpoint2/{name}")
    public String invertName(@PathVariable String name){
        return new StringBuilder(name).reverse().toString();
    }

    @GetMapping("/endpoint3/{number}")
    String verificarParOuImpar(@PathVariable Integer number) {
        if (number % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }


}
