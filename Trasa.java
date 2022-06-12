/**
 * <h3>Klasa Trasa obsługuje dodawanie i kontrolę tras między miastami.</h3> 
 * <p>Paramtery jakie posiada klasa Trasa:</p>
 * <ul>
 *      <li>poczatek - lotnisko startowe</li>
 *      <li>koniec - lotnisko końcowe</li>
 *      <li>iloscMiejsc - ilość obsługiwanych pasażerów przez trasę</li>
 *      <li>czestotliwosc - ilość wykonywanych lotów na danej trasie w ciągu tygodnia</li>
 *      <li>odleglosc - ilość kilometrów między lotniskami</li>
 *      <li>cena - cena biletu uprawniającego do skorzystania z trasy</li>
 *      <li>czasOdlotu - godzina, o której samolot opuszcza lotnisko startowe</li>
 * </ul>
 * 
 */

public class Trasa{
    
    private Lotnisko poczatek, koniec;
    private Maszyna przypisanaMaszyna;
    private int iloscMiejsc,czestotliwosc;
    private double odleglosc,cena;
    private Czas czasOdlotu;

    //!Konstruktor trasy
    Trasa(Lotnisko poczatek, Lotnisko koniec, int czestotliwosc, Czas czasOdlotu, int iloscMiejsc, Maszyna przypisanaMaszyna){
        this.przypisanaMaszyna=przypisanaMaszyna;
        this.poczatek = poczatek;
        this.koniec = koniec;
        this.czestotliwosc = czestotliwosc;
        this.czasOdlotu = czasOdlotu;
        this.iloscMiejsc=iloscMiejsc;
        odleglosc= 70 * Math.sqrt(Math.pow(poczatek.getX()-koniec.getX(),2)+Math.pow(poczatek.getY()-koniec.getY(),2));
        cena = odleglosc*2.45;
    }

    //!Metoda zakup kontroluje ilość dostępnych miejsc na trasie, usuwając kolejne miejsce po dokonaniu zakupu.
    public void zakup(){
        iloscMiejsc--;
    }

    //!Metoda getIloscMiejsc zwraca ilość miejsc
    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    //!Metoda getCena zwraca cenę biletu
    public double getCena(){
        return cena;
    }

    //!Metoda getOdleglosc zwraca odległość między lotniskami
    public double getOdleglosc(){
        return odleglosc;
    }

    //!Metoda getCzas zwraca ilość czas trwania lotu
    public Czas getCzas(){
        return czasOdlotu;
    }

    //!Metoda getPoczatek zwraca lotnisko startowe
    public Lotnisko getPoczatek(){
        return poczatek;
    }
    
    //!Metoda getKoniec zwraca lotnisko końcowe
    public Lotnisko getKoniec(){
        return koniec;
    }

    //!Metoda getMaszyna zwraca przypisaną maszynę
    public Maszyna getMaszyna(){
        return przypisanaMaszyna;
    }

    //!Metoda getIntCzestotliwosc zwraca ilość lotów w ciągu tygodnia w formie liczby
    public int getIntCzestotliwosc(){
        return czestotliwosc;
    }

    //!Metoda getCzestotliwosc zwraca ilość lotów w ciągu tygodnia w formie tekstu
    public String getCzestotliwosc(){
        if(czestotliwosc==1) return "Codziennie";
        else if(czestotliwosc==2) return "Raz w tygodniu";
        else if(czestotliwosc==3) return "Co dwa tygodnie";
        return "";
    }

    //!Metoda toString wypisuje lotnisko początkowe i końcowe
    public String toString(){
        return poczatek.getNazwa()+" -> "+koniec.getNazwa();
    }
}
    