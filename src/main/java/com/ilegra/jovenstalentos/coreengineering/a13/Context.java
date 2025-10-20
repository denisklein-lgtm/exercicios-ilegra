package com.ilegra.jovenstalentos.coreengineering.a13;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(Cliente cliente) {
        return this.strategy.doOperation(MensagemService.elaborarMensagem(cliente), cliente);
    }
}
