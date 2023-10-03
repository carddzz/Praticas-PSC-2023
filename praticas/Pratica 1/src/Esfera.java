import java.util.Scanner;

public class Esfera {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o raio da esfera: ");
        double raio = input.nextDouble();
        
        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = (3.0 / 4) * Math.PI * Math.pow(raio, 3);
        
        System.out.println("O comprimento da esfera é: " + comprimento);
        System.out.println("A área da esfera é: " + area);
        System.out.println("O volume da esfera é: " + volume);
        
        input.close();
    }

}
