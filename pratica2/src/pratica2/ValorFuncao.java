package pratica2;

public class ValorFuncao {
	public static void main(String[] args) {
        // Defina o valor de entrada 'x'
        double x = 2.5; // Substitua 2.5 pelo valor desejado de 'x'

        // Calcule o valor da função com base no valor de 'x'
        double resultado;

        if (x < -2) {
            resultado = 2 * x + 2;
        } else if (x >= -2 && x < 3) {
            resultado = 3;
        } else {
            resultado = -x;
        }

        // Exiba o resultado
        System.out.println("f(" + x + ") = " + resultado);
    }
}


