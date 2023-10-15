package pratica4;
import javax.swing.JOptionPane;

public class Quest2 {
	 public static void main(String[] args) {
	        String entrada;
	        int nota, salario, idade, verificador;
	        String sexo = "";
	        do {
	            do{//nota
	                verificador = 6;
	                entrada = JOptionPane.showInputDialog("Informe a nota: ");
	                nota = Integer.parseInt(entrada);
	                
	                if (nota >= 0 && nota <= 10){
	                    verificador = 1;
	                    JOptionPane.showMessageDialog (null, "Passou, Parabéns", "Mensagem de Sucesso", JOptionPane.INFORMATION_MESSAGE);
	                } else{
	                    JOptionPane.showMessageDialog (null, "Não Passou. Insira APENAS numeros validos.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
	                }
	            } while(verificador != 1);
	            
	            do{//salario
	                verificador = 1000;
	                entrada = JOptionPane.showInputDialog("Informe o salário: ");
	                salario = Integer.parseInt(entrada);
	                
	                if (salario >= 1000){
	                    verificador = 1;
	                    JOptionPane.showMessageDialog (null, "Passou, Parabéns", "Mensagem de Sucesso", JOptionPane.INFORMATION_MESSAGE);
	                } else{
	                    JOptionPane.showMessageDialog (null, "Não Passou. Insira APENAS numeros validos.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
	                }
	            } while(verificador != 1);
	            
	            do{//sexo
	                verificador = 0;
	                entrada = JOptionPane.showInputDialog("Informe o sexo: ");
	                sexo = entrada;
	                
	                if (sexo.equals("m") || sexo.equals("f")){
	                    verificador = 1;
	                    JOptionPane.showMessageDialog (null, "Passou, Parabéns", "Mensagem de Sucesso", JOptionPane.INFORMATION_MESSAGE);
	                } else{
	                    JOptionPane.showMessageDialog (null, "Não Passou. Insira APENAS letras validas.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
	                }
	            } while(verificador != 1);
	            
	            do{//idade
	                verificador = 0;
	                entrada = JOptionPane.showInputDialog("Informe a idade: ");
	                idade = Integer.parseInt(entrada);
	                
	                if (idade >= 0 && idade <= 120){
	                    verificador = 1;
	                    JOptionPane.showMessageDialog (null, "Passou, Parabéns", "Mensagem de Sucesso", JOptionPane.INFORMATION_MESSAGE);
	                } else{
	                    JOptionPane.showMessageDialog (null, "Não Passou. Insira APENAS numeros validos.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
	                }
	            } while(verificador != 1);            
	    
	            entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
	        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
	        System.exit(0);

	    }

}
