package pratica1;

import java.util.Scanner;

public class MediaNotas {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		double nota1 = input.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
        double nota2 = input.nextDouble();
        
        System.out.println("Digite sua terceira nota: ");
        double nota3 = input.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A média de suas notas é: " + media);
        
        input.close();
	}

}