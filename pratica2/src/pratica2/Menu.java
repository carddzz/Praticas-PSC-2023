package pratica2;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Somar os dois números.");
        System.out.println("2 - Multiplicar os dois números.");
        System.out.println("3 - Subtrair o número maior pelo número menor.");
        System.out.println("4 - Dividir o primeiro número pelo segundo.");

        int opcao = scanner.nextInt();

        double resultado = 0.0;

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 * numero2;
                break;
            case 3:
                if (numero1 == numero2) {
                    resultado = 0.0;
                } else {
                    resultado = Math.abs(numero1 - numero2);
                }
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Erro: Divisão por zero.");
                } else {
                    resultado = numero1 / numero2;
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        if (opcao != 4) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}


