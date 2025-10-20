package com.ilegra.jovenstalentos.coreengineering.a14;

public class Cafe extends BebidaQuente {

    @Override
    void aquecerAgua() {
        System.out.println("Fervendo água para passar café");
    }

    @Override
    void executarInfusão() {
        System.out.println("Passando a água fervente por um coador com pó de café\n");
    }

}
