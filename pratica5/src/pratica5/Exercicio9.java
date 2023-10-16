package pratica5;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        
        System.out.println("Números ímpares de 1 até " + numero + ":");
        
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
            }
        }
    }
}