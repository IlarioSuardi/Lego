public class ProdottoLego {
    private int codiceUnivoco;
    private String nome;
    private Mattoncino[] mattoncini;
    private int numeroMattoncini;

    private static int counter=0;

    public ProdottoLego(String nome, int maxMattoncini){
        this.codiceUnivoco=counter++;
        this.nome=nome;
        this.mattoncini=new Mattoncino[maxMattoncini];
        this.numeroMattoncini=0;
    }

    public void aggiungiMattoncino(Mattoncino n){
        if(numeroMattoncini<mattoncini.length) {
            mattoncini[numeroMattoncini] = n;
            numeroMattoncini++;
        }
        else{
            System.out.println("array pieno");
        }
    }

    public int numeroMattoncini(){
        return numeroMattoncini;
    }

    public double pesoTot() {
        double somma=0;
        for(int i=0; i<numeroMattoncini; i++){
            somma=somma+mattoncini[i].getPeso();
        }
        return somma;
    }

    public void elencoStessoColore(int r, int g, int b){
        for(int i=0; i<counter; i++){
        Mattoncino m=mattoncini[i];
        if(m.getRed()==r && m.getGreen()==g && m.getBlue()==b){
            System.out.println(m);
        }
    }

    public void elencoStessoCodice(){

    }

    public String toString(){
        return "ProdottoLego:" +nome + " CodiceUnivoco:" +codiceUnivoco;
    }
}
