package pratica9;

/**
 * Classe para representar uma conta corrente em um banco.
 */
public class ContaCorrente {
    private int numero;
    private int agencia;
    private double saldo;

    /**
     * Inicializa uma conta corrente com o número e agência especificados e saldo zero.
     *
     * @param n O número da conta.
     * @param ag A agência da conta.
     */
    public void iniciarContaCorrente(int n, int ag) {
        numero = n;
        agencia = ag;
        saldo = 0;
    }

    /**
     * Realiza um saque na conta, desde que o saldo seja suficiente.
     *
     * @param valor O valor a ser sacado.
     * @return true se o saque for bem-sucedido, false se o saldo for insuficiente.
     */
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return false;
        }
    }

    /**
     * Realiza um depósito na conta.
     *
     * @param valor O valor a ser depositado.
     */
    public void depositar(double valor) {
        saldo += valor;
    }

    /**
     * Consulta o saldo atual da conta.
     *
     * @return O saldo atual da conta.
     */
    public double consultarSaldo() {
        return saldo;
    }

    /**
     * Exibe os dados da conta, incluindo agência, número e saldo.
     */
    public void exibe() {
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }
}

