package com.ilegra.jovenstalentos.coreengineering.a13;

public class Main {

    static void main() {
        var cliente = new Cliente("Fulano de Souza", "fs@gmail.com", "1199999-9999");

        var context = new Context(new SMSNotifier());
        System.out.println(context.executeStrategy(cliente));

        context = new Context(new EmailNotifier());
        System.out.println(context.executeStrategy(cliente));
    }
}
