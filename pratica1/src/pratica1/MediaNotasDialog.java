package pratica1;

import javax.swing.JOptionPane;

public class MediaNotasDialog {
	public static void main(String[]args) {
		String input1 = JOptionPane.showInputDialog("Digite sua primeira nota:");
        double nota1 = Double.parseDouble(input1);
        
        String input2 = JOptionPane.showInputDialog("Digite sua segunda nota:");
        double nota2 = Double.parseDouble(input2);
        
        String input3 = JOptionPane.showInputDialog("Digite sua terceira nota:");
        double nota3 = Double.parseDouble(input3);
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        JOptionPane.showMessageDialog(null, "A média de suas notas é: " + media);
    
	}

}
