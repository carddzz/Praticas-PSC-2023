package pratica7;

import java.util.Scanner;

public class Exercicio1d{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][4 - i];
            matriz[i][4 - i] = temp;
        }
        System.out.println("Matriz resultante (com diagonais trocadas):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}