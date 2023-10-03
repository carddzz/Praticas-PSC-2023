import javax.swing.JOptionPane;
public class CalcSalarioDialog {
	public static void main(String[] args) {
        String salarioMinimoStr = JOptionPane.showInputDialog("Digite o valor do salário mínimo:");
        double salarioMinimo = Double.parseDouble(salarioMinimoStr);
        
        String salarioFuncionarioStr = JOptionPane.showInputDialog("Digite o valor do salário do funcionário:");
        double salarioFuncionario = Double.parseDouble(salarioFuncionarioStr);
        
        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
        
        JOptionPane.showMessageDialog(null, "O funcionário recebe aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");
    }

}
