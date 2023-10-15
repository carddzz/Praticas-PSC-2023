package pratica9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Informe o número da agência: ");
        int agencia = scanner.nextInt();

        contaCorrente.iniciarContaCorrente(numeroConta, agencia);

        System.out.print("Informe o valor para depósito: ");
        double valorDeposito = scanner.nextDouble();

        contaCorrente.depositar(valorDeposito);

        System.out.println("Dados da conta após depósito:");
        contaCorrente.exibe();

        System.out.print("Informe o valor para saque: ");
        double valorSaque = scanner.nextDouble();

        if (contaCorrente.sacar(valorSaque)) {
            System.out.println("Saque bem-sucedido.");
        }

        System.out.println("Dados da conta após saque:");
        contaCorrente.exibe();

        scanner.close();
    }
}