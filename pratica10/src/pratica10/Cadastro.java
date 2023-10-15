package pratica10;

/**
 * Classe Cadastro
 */
class Cadastro {
    private Pessoa[] pessoas;
    private int totalPessoas;

    public Cadastro(int tamanho) {
        pessoas = new Pessoa[tamanho];
        totalPessoas = 0;
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        if (totalPessoas < pessoas.length) {
            pessoas[totalPessoas] = pessoa;
            totalPessoas++;
        } else {
            System.out.println("O cadastro está cheio. Não é possível adicionar mais pessoas.");
        }
    }

    public void imprimirCadastro() {
        for (int i = 0; i < totalPessoas; i++) {
            Pessoa pessoa = pessoas[i];
            if (pessoa instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) pessoa;
                System.out.println("Nome: " + pf.getNome() + ", CPF: " + pf.getCPF());
            } else if (pessoa instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) pessoa;
                System.out.println("Nome: " + pj.getNome() + ", CNPJ: " + pj.getCNPJ());
            } else {
                System.out.println("Nome: " + pessoa.getNome());
            }
        }
    }
}
