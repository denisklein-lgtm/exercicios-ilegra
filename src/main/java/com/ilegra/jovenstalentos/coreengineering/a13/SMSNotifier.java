package com.ilegra.jovenstalentos.coreengineering.a13;

public class SMSNotifier implements Strategy {
    @Override
    public String doOperation(String mensagem, Cliente cliente) {
        return "Notificação SMS para %s no telefone %s\nMensagem: %s\n".formatted(cliente.nome(), cliente.telefone(), mensagem);
    }
}
