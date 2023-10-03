package pratica1;

import javax.swing.JOptionPane;

public class TemperaturaDialog {
	 public static void main(String[] args) {
	        String temperaturaCelsiusStr = JOptionPane.showInputDialog("Digite a temperatura em Celsius:");
	        double temperaturaCelsius = Double.parseDouble(temperaturaCelsiusStr);
	        
	        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
	        
	        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + temperaturaFahrenheit + " °F");
	    }

}
