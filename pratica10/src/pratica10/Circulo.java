package pratica10;

import java.util.Scanner;

public class Circulo {
    private int x, y;
    private double raio;

    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo() {
        this(0, 0, 0);
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void moveX(int x1) {
        x += x1;
    }

    public void moveY(int y1) {
        y += y1;
    }

    public void aumenta(double n) {
        raio *= n;
    }

    public void exibe() {
        System.out.println("Centro: (" + x + ", " + y + ")");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe as coordenadas x e y: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.print("Informe o raio: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(x, y, raio);

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Mover");
            System.out.println("2 - Aumentar");
            System.out.println("3 - Imprimir");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o deslocamento em x e y: ");
                    int deslocamentoX = scanner.nextInt();
                    int deslocamentoY = scanner.nextInt();
                    circulo.moveX(deslocamentoX);
                    circulo.moveY(deslocamentoY);
                    break;
                case 2:
                    System.out.print("Informe o fator de aumento: ");
                    double fator = scanner.nextDouble();
                    circulo.aumenta(fator);
                    break;
                case 3:
                    circulo.exibe();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }
}
