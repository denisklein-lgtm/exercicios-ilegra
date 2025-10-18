package com.ilegra.jovenstalentos.coreengineering.a12;

import java.time.LocalDate;

public class Main {

    static void main() {
        var pessoaBuilder = new PessoaBuilder()
                .withNome("Joao Silva")
                .withDataNascimento(LocalDate.of(1979, 07, 05))
                .withEndereco(
                        "Rua Alguma Coisa",
                        23,
                        "Sao Paulo",
                        "SP");

        System.out.println(pessoaBuilder.build());

    }
}
