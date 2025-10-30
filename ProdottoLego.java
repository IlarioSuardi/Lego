public class ProdottoLego {
    private int codiceUnivoco;
    private String nome;
    private Mattoncino[] mattoncini;
    private int numero;

    private static int num=0;
    private static int counter=0;

    public ProdottoLego(String nome, int maxMattoncini){
        this.codiceUnivoco=counter++;
        this.nome=nome;
        this.mattoncini=new Mattoncino[maxMattoncini];
        this.numero=num++;
    }

    public void aggiungiMattoncino(Mattoncino n){
        if(numero<mattoncini.length) {
            mattoncini[numero] = n;
            numero++;
        }
        else{
            System.out.println("array pieno");
        }
    }

    public int numeroMattoncini(){
        return numero;
    }

    public double pesoTot() {
        double somma=0;
        for(int i=0; i<numero; i++){
            somma=somma+mattoncini[i].getPeso();
        }
        return somma;
    }
}
