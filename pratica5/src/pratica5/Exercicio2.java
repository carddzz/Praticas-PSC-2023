package pratica5;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro positivo: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro positivo: ");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero <= 0 || segundoNumero <= 0) {
            System.out.println("Por favor, insira números inteiros positivos.");
        } else {
            int limiteInferior = Math.min(primeiroNumero, segundoNumero);
            int limiteSuperior = Math.max(primeiroNumero, segundoNumero);

            System.out.println("Números inteiros entre " + limiteInferior + " e " + limiteSuperior + ":");

            for (int i = limiteInferior; i <= limiteSuperior; i++) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}