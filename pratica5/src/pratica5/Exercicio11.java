package pratica5;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contadorMasculino60a80 = 0;
        int contadorFeminino50a70 = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Informações da pessoa " + i + ":");
            
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().charAt(0);
            
            System.out.print("Peso (em kg): ");
            double peso = sc.nextDouble();
            
            if (sexo == 'M' && peso >= 60 && peso <= 80) {
                contadorMasculino60a80++;
            } else if (sexo == 'F' && peso >= 50 && peso <= 70) {
                contadorFeminino50a70++;
            }
        }
        
        System.out.println("Homens com peso entre 60 e 80 kg: " + contadorMasculino60a80);
        System.out.println("Mulheres com peso entre 50 e 70 kg: " + contadorFeminino50a70);
    }
}