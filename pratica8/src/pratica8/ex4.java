package pratica8;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        double[] numeros = lerNumerosDoTeclado();
        imprimirElementosPosicoesPares(numeros);
    }

    public static double[] lerNumerosDoTeclado() {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Digite 10 números reais:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        scanner.close();
        return numeros;
    }

    public static void imprimirElementosPosicoesPares(double[] numeros) {
        System.out.print("Elementos nas posições pares: [");

        for (int i = 0; i < numeros.length; i += 2) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 2)
                System.out.print(", ");
        }

        System.out.println("]");
    }
}