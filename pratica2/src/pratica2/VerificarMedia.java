package pratica2;
import java.util.Scanner;


public class VerificarMedia {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota do aluno (0 a 10): ");
        double nota1 = input.nextDouble();
        
        System.out.print("Digite a segunda nota do aluno (0 a 10): ");
        double nota2 = input.nextDouble();
        
        System.out.print("Digite a terceira nota do aluno (0 a 10): ");
        double nota3 = input.nextDouble();
        
        
        
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
            System.out.println("Por favor, insira notas válidas no intervalo de 0 a 10.");
        } else {
          
            double media = (nota1 + nota2 + nota3) / 3;
   
            if (media >= 0 && media < 3) {
                System.out.println("Média: " + media + " - Situação: REPROVADO");
            } else if (media >= 3 && media < 7) {
                System.out.println("Média: " + media + " - Situação: EXAME");
            } else if (media >= 7 && media <= 10) {
                System.out.println("Média: " + media + " - Situação: APROVADO");
            }
        }
        
        input.close();
    }
}


