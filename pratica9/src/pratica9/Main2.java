package pratica9;

public class Main2 {
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Cadastro cadastro = new Cadastro();

	        while (true) {
	            System.out.print("Informe o nome do funcionário (ou digite 'fim' para encerrar): ");
	            String nome = scanner.nextLine();

	            if (nome.equalsIgnoreCase("fim")) {
	                break;
	            }

	            System.out.print("Informe a idade: ");
	            int idade = scanner.nextInt();
	            scanner.nextLine(); // Consumir a quebra de linha

	            System.out.print("Informe o cargo: ");
	            String cargo = scanner.nextLine();

	            System.out.print("Informe o salário: ");
	            double salario = scanner.nextDouble();
	            scanner.nextLine(); // Consumir a quebra de linha

	            System.out.print("Informe o telefone: ");
	            String telefone = scanner.nextLine();

	            System.out.print("Informe o endereço: ");
	            String endereco = scanner.nextLine();

	            Funcionario funcionario = new Funcionario(nome, idade, cargo, salario, telefone, endereco);
	            cadastro.cadastrarFuncionario(funcionario);
	        }

	        System.out.println("=== Funcionários Cadastrados ===");
	        cadastro.imprimirCadastro();

	        scanner.close();
	    }
	}

}
