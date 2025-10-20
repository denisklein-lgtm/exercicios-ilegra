package com.ilegra.jovenstalentos.coreengineering.a13;

public class EmailNotifier implements Strategy {
    @Override
    public String doOperation(String mensagem, Cliente cliente) {
        return "Notificação EMAIL para %s no endereco %s\nMensagem: %s\n".formatted(cliente.nome(), cliente.email(), mensagem);
    }
}
