package pratica5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 

        while (true) {
            System.out.println("Digite um número, caso queira interromper digite um número negativo:");
            int n = input.nextInt();

            if (n < 0) {
                break; 
            }

            if (n > maior) {
                maior = n;
            }

            if (n < menor) {
                menor = n;
            }
        }

        System.out.println("O maior número informado é: " + maior);
        System.out.println("O menor número informado é: " + menor);
    }
}