package pratica1;

import java.util.Scanner;

public class Losango {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor da diagonal maior do losango: ");
        double diagonalMaior = input.nextDouble();
        
        System.out.print("Digite o valor da diagonal menor do losango: ");
        double diagonalMenor = input.nextDouble();
        
        double area = (diagonalMaior * diagonalMenor) / 2;
        
        System.out.println("A área do losango é: " + area);
        
        input.close();
    }
	

}
