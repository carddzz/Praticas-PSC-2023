package pratica2;
import java.util.Scanner;

public class Hotel {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numeroDiarias = scanner.nextInt();

        double taxaServico = 0.0;

        if (numeroDiarias < 15) {
            taxaServico = 15.0;
        } else if (numeroDiarias == 15) {
            taxaServico = 10.0;
        } else {
            taxaServico = 5.0;
        }

        double precoDiaria = 500.0;
        double totalAPagar = precoDiaria * numeroDiarias + taxaServico * numeroDiarias;

        System.out.println("Total a ser pago pelo cliente: R$ " + totalAPagar);

        scanner.close();
    }
}


