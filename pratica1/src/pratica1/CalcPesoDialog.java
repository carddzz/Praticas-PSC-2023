package pratica1;

import javax.swing.JOptionPane;

public class CalcPesoDialog {
	 public static void main(String[] args) {
	        String pesoAtualStr = JOptionPane.showInputDialog("Digite o peso atual da pessoa:");
	        double pesoAtual = Double.parseDouble(pesoAtualStr);
	        
	        double novoPesoEngordar = pesoAtual * 1.15;
	       
	        double novoPesoEmagrecer = pesoAtual * 0.8;
	        
	        JOptionPane.showMessageDialog(null, "Caso emagreça 15%, o novo peso será: " + novoPesoEngordar + " kg");
	        JOptionPane.showMessageDialog(null, "Caso emagreça 20%, o novo peso será: " + novoPesoEmagrecer + " kg");
	    }

}
