public class Mattoncino {
    private int codice;
    private int r, g, b;
    private double peso;
    private double larghezza, lunghezza, altezza;

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

    public int getCodice() {
        return codice;
    }
    public int getR() {
        return r;
    }
    public int getG() {
        return g;
    }
    public int getB() {
        return b;
    }
    public double getPeso() {
        return peso;
    }
    public double getLarghezza() {
        return larghezza;
    }
    public double getLunghezza() {
        return lunghezza;
    }
    public double getAltezza() {
        return altezza;
    }

    public void setCodice(int codice){
        this.codice=codice;
    }
    public void setR(int r){
        this.r=r;
    }
    public void setG(int g){
        this.g=g;
    }
    public void setB(int b){
        this.b=b;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public void setLarghezza(double larghezza){
        this.larghezza=larghezza;
    }
    public void setLunghezza(double lunghezza){
        this.lunghezza=lunghezza;
    }
    public void setAltezza(double altezza){
        this.altezza=altezza;
    }

    public String toString(){
        return "codice= " + codice + " colore= (" +r + ", " +g +", " +b +")" + "peso= " + peso + " g";
    }
}
