package pratica2;

import java.util.Scanner;

public class MediaNotas {
	
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite a primeira nota do aluno: ");
    double nota1 = input.nextDouble();
    
    System.out.print("Digite a segunda nota do aluno: ");
    double nota2 = input.nextDouble();
    
    // Calcula a média das duas notas
    
    double media = (nota1 + nota2) / 2;
    
    System.out.println("A média do aluno é: " + media);
    
    // Verifica a situação do aluno
    
    if (media >= 7) {
        System.out.println("Situação: Aprovado");
    } else {
        System.out.println("Situação: Reprovado");
    }
    
    input.close();
    
     }
	

}
