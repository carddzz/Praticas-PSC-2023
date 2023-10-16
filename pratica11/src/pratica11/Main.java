package pratica11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do cadastro: ");
        int tamanho = scanner.nextInt();
        Cadastro cadastro = new Cadastro(tamanho);

        while (true) {
            System.out.println("1 - Cadastrar Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Imprimir Cadastro");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                PessoaFisica pessoaFisica = new PessoaFisica();
                System.out.print("Nome: ");
                scanner.nextLine();  // Consumir a quebra de linha pendente
                String nome = scanner.nextLine();
                pessoaFisica.setNome(nome);
                System.out.print("CPF: ");
                String cpf = scanner.next();
                pessoaFisica.setCpf(cpf);
                cadastro.cadastrarPessoa(pessoaFisica);
            } else if (opcao == 2) {
                PessoaJuridica pessoaJuridica = new PessoaJuridica();
                System.out.print("Nome: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                pessoaJuridica.setNome(nome);
                System.out.print("CNPJ: ");
                String cnpj = scanner.next();
                pessoaJuridica.setCnpj(cnpj);
                cadastro.cadastrarPessoa(pessoaJuridica);
            } else if (opcao == 3) {
                cadastro.imprimirCadastro();
            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}