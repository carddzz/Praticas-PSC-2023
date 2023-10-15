package pratica8;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        int[][] matriz = lerMatrizDoTeclado();
        System.out.println("Matriz informada:");
        imprimirMatriz(matriz);

        System.out.println("\nElementos nas posições (linha par, coluna ímpar):");
        imprimirElementosPosicoesParImpar(matriz);

        System.out.println("\nMatriz transposta:");
        imprimirMatriz(transpostaMatriz(matriz));

        System.out.println("\nMatriz após trocar diagonal principal com diagonal secundária:");
        imprimirMatriz(trocarDiagonais(matriz));
    }

    public static int[][] lerMatrizDoTeclado() {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Digite os elementos da matriz 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void imprimirElementosPosicoesParImpar(int[][] matriz) {
        for (int i = 0; i < 5; i += 2) {
            for (int j = 1; j < 5; j += 2) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] transpostaMatriz(int[][] matriz) {
        int[][] transposta = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }

        return transposta;
    }

    public static int[][] trocarDiagonais(int[][] matriz) {
        int[][] matrizTroca = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matrizTroca[i][j] = matriz[i][4 - j]; // Troca diagonal principal
                } else if (i + j == 4) {
                    matrizTroca[i][j] = matriz[i][j]; // Troca diagonal secundária
                } else {
                    matrizTroca[i][j] = matriz[i][j]; // Mantém os outros elementos
                }
            }
        }

        return matrizTroca;
    }
}
