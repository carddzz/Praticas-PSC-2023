package pratica9;

public class Retangulo {
    private float altura;
    private float largura;

    public Retangulo() {
        altura = 0;
        largura = 0;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float alt) {
        altura = alt;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float larg) {
        largura = larg;
    }

    public float calculaArea() {
        return altura * largura;
    }

    public float calculaPerimetro() {
        return 2 * altura + 2 * largura;
    }

    public String exibe() {
        return "Altura: " + altura + "\n" +
               "Largura: " + largura + "\n" +
               "Área: " + calculaArea() + "\n" +
               "Perímetro: " + calculaPerimetro();
    }
}

// import java.util.Scanner;

//public class Main {
    //public static void main(String[] args) {
        //Retangulo ret = new Retangulo();
        //Scanner input = new Scanner(System.in);

        //System.out.print("Informe a altura do retângulo: ");
        //ret.setAltura(input.nextFloat());
       // System.out.print("Informe a largura do retângulo: ");
        //ret.setLargura(input.nextFloat());

       // System.out.println(ret.exibe());
  //  }
//}