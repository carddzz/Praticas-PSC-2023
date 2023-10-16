package pratica5;

import java.util.Scanner;
public class Exercicio3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro não negativo: ");
	        int numero = scanner.nextInt();

	        if (numero < 0) {
	            System.out.println("O número deve ser não negativo.");
	        } else {
	            long fatorial = 1;

	            for (int i = 1; i <= numero; i++) {
	                fatorial *= i;
	            }

	            System.out.println(numero + "! = " + fatorial);
	        }

	        
	    }
	}