package pratica4;
import javax.swing.JOptionPane;

public class Alg2 {
	
	public static void main(String args[]) {
		String entrada;
		int numero1, numero2, soma;
		
		do {
		  entrada = JOptionPane.showInputDialog("Informe o primeiro número: ");
	   	  numero1 = Integer.parseInt(entrada);
	   	  
		  entrada = JOptionPane.showInputDialog("Informe o segundo número: ");
		  numero2 = Integer.parseInt(entrada);
		
		  soma = numero1 + numero2;
		  JOptionPane.showMessageDialog(null, "A soma é: " + soma);
		  
		  int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	   	  if (resp == JOptionPane.YES_OPTION)
		    entrada = "sim";
		  else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
		    entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
																																							
		System.exit(0);
	}

}
