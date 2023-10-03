import java.util.Scanner;

public class CalcSalario {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite o valor do salário mínimo: ");
	        double salarioMinimo = input.nextDouble();
	        
	        System.out.print("Digite o valor do salário do funcionário: ");
	        double salarioFuncionario = input.nextDouble();
	        
	        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
	        
	        System.out.println("O funcionário recebe aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");
	        
	        input.close();
	    }

}
