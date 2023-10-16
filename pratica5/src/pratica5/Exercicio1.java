package pratica5;

public class Exercicio1 {
	
    public static void main(String[] args) {
        int inicio = 7;
        int fim = 20;
        int soma = 0;

        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }

        System.out.println("A soma dos números entre " + inicio + " e " + fim + " é: " + soma);
    }
}