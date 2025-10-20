package com.ilegra.jovenstalentos.coreengineering.a17;

import java.math.BigDecimal;

public abstract class IngredientePizzaDecorator implements Pizza {

    private Pizza pizza;

    public IngredientePizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getPreco() {
        return pizza.getPreco();
    }
}
