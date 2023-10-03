package pratica2;
import java.util.Scanner;

public class Produtoprec {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o código do produto:");
        int codigoProduto = scanner.nextInt();

        double preco = 0.0; 

        switch (codigoProduto) {
            case 1:
                preco = 99.99;
                break;
            case 2:
                preco = 103.89;
                break;
            case 3:
                preco = 49.98;
                break;
            case 4:
                preco = 89.72;
                break;
            case 5:
                preco = 97.35;
                break;
            default:
                System.out.println("Código de produto inválido.");
                break;
        }

        if (preco > 0) {
            System.out.println("O preço do produto é: R$ " + preco);
        }

        scanner.close();
    }
}


