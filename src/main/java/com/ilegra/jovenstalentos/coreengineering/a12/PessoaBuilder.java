package com.ilegra.jovenstalentos.coreengineering.a12;

import java.time.LocalDate;

public class PessoaBuilder {

    private Pessoa pessoa;

    public PessoaBuilder() {
        this.pessoa = new Pessoa();
    }

    public PessoaBuilder withNome(String nome) {
        this.pessoa.setNome(nome);
        return this;
    }

    public PessoaBuilder withDataNascimento(LocalDate dataNascimento) {
        this.pessoa.setDataNascimento(dataNascimento);
        return this;
    }

    public PessoaBuilder withEndereco(
            String rua,
            Integer numero,
            String cidade,
            String estado) {
        var endereco = new Endereco();

        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);

        this.pessoa.setEndereco(endereco);
        return this;
    }

    public Pessoa build() {
        return this.pessoa;
    }
}
