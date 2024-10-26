package com.pizza.mario.domen;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        private int idPizza;
        private String sizePizza;
        private String namePizza;
        private String colorDoughPizza;
        private int cookingTimePizza;
}
