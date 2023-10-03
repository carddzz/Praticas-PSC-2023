package pratica1;

import javax.swing.JOptionPane;

public class HipotCalcDialog {
	 public static void main(String[] args) {
	        String cateto1Str = JOptionPane.showInputDialog("Digite o valor do primeiro cateto:");
	        double cateto1 = Double.parseDouble(cateto1Str);
	        
	        String cateto2Str = JOptionPane.showInputDialog("Digite o valor do segundo cateto:");
	        double cateto2 = Double.parseDouble(cateto2Str);
	      
	        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	        
	        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hipotenusa);
	    }

}
