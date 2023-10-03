import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: ");
        double salario = input.nextDouble();
        
        // Calcula o novo salário com aumento de 25%
        double novoSalario = salario * 1.25;
        
        System.out.println("O novo salário com aumento de 25% é: R$" + novoSalario);
        
        input.close();
    }

}
