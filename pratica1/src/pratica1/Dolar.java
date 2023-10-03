package pratica1;

import java.util.Scanner;

public class Dolar {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a cotação do dólar em reais: ");
        double cotacaoDolar = input.nextDouble();
        
        System.out.print("Digite o valor em dólares que você possui: ");
        double valorDolar = input.nextDouble();
        
        double valorReais = valorDolar * cotacaoDolar;
        
        System.out.println("O valor em reais é: R$" + valorReais);
        
        input.close();
	
	}
}