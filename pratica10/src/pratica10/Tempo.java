package pratica10;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        // Construtor padrão: 0:0:0
        this(0, 0, 0);
    }

    public Tempo(int hora) {
        // Construtor com hora: hora:0:0
        this(hora, 0, 0);
    }

    public Tempo(int hora, int minuto) {
        // Construtor com hora e minuto: hora:minuto:0
        this(hora, minuto, 0);
    }

    public Tempo(int hora, int minuto, int segundo) {
        // Construtor com hora, minuto e segundo
        setTime(hora, minuto, segundo);
    }

    public void setTime(int hora, int minuto, int segundo) {
        // Verifica se os valores são válidos antes de atribuí-los
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            System.out.println("Valores de tempo inválidos.");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida.");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido.");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido.");
        }
    }

    public String toString() {
        // Formata a hora no formato h:m:s
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}



// public static void main(String[] args) {
//Tempo t1 = new Tempo();               // 0:0:0
//Tempo t2 = new Tempo(8);             // 8:0:0
//Tempo t3 = new Tempo(8, 30);        // 8:30:0
//Tempo t4 = new Tempo(8, 30, 45);  // 8:30:45

//System.out.println(t1); // Saída: 0:0:0
//System.out.println(t2); // Saída: 8:0:0
//System.out.println(t3); // Saída: 8:30:0
//System.out.println(t4); // Saída: 8:30:45

//t1.setHora(15);
//t1.setMinuto(45);
//t1.setSegundo(20);

//System.out.println(t1); // Saída: 15:45:2
//}
