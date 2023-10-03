package pratica3;
import java.util.Scanner;

public class Aprovacao {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.print("Digite a matrícula do aluno (ou matrícula negativa para encerrar): ");
	            int matricula = scanner.nextInt();

	            // Verifica se o usuário quer encerrar o programa
	            if (matricula < 0) {
	                break;
	            }

	            System.out.print("Digite a primeira nota do aluno: ");
	            double nota1 = scanner.nextDouble();
	            System.out.print("Digite a segunda nota do aluno: ");
	            double nota2 = scanner.nextDouble();
	            System.out.print("Digite a terceira nota do aluno: ");
	            double nota3 = scanner.nextDouble();

	            double media = (nota1 + nota2 + nota3) / 3;

	            String resultado = "";

	            if (media >= 70) {
	                resultado = "Aprovado";
	            } else if (media >= 60) {
	                resultado = "Recuperação";
	            } else {
	                resultado = "Reprovado";
	            }

	            System.out.println("Resultado para a matrícula " + matricula + ": " + resultado);
	        }

	        scanner.close();
	    }

}
