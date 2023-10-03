package pratica3;
import java.util.Scanner;

public class PesquisaTv {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 0;
        int[] canais = {2, 4, 5, 7, 12};
        int[] audienciaPorCanal = new int[canais.length];

        System.out.println("Informe o número do canal e o número de pessoas assistindo (ou digite 0 para encerrar):");

        while (true) {
            System.out.print("Número do canal (2, 4, 5, 7, 12): ");
            int canal = scanner.nextInt();

            // Verifica se o usuário quer encerrar o programa
            if (canal == 0) {
                break;
            }

            boolean canalValido = false;

            for (int i = 0; i < canais.length; i++) {
                if (canal == canais[i]) {
                    canalValido = true;
                    break;
                }
            }

            if (canalValido) {
                System.out.print("Número de pessoas assistindo: ");
                int pessoasAssistindo = scanner.nextInt();

                totalPessoas += pessoasAssistindo;
                audienciaPorCanal[getIndexDoCanal(canal, canais)] += pessoasAssistindo;
            } else {
                System.out.println("Canal inválido. Por favor, escolha um canal válido.");
            }
        }

        if (totalPessoas > 0) {
            System.out.println("Resultado da pesquisa de audiência:");

            for (int i = 0; i < canais.length; i++) {
                double percentualAudiencia = (double) audienciaPorCanal[i] / totalPessoas * 100;
                System.out.println("Canal " + canais[i] + ": " + percentualAudiencia + "% de audiência");
            }
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        scanner.close();
    }

    private static int getIndexDoCanal(int canal, int[] canaisValidos) {
        for (int i = 0; i < canaisValidos.length; i++) {
            if (canal == canaisValidos[i]) {
                return i;
            }
        }
        return -1; // Retorna -1 se o canal não for encontrado
    }
}

