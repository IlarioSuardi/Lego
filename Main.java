public class Main {
    public static void main(String[] args) {
        ProdottoLego prodotto1 = new ProdottoLego("macchinina", 10);

        prodotto1.aggiungiMattoncino(new Mattoncino(10, 255, 0, 0, 4.0, 5, 10, 5));
        prodotto1.aggiungiMattoncino(new Mattoncino(10, 0, 255, 0, 6.0, 10, 5, 2));
        prodotto1.aggiungiMattoncino(new Mattoncino(20, 0, 0, 255, 3.0, 10, 20, 5));

        System.out.println(prodotto1);
        System.out.println("numero totale di mattoncini: " + prodotto1.numeroMattoncini());
        System.out.println("peso totale: " + prodotto1.pesoTot() + "g");
        System.out.println("mattoncini con lo stesso codice: " + prodotto1.numeroMattonciniStessoCodice(10));
        System.out.println("mattoncini di colore rosso : " + prodotto1.elencoColore(255, 0, 0));
        System.out.println("mattoncini di colore verde : " + prodotto1.elencoColore(0, 255, 0));
        System.out.println("mattoncini di colore blu : " + prodotto1.elencoColore(0, 0, 255));
        System.out.println("mattoncini di colore bianco : " + prodotto1.elencoColore(255, 255, 255));
        System.out.println("mattoncini di colore nero : " + prodotto1.elencoColore(0, 0, 0));

        ProdottoLego prodotto2 = new ProdottoLego("castello", 15);

        prodotto2.aggiungiMattoncino(new Mattoncino(10, 255, 0, 0, 2.0, 7, 10, 20));
        prodotto2.aggiungiMattoncino(new Mattoncino(10, 0, 255, 0, 6.0, 16, 15, 5));
        prodotto2.aggiungiMattoncino(new Mattoncino(20, 0, 0, 255, 5.0, 10, 20, 12));
        prodotto2.aggiungiMattoncino(new Mattoncino(10, 255, 0, 0, 7.0, 7, 10, 12));
        prodotto2.aggiungiMattoncino(new Mattoncino(30, 0, 255, 0, 2.0, 16, 5, 5));
        prodotto2.aggiungiMattoncino(new Mattoncino(20, 0, 0, 255, 10.0, 20, 20, 12));

        System.out.println(prodotto2);
        System.out.println("numero totale di mattoncini: " + prodotto2.numeroMattoncini());
        System.out.println("peso totale: " + prodotto2.pesoTot() + "g");
        System.out.println("mattoncini con lo stesso codice: " + prodotto2.numeroMattonciniStessoCodice(10));
        System.out.println("mattoncini di colore rosso :" + prodotto2.elencoColore(255, 0, 0));
        System.out.println("mattoncini di colore verde : " + prodotto2.elencoColore(0, 255, 0));
        System.out.println("mattoncini di colore blu : " + prodotto2.elencoColore(0, 0, 255));
        System.out.println("mattoncini di colore bianco : " + prodotto1.elencoColore(255, 255, 255));
        System.out.println("mattoncini di colore nero : " + prodotto1.elencoColore(0, 0, 0));
    }
}