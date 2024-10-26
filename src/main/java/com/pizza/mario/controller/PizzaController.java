package com.pizza.mario.controller;

import com.pizza.mario.domen.Pizza;
import com.pizza.mario.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pizza")
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @GetMapping
    public List<Pizza> getAll(){
        return pizzaService.getAll();
    }

    @GetMapping("{id}")
    public Pizza getById(@PathVariable("id") Pizza pizza){
        return pizza;
    }

    @PostMapping
    public Pizza save(@RequestBody Pizza pizza){
        return pizzaService.save(pizza);
    }

    @PutMapping("{id}")
    public Pizza update(@PathVariable("id") Pizza pizza, @RequestBody Pizza pizzaClient){
        return pizzaService.update(pizza, pizzaClient);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("{id}") Pizza pizza){
        pizzaService.delete(pizza);
    }
}
