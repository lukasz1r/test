public class Trasa {
    
    BazaDanych baza = new BazaDanych();
    private Lotnisko poczatek, koniec;
    private String przypisanaMaszyna;
    public int iloscMiejsc,czestotliwosc; //temp
    private double odleglosc,cena;
    private Czas czasOdlotu;

    Trasa(Lotnisko a, Lotnisko b, int czestotliwosc, Czas czas){
        poczatek = a;
        koniec = b;
        this.czestotliwosc = czestotliwosc;
        czasOdlotu = czas;
        odleglosc=Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
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
