package com.tecno.prueba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientsController {
    
    @GetMapping("hola")
    public String getHola(){
        return "Hola";
    }
}
