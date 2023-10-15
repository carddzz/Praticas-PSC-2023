package pratica8;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        double[] numeros = lerNumerosDoTeclado();
        imprimirVetor(numeros);
        encontrarEMostrarMenorMaior(numeros);
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

    public static void imprimirVetor(double[] numeros) {
        System.out.print("Vetor: [");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1)
                System.out.print(", ");
        }

        System.out.println("]");
    }

    public static void encontrarEMostrarMenorMaior(double[] numeros) {
        if (numeros.length == 0) {
            System.out.println("Vetor vazio.");
            return;
        }

        double menor = numeros[0];
        double maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            } else if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}
