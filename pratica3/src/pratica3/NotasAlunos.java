package pratica3;
import java.util.Scanner;

public class NotasAlunos {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosAprovados90 = 0;
        int alunosReprovados = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0.0;
        int totalAlunos = 0;

        System.out.println("Digite a nota final e o total de faltas dos alunos (digite nota negativa para encerrar):");

        while (true) {
            System.out.print("Nota final: ");
            double nota = scanner.nextDouble();

            // Verifica se o usuário quer encerrar o programa
            if (nota < 0) {
                break;
            }

            System.out.print("Total de faltas: ");
            int faltas = scanner.nextInt();

            totalAlunos++;

            // Verifica se a nota é maior ou igual a 90
            if (nota >= 90) {
                alunosAprovados90++;
            }

            // Verifica se o aluno foi reprovado
            if (nota < 70 || faltas >= 20) {
                alunosReprovados++;
            }

            // Atualiza a maior e a menor nota
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }

            // Acumula as notas para calcular a média
            somaNotas += nota;
        }

        if (totalAlunos > 0) {
            double media = somaNotas / totalAlunos;

            System.out.println("Quantidade de alunos com nota >= 90: " + alunosAprovados90);
            System.out.println("Quantidade de alunos reprovados: " + alunosReprovados);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média de notas da turma: " + media);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        scanner.close();
    }

}
