package pratica11;

import java.util.Scanner;

class Pessoa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class PessoaFisica extends Pessoa {
    private String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}

class PessoaJuridica extends Pessoa {
    private String cnpj;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}

class Cadastro {
    private Pessoa[] pessoas;
    private int count;

    public Cadastro(int tamanho) {
        pessoas = new Pessoa[tamanho];
        count = 0;
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        if (count < pessoas.length) {
            pessoas[count] = pessoa;
            count++;
        } else {
            System.out.println("Cadastro cheio, impossível adicionar mais pessoas.");
        }
    }

    public void imprimirCadastro() {
        System.out.println("Cadastro de Pessoas:");
        for (int i = 0; i < count; i++) {
            Pessoa pessoa = pessoas[i];
            if (pessoa instanceof PessoaFisica) {
                PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
                System.out.println("Nome: " + pessoaFisica.getNome());
                System.out.println("CPF: " + pessoaFisica.getCpf());
            } else if (pessoa instanceof PessoaJuridica) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
                System.out.println("Nome: " + pessoaJuridica.getNome());
                System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
            }
            System.out.println("-----");
        }
    }
}

