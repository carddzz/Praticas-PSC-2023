package pratica2;
import java.util.Scanner;

public class DiariaHotel {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de apartamento (S para simples, D para duplo): ");
        char tipoApartamento = scanner.next().charAt(0);

        System.out.print("Digite a quantidade de dias de hospedagem: ");
        int quantidadeDias = scanner.nextInt();

        double totalAPagar = 0.0;

        if (tipoApartamento == 'S' || tipoApartamento == 's') {
            if (quantidadeDias < 10) {
                totalAPagar = 100.00 * quantidadeDias;
            } else if (quantidadeDias >= 10 && quantidadeDias <= 15) {
                totalAPagar = 90.00 * quantidadeDias;
            } else {
                totalAPagar = 80.00 * quantidadeDias;
            }
        } else if (tipoApartamento == 'D' || tipoApartamento == 'd') {
            if (quantidadeDias < 10) {
                totalAPagar = 140.00 * quantidadeDias;
            } else if (quantidadeDias >= 10 && quantidadeDias <= 15) {
                totalAPagar = 120.00 * quantidadeDias;
            } else {
                totalAPagar = 100.00 * quantidadeDias;
            }
        } else {
            System.out.println("Tipo de apartamento não reconhecido.");
            scanner.close();
            return;
        }

        System.out.println("Total a ser pago: R$ " + totalAPagar);

        scanner.close();
    }

}
