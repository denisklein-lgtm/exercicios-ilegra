package com.ilegra.jovenstalentos.coreengineering.a16;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HistoricoTransacao {

    private static List<Transacao> historicoExecucao = new ArrayList<>();

    public static void adicionarTransacaoAoHistorico(Transacao transacao) {
        historicoExecucao.add(transacao);
    }

    public static BigDecimal calcularSaldo(String idConta) {
        return historicoExecucao.stream()
                .filter(t -> t.getIdConta().equals(idConta))
                .map(t -> {
                    if (t.getTipoTransacao() == TipoTransacao.SAQUE) {
                        return t.getValor().negate();
                    } else {
                        return t.getValor();
                    }
                })
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
