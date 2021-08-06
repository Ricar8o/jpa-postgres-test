package com.tecno.prueba.repository;

import com.tecno.prueba.model.Ingredient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientsRepository extends JpaRepository<Ingredient,Integer>{
    
}
