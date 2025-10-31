public class Mattoncino {
    public int codice;
    private int r;
    private int g;
    private int b;
    private double peso;
    private double larghezza;
    private double lunghezza;
    private double altezza;

    public Mattoncino(int codice, int r, int g, int b, double peso, double larghezza, double lunghezza, double altezza){
        this.codice=codice;
        this.r=r;
        this.g=g;
        this.b=b;
        this.peso=peso;
        this.larghezza=larghezza;
        this.lunghezza=lunghezza;
        this.altezza=altezza;
    }

    public double getPeso() {
        return peso;
    }

    public String toString() {
        return "Codice=" + codice + " Colore=(" + r + "," + g + "," + b + ") Peso=" + peso + "g]";
    }
}
