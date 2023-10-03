package pratica3;
import java.util.Scanner;

public class Prefeitura {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaSalarios = 0;
        int somaFilhos = 0;
        int contador = 0;

        System.out.println("Informe o salário e o número de filhos dos habitantes (ou salário negativo para encerrar):");

        while (true) {
            System.out.print("Salário (em reais): ");
            double salario = scanner.nextDouble();

            // Verifica se o usuário quer encerrar o programa
            if (salario < 0) {
                break;
            }

            System.out.print("Número de filhos: ");
            int filhos = scanner.nextInt();

            somaSalarios += salario;
            somaFilhos += filhos;
            contador++;
        }

        if (contador > 0) {
            double mediaSalarios = somaSalarios / contador;
            double mediaFilhos = (double) somaFilhos / contador;

            System.out.println("Resultados da pesquisa:");
            System.out.println("Média Salarial: R$" + mediaSalarios);
            System.out.println("Média de Filhos: " + mediaFilhos);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        scanner.close();
    }

}
