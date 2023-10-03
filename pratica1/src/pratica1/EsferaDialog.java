package pratica1;

import javax.swing.JOptionPane;

public class EsferaDialog {
	public static void main(String[] args) {
        String raioStr = JOptionPane.showInputDialog("Digite o raio da esfera:");
        double raio = Double.parseDouble(raioStr);
        
        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = (3.0 / 4) * Math.PI * Math.pow(raio, 3);
        
        JOptionPane.showMessageDialog(null, "O comprimento da esfera é: " + comprimento);
        JOptionPane.showMessageDialog(null, "A área da esfera é: " + area);
        JOptionPane.showMessageDialog(null, "O volume da esfera é: " + volume);
    }

}
