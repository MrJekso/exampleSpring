package com.pizza.mario.service;

import com.pizza.mario.domen.Pizza;
import com.pizza.mario.repo.PizzaRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepo pizzaRepo;

    public Pizza save(Pizza pizza){
        return pizzaRepo.save(pizza);
    }

    public Pizza getById(Integer id){
        Optional<Pizza> pizza = Optional.of(pizzaRepo.getReferenceById(id));
        if(pizza.isPresent()){
            return pizza.get();
        }
        return null;
    }

    public List<Pizza> getAll(){
        return pizzaRepo.findAll();
    }

    public Pizza update(Pizza pizzaFromDB, Pizza pizzaClient){
        BeanUtils.copyProperties(pizzaClient, pizzaFromDB, "id"); // we exclude field "id" when copying
        return pizzaRepo.save(pizzaFromDB);
    }

    public void delete(Pizza pizza){
        pizzaRepo.delete(pizza);
    }
}
