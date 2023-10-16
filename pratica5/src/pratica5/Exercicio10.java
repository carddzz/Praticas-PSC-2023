package pratica5;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contadorFeminino20a40 = 0; 
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Informações da pessoa " + i + ":");
            
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().charAt(0);
            
         
            if (sexo == 'F' && idade >= 20 && idade <= 40) {
                contadorFeminino20a40++;
            }
        }
        
        System.out.println("Total de pessoas do sexo feminino entre 20 e 40 anos: " + contadorFeminino20a40);
    }
}