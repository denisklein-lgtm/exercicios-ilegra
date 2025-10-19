package com.ilegra.jovenstalentos.coreengineering.a16;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    static void main() {

        final String idConta = "1";

        var deposito1 = new Deposito(new BigDecimal(20), idConta);

        var saque1 = new Saque(new BigDecimal(10), idConta);
        var saque2 = new Saque(new BigDecimal(5), idConta);

        var processamento = new Processamento();

        processamento.adicionarTransacoes(List.of(deposito1, saque1, saque2));

        processamento.processarTransacoes();

        System.out.println("Saldo final da conta %s é %.2f".formatted(idConta, HistoricoTransacao.calcularSaldo(idConta)));
    }
}
