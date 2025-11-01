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

    public String elencoColore(int r, int g, int b) {
        String elenco="";
        int x=0;
        for (int i = 0; i < numeroMattoncini; i++) {
            Mattoncino n = mattoncini[i];
            if (n.getRed() == r && n.getGreen() == g && n.getBlue() == b) {
                elenco=elenco + n.toString();
                x++;
            }
        }
        if(x==0) {
            elenco = "Nessun mattoncino trovato con questo colore.\n";
        }
        return elenco;
    }

    public int numeroMattonciniStessoCodice (int codiceMattoncino){
        int n=1;
        for (int i=0; i<counter; i++){
            if (mattoncini[i].getCodice()==codiceMattoncino){
                n++;
            }
        }
        return n;
    }


    public String toString(){
        return "Prodotto Lego: " +nome + " (codice univoco: " +codiceUnivoco + ")";
    }
}
