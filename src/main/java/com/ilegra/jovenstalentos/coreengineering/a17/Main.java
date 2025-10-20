package com.ilegra.jovenstalentos.coreengineering.a17;

public class Main {

    static void main() {
        var pizza = new PizzaSimples();
        var pizzaComQueijoExtraEBacon = new BaconDecorator(new QueijoExtraDecorator(pizza));

        System.out.println("Preço da pizza com queijo extra e bacon é de %s".formatted(pizzaComQueijoExtraEBacon.getPreco().toString()));

    }

}
