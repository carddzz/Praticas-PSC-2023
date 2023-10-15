package pratica8;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        int[] numeros = lerNumerosDoTeclado();
        imprimirVetorEApresentarSomaPares(numeros);
    }

    public static int[] lerNumerosDoTeclado() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        scanner.close();
        return numeros;
    }

    public static void imprimirVetorEApresentarSomaPares(int[] numeros) {
        System.out.print("Vetor: [");
        int somaPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1)
                System.out.print(", ");

            if (numeros[i] % 2 == 0)
                somaPares += numeros[i];
        }

        System.out.println("]");
        System.out.println("Soma dos números pares: " + somaPares);
    }
}