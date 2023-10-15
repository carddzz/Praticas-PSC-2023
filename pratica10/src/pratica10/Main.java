package pratica10;

import java.util.Scanner;

/**
 * Classe principal para cadastrar e imprimir veículos.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroVeiculos cadastro = new CadastroVeiculos();

        while (true) {
            System.out.print("Informe a marca do veículo (ou digite 'fim' para encerrar): ");
            String marca = scanner.nextLine();

            if (marca.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Informe o modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Informe o número de chassi: ");
            String numeroChassi = scanner.nextLine();

            System.out.print("Informe a placa: ");
            String placa = scanner.nextLine();

            System.out.print("Informe a cor: ");
            String cor = scanner.nextLine();

            Veiculo veiculo = new Veiculo(marca, modelo, numeroChassi, placa, cor);
            cadastro.cadastrarVeiculo(veiculo);
        }

        System.out.println("=== Veículos Cadastrados ===");
        cadastro.imprimirCadastro();

        scanner.close();
    }
}