package com.ilegra.jovenstalentos.coreengineering.a11;

public class Airplane implements Transportation {

    @Override
    public void start() {
        System.out.println("Iniciando as turbinas do avião");
    }

    @Override
    public void stop() {
        System.out.println("Desligando as turbinas do avião");
    }
}
