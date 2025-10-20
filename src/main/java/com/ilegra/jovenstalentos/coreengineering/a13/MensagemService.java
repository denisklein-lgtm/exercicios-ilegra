package com.ilegra.jovenstalentos.coreengineering.a13;

public class MensagemService {

    public static String elaborarMensagem(Cliente cliente) {
        return "Olá %s!".formatted(cliente.nome());
    }
}
