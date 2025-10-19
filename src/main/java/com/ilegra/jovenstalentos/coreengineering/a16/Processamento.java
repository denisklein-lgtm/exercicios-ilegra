package com.ilegra.jovenstalentos.coreengineering.a16;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static com.ilegra.jovenstalentos.coreengineering.a16.HistoricoTransacao.adicionarTransacaoAoHistorico;

public class Processamento {

    private static Queue<Transacao> filaExecucao = new LinkedList<>();

    public void adicionarTransacoes(List<Transacao> transacoes) {
        filaExecucao.addAll(transacoes);
    }

    public void processarTransacoes() {
        while(!filaExecucao.isEmpty()) {
            var transacao = filaExecucao.poll();
            transacao.execute();
            adicionarTransacaoAoHistorico(transacao);
        }
    }
}
