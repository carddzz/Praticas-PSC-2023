package pratica2;
import java.util.Scanner;


public class VerificTriangulo { 
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro lado em cm: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o segundo lado em cm: ");
        double b = scanner.nextDouble();
        System.out.print("Informe o terceiro lado em cm: ");
        double c = scanner.nextDouble();

        boolean condicao1 = (a + b > c) && (b + c > a) && (a + c > b);
        boolean condicao2 = Math.abs(b - c) < a && Math.abs(a - c) < b && Math.abs(a - b) < c;

        if (condicao1 && condicao2) {
            System.out.println("Os três valores informados podem ser os comprimentos dos lados de um triângulo.");
        } else {
            System.out.println("Os três valores informados não podem formar um triângulo.");
        }

        scanner.close();
    }
}


