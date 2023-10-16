package pratica5;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, idade = 0, soma = 0;
        double media; 
        while (num < 10) {
            System.out.print("Informe a idade da pessoa " + (num + 1) + ": ");
            idade = sc.nextInt();
            soma = idade + soma;
            num = num + 1;
        }
        media = (double) soma / 10; 
        System.out.print("Média das idades: " + media);
    }
}