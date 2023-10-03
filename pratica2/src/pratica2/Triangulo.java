package pratica2;

import 	javax.swing.JOptionPane;

public class Triangulo { 
public static void main(String[] args) {
    String lado1Str = JOptionPane.showInputDialog("Digite o valor do primeiro lado do triângulo:");
    double lado1 = Double.parseDouble(lado1Str);
    
    String lado2Str = JOptionPane.showInputDialog("Digite o valor do segundo lado do triângulo:");
    double lado2 = Double.parseDouble(lado2Str);
    
    String lado3Str = JOptionPane.showInputDialog("Digite o valor do terceiro lado do triângulo:");
    double lado3 = Double.parseDouble(lado3Str);
    
    String tipoTriangulo;
    
    if (lado1 == lado2 && lado2 == lado3) {
        tipoTriangulo = "Equilátero";
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        tipoTriangulo = "Isósceles";
    } else {
        tipoTriangulo = "Escaleno";
    }
    
    JOptionPane.showMessageDialog(null, "Tipo de triângulo: " + tipoTriangulo);
      }
}


