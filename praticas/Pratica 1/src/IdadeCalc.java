import java.util.Scanner;

public class IdadeCalc {
	public static void main(String[]args) {

		Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = input.nextInt();
        
        System.out.print("Digite o ano atual: ");
        int anoAtual = input.nextInt();
        
        int idadeAtual = anoAtual - anoNascimento;
        int idade2050 = 2050 - anoNascimento;
        
        System.out.println("A idade da pessoa no ano atual é: " + idadeAtual + " anos.");
        System.out.println("A idade da pessoa em 2050 será: " + idade2050 + " anos.");
        
        input.close();
	}
	
	

}
