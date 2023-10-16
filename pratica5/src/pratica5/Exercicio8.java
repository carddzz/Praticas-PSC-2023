package pratica5;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número base: ");
        int base = sc.nextInt();
        
        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();
        
        int resultado = 1;

       
        if (expoente < 0) {
            System.out.println("O expoente não pode ser negativo para este exemplo.");
        } else {
            
            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }

            System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
        }
    }
}