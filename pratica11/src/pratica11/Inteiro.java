package pratica11;

import java.util.Scanner;

public class Inteiro {
    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }

    public int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }
        return resultado;
    }

    public int divisao(int a, int b) {
        int quociente = 0;
        while (a >= b) {
            a = a - b;
            quociente++;
        }
        return quociente;
    }

    public int resto(int a, int b) {
        while (a >= b) {
            a = a - b;
        }
        return a;
    }

    public boolean par(int a) {
        return resto(a, 2) == 0;
    }

    public static void main(String[] args) {
        Inteiro inteiro = new Inteiro();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("1 – Multiplicação.");
            System.out.println("2 – Potência.");
            System.out.println("3 – Divisão.");
            System.out.println("4 – Par.");
            System.out.println("5 – Sair.");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor de a: ");
                    int a = scanner.nextInt();
                    System.out.print("Informe o valor de b: ");
                    int b = scanner.nextInt();
                    int resultadoMultiplicacao = inteiro.multiplicacao(a, b);
                    System.out.println("Resultado: " + resultadoMultiplicacao);
                    break;
                case 2:
                    System.out.print("Informe o valor de a: ");
                    a = scanner.nextInt();
                    System.out.print("Informe o valor de b: ");
                    b = scanner.nextInt();
                    int resultadoPotencia = inteiro.potencia(a, b);
                    System.out.println("Resultado: " + resultadoPotencia);
                    break;
                case 3:
                    System.out.print("Informe o valor de a: ");
                    a = scanner.nextInt();
                    System.out.print("Informe o valor de b: ");
                    b = scanner.nextInt();
                    int resultadoDivisao = inteiro.divisao(a, b);
                    System.out.println("Resultado: " + resultadoDivisao);
                    break;
                case 4:
                    System.out.print("Informe o valor de a: ");
                    a = scanner.nextInt();
                    boolean resultadoPar = inteiro.par(a);
                    if (resultadoPar) {
                        System.out.println("É par.");
                    } else {
                        System.out.println("Não é par.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }
}