package pratica6;

import java.util.Scanner;


public class SomaDePares {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int somaPares = 0;

        System.out.println("Digite 10 numeros inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        System.out.println("Os numeros digitados foram:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nA soma dos numeros pares foi: " + somaPares);

        scanner.close();
    }
	
}
		



