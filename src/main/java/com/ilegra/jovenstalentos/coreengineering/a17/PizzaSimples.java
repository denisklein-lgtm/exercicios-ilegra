package com.ilegra.jovenstalentos.coreengineering.a17;

import java.math.BigDecimal;

public class PizzaSimples implements Pizza {

    private static final BigDecimal PRECO_PIZZA_SIMPLES = new BigDecimal(20);

    @Override
    public BigDecimal getPreco
            () {
        return PRECO_PIZZA_SIMPLES;
    }
}
