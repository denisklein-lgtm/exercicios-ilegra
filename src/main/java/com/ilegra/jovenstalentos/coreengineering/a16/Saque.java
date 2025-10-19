package com.ilegra.jovenstalentos.coreengineering.a16;

import java.math.BigDecimal;

public class Saque implements Transacao {

    private BigDecimal valor;
    private String idConta;

    public Saque(BigDecimal valor, String idConta) {
        this.valor = valor;
        this.idConta = idConta;
    }

    @Override
    public void execute() {
        System.out.println("Sacando o valor de %.2f da conta %s".formatted(valor, idConta));
    }

    @Override
    public BigDecimal getValor() {
        return this.valor;
    }

    @Override
    public String getIdConta() {
        return this.idConta;
    }

    @Override
    public TipoTransacao getTipoTransacao() {
        return TipoTransacao.SAQUE;
    }
}
