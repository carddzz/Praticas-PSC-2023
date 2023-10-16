package pratica5;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("O maior número informado é: " + maior);
        System.out.println("O menor número informado é: " + menor);
    }
}