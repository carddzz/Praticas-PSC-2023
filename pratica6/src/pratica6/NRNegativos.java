package pratica6;

import java.util.Scanner;


public class NRNegativos {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10];

        System.out.println("Digite 10 numeros reais:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("Os numeros digitados foram:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nPosições do vetor que armazenam numeros negativos:");

        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                System.out.println("Posição " + i + ": " + numeros[i]);
            }
        }

        scanner.close();
    }
}


