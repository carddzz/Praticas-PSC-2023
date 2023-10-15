package pratica8;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 2x2 para a Matriz 1:");
        int[][] matriz1 = lerMatrizDoTeclado(scanner);

        System.out.println("Digite os elementos da matriz 2x2 para a Matriz 2:");
        int[][] matriz2 = lerMatrizDoTeclado(scanner);

        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);

        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);

        int[][] matrizResultado = multiplicarMatrizes(matriz1, matriz2);

        System.out.println("Matriz Resultante:");
        imprimirMatriz(matrizResultado);

        scanner.close();
    }

    public static int[][] lerMatrizDoTeclado(Scanner scanner) {
        int[][] matriz = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] matrizResultado = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return matrizResultado;
    }
}
