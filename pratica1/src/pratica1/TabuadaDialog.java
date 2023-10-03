package pratica1;

import javax.swing.JOptionPane;

public class TabuadaDialog {
	public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Informe um número:");
        int numero = Integer.parseInt(numeroStr);
        
        StringBuilder tabuada = new StringBuilder();
        tabuada.append("Tabuada de multiplicação para ").append(numero).append(":\n");
        
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, tabuada.toString());
    }

	
}
