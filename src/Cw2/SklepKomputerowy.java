package Cw2;

import java.time.LocalDate;

public class SklepKomputerowy {
    private Produkt[] produkty = new Produkt[10];
    private Klient[] klienci = new Klient[10];
    private Zamowienie[] zamowienia = new Zamowienie[10];
    private int liczbaProduktow;
    private int liczbaKlientow;
    private int liczbaZamowien;

    public void dodajProdukt(Produkt produkt1) {
        //TODO
    }

    public void dodajKlienta(Klient klient1) {
        //TODO
    }

    public Zamowienie utworzZamowienie(
            Klient klient1,
            Produkt[] produktyZamowienia1,
            int[] ilosciZamowienia1) {

        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setId(0);
        zamowienie.setKlient(klient1);
        zamowienie.setProdukty(produktyZamowienia1);
        zamowienie.setIlosci(ilosciZamowienia1);
        zamowienie.setDataZamowienia(LocalDate.now().toString());
        zamowienie.setStatus("Nowe");

        return zamowienie;
    }

    //TODO metody z zadania
}
