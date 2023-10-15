package pratica9;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Funcionario> funcionarios;

    public Cadastro() {
        funcionarios = new ArrayList<>();
    }

    /**
     * Método para cadastrar um funcionário no vetor.
     */
    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    /**
     * Método para imprimir o vetor de cadastro.
     */
    public void imprimirCadastro() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibe();
            System.out.println();
        }
    }
}
 