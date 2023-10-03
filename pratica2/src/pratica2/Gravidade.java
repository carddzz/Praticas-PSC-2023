package pratica2;
import java.util.Scanner;

public class Gravidade {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um planeta (ex: Terra, Marte, etc.): ");
        String planeta = scanner.nextLine();

        double gravidade = 9.81; // Aceleração devido à gravidade na Terra (em m/s^2)

        System.out.print("Informe a velocidade inicial (v0) em m/s: ");
        double v0 = scanner.nextDouble();

        System.out.print("Informe o instante de tempo (t) em segundos: ");
        double t = scanner.nextDouble();

        double v = v0 - gravidade * t; // Calcula a velocidade em t segundos
        double h = v0 * t - (0.5 * gravidade * t * t); // Calcula a altura em t segundos

        System.out.println("Velocidade em " + t + " segundos: " + v + " m/s");
        System.out.println("Altura em " + t + " segundos: " + h + " metros");

        scanner.close();
    }
}


