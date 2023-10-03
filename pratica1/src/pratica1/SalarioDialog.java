package pratica1;

import javax.swing.JOptionPane;

public class SalarioDialog {
	
	 public static void main(String[] args) {
	        String salarioStr = JOptionPane.showInputDialog("Digite o salário do funcionário:");
	        double salario = Double.parseDouble(salarioStr);
	             
	        double novoSalario = salario * 1.25;
	        
	        JOptionPane.showMessageDialog(null, "O novo salário com aumento de 25% é: R$" + novoSalario);
	    }

}