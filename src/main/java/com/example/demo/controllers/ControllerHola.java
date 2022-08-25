package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHola {

    @GetMapping("/api/hola")
    public String saludo(){
        return "Hola, estamos en la api";
    }
}
