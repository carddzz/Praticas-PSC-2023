package pratica2;
import javax.swing.JOptionPane;

public class IMC {
	public static void main(String[] args) {
        String pesoStr = JOptionPane.showInputDialog("Digite o peso em kg:");
        double peso = Double.parseDouble(pesoStr);
        
        String alturaStr = JOptionPane.showInputDialog("Digite a altura em metros:");
        double altura = Double.parseDouble(alturaStr);
        
        // Calcula o IMC
        double imc = peso / (altura * altura);
        
        // Determina a situação de peso com base no IMC
        String situacaoPeso;
        if (imc < 20) {
            situacaoPeso = "Abaixo do Peso";
        } else if (imc >= 20 && imc < 25) {
            situacaoPeso = "Normal";
        } else if (imc >= 25 && imc < 30) {
            situacaoPeso = "Sobrepeso";
        } else if (imc >= 30 && imc <= 40) {
            situacaoPeso = "Obesidade";
        } else {
            situacaoPeso = "Obesidade Mórbida";
        }
        
        JOptionPane.showMessageDialog(null, "O IMC é: " + imc);
        JOptionPane.showMessageDialog(null, "Situação de peso: " + situacaoPeso);
    }
}

