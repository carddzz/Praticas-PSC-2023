package pratica1;

import java.util.Scanner;

public class CalcPeso {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o peso atual da pessoa: ");
        double pesoAtual = input.nextDouble();
        
        double novoPesoEngordar = pesoAtual * 1.15;
        
        double novoPesoEmagrecer = pesoAtual * 0.8;
        
        System.out.println("Se a pessoa engordar 15%, o novo peso serÃ¡: " + novoPesoEngordar + " kg");
        System.out.println("Se a pessoa emagrecer 20%, o novo peso serÃ¡: " + novoPesoEmagrecer + " kg");
        
        input.close();
    }

}
