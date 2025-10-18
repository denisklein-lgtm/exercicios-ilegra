package com.ilegra.jovenstalentos.coreengineering.a11;

public class Car implements Transportation {

    @Override
    public void start() {
        System.out.println("Iniciando um motor de um carro");
    }

    @Override
    public void stop() {
        System.out.println("Desligando um motor de um carro");
    }
}
