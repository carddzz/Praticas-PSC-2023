package pratica1;

import javax.swing.JOptionPane;	

public class IdadeCalcDialog {
	public static void main(String[] args) {
        String anoNascimentoStr = JOptionPane.showInputDialog("Digite seu ano de nascimento:");
        int anoNascimento = Integer.parseInt(anoNascimentoStr);
        
        String anoAtualStr = JOptionPane.showInputDialog("Digite seu ano atual:");
        int anoAtual = Integer.parseInt(anoAtualStr);
        
        int idadeAtual = anoAtual - anoNascimento;
        int idade2050 = 2050 - anoNascimento;
        
        JOptionPane.showMessageDialog(null, "A idade da pessoa no ano atual é: " + idadeAtual + " anos.");
        JOptionPane.showMessageDialog(null, "A idade da pessoa em 2050 será: " + idade2050 + " anos.");

	}
	
}
