package pratica11;

import java.util.Scanner;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private static int ultimo_id = 0;

    public Produto() {
        id = ++ultimo_id;
        nome = "Nome não informado";
        preco = 0;
    }

    public Produto(String nome, double preco) {
        this(); // Chama o construtor padrão para atribuir o id
        this.nome = nome;
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }
    }

    public void exibe() {
        System.out.println("Produto: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
    }

    public void reajustaPreco(double percentual) {
        preco += preco * (percentual / 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do primeiro produto: ");
        String nome1 = scanner.nextLine();
        System.out.print("Informe o preço do primeiro produto: ");
        double preco1 = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Informe o nome do segundo produto: ");
        String nome2 = scanner.nextLine();
        System.out.print("Informe o preço do segundo produto: ");
        double preco2 = scanner.nextDouble();

        Produto produto1 = new Produto(nome1, preco1);
        Produto produto2 = new Produto(nome2, preco2);

        System.out.print("Informe o percentual de reajuste: ");
        double percentual = scanner.nextDouble();

        produto1.reajustaPreco(percentual);
        produto2.reajustaPreco(percentual);

        produto1.exibe();
        produto2.exibe();

        System.out.println("Último ID gerado: " + Produto.ultimo_id);
    }
}