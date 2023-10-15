package pratica8;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        double[] numeros = lerNumerosDoTeclado();
        imprimirVetorEPosicoesNegativas(numeros);
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

    public static void imprimirVetorEPosicoesNegativas(double[] numeros) {
        System.out.print("Vetor: [");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1)
                System.out.print(", ");

            if (numeros[i] < 0)
                System.out.print(" (posição " + i + ")");
        }

        System.out.println("]");
    }
}
