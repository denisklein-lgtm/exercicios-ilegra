package com.ilegra.jovenstalentos.coreengineering.a17;

import java.math.BigDecimal;

public class BaconDecorator extends IngredientePizzaDecorator {

    private static final BigDecimal VALOR_ADICIONAL_BACON = new BigDecimal(3);

    public BaconDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPreco() {
        return super.getPreco().add(VALOR_ADICIONAL_BACON);
    }
}
