package pratica5;

import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
       int somaidades= 0;
       int contador= 0;
       while(true) {
    	   System.out.println("Digite uma quantidade de numeros para calcular a media, caso queira interromper digite um numero negativo");
    	   int idade = scanner.nextInt();
    	   
          somaidades+= idade;
          contador++;
        
        
          
          
          if(idade==-1) {
        	 System.out.println("O numero tem que ser maior que 0");
        	 break;
          }
        		
    	   
          media =  somaidades / contador;

        
        		
       }
    	   
       System.out.println("Média das idades: " + media);
       
	}
}