import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int numero = input.nextInt();
        
        System.out.println("Tabuada de multiplicação para " + numero + ":");
        
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        input.close();
    }

}
