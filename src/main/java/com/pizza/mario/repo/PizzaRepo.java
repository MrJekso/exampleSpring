package com.pizza.mario.repo;

import com.pizza.mario.domen.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaRepo extends JpaRepository<Pizza, Integer> {
}
