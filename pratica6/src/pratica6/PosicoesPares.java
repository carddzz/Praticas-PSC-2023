package pratica6;

import java.util.Scanner;

public class PosicoesPares {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10];

        System.out.println("Digite 10 numeros reais:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("Elementos armazenados nas posições pares do vetor:");

        for (int i = 0; i < 10; i += 2) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
	
}
