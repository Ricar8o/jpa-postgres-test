package com.tecno.prueba.controller;

import java.util.List;

import com.tecno.prueba.model.Ingredient;
import com.tecno.prueba.repository.IngredientsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientsController {

    @Autowired
    IngredientsRepository repo;
    
    @GetMapping("hola")
    public String getHola(){
        repo.save(new Ingredient("Mango","Fruta"));
        return "Hola";
    }
    
    @GetMapping("ingredients")
    public List<Ingredient> getIngredients(){
        return repo.findAll();
    }
}
