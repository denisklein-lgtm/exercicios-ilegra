package com.ilegra.jovenstalentos.coreengineering.a17;

import java.math.BigDecimal;

public class QueijoExtraDecorator extends IngredientePizzaDecorator {

    private static final BigDecimal VALOR_ADICIONAL_QUEIJO = new BigDecimal("3.5");

    public QueijoExtraDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPreco() {
        return super.getPreco().add(VALOR_ADICIONAL_QUEIJO);
    }
}
