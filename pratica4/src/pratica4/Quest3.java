package pratica4;

import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        while (true) {
            // Coloque o código da prática aqui
            System.out.println("Execução");

            // Pergunte ao usuário se deseja continuar
            System.out.print("Deseja continuar (S para sim, qualquer outra tecla para não)? ");
            resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("S")) {
                break; // Saia do loop se a resposta não for "S"
            }
        }
    }
}