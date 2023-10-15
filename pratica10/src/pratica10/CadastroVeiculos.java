package pratica10;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para cadastrar e gerenciar veículos.
 */
public class CadastroVeiculos {
    private List<Veiculo> veiculos;

    /**
     * Construtor para inicializar o cadastro de veículos.
     */
    public CadastroVeiculos() {
        veiculos = new ArrayList<>();
    }

    /**
     * Método para cadastrar um veículo no vetor.
     *
     * @param veiculo O veículo a ser cadastrado.
     */
    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    /**
     * Método para imprimir o vetor de cadastro de veículos.
     */
    public void imprimirCadastro() {
        for (Veiculo veiculo : veiculos) {
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Número de Chassi: " + veiculo.getNumeroChassi());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println();
        }
    }
}