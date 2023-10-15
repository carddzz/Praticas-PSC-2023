package pratica9;

public class Funcionario {
	
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private String telefone;
    private String endereco;

    /**
     * Construtor para inicializar os atributos do funcionário.
     */
    public Funcionario(String nome, int idade, String cargo, double salario, String telefone, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    /**
     * Método para exibir todos os dados do funcionário.
     */
    public void exibe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
    }
}