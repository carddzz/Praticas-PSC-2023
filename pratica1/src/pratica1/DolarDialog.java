package pratica1;

import javax.swing.JOptionPane;
public class DolarDialog {
	public static void main(String[] args) {
        String cotacaoDolarStr = JOptionPane.showInputDialog("Digite a cotação do dólar em reais:");
        double cotacaoDolar = Double.parseDouble(cotacaoDolarStr);
        
        String valorDolarStr = JOptionPane.showInputDialog("Digite o valor em dólares que você possui:");
        double valorDolar = Double.parseDouble(valorDolarStr);
        
        double valorReais = valorDolar * cotacaoDolar;
        
        JOptionPane.showMessageDialog(null, "O valor em reais é: R$" + valorReais);
    }

}
