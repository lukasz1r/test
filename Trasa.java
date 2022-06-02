public class Trasa {
    
    private Lotnisko poczatek, koniec;
    private Maszyna przypisanaMaszyna;
    private int iloscMiejsc,czestotliwosc;
    private double odleglosc,cena;
    private Czas czasOdlotu;

    Trasa(Lotnisko poczatek, Lotnisko koniec, int czestotliwosc, Czas czasOdlotu, int iloscMiejsc){
        this.poczatek = poczatek;
        this.koniec = koniec;
        this.czestotliwosc = czestotliwosc;
        this.czasOdlotu = czasOdlotu;
        this.iloscMiejsc=iloscMiejsc;
        odleglosc=Math.sqrt(Math.pow(poczatek.getX()-koniec.getX(),2)+Math.pow(poczatek.getY()-koniec.getY(),2));
        cena = odleglosc*2.45;
    }

    public void zakup(){
        iloscMiejsc--;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public double getCena(){
        return cena;
    }
    public double getOdleglosc(){
        return odleglosc;
    }

    public Czas getCzas(){
        return czasOdlotu;
    }

    public Lotnisko getPoczatek(){
        return poczatek;
    }
    
    public Lotnisko getKoniec(){
        return koniec;
    }


}
