package pratica10;

/**
 * Classe PessoaJuridica
 */
class PessoaJuridica extends Pessoa {
    private String CNPJ;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}