public class Main {
    public static void main(String[] args){
        ProdottoLego prodotto=new ProdottoLego("macchinina", 10);

        Mattoncino n1=new Mattoncino(10, 255, 0,0, 2.0, 5, 10,5);
        Mattoncino n2=new Mattoncino(10, 0, 255,0, 2.0, 10, 5,2);
        Mattoncino n3=new Mattoncino(20, 0, 0,255, 3.0, 10, 20,5);

        prodotto.aggiungiMattoncino(n1);
        prodotto.aggiungiMattoncino(n2);
        prodotto.aggiungiMattoncino(n3);

        System.out.println(prodotto);
        System.out.println("peso totale: " + prodotto.pesoTot() + "g");
    }
}
