public class Trasa{
    
    private Lotnisko poczatek, koniec;
    private Maszyna przypisanaMaszyna;
    private int iloscMiejsc,czestotliwosc;
    private double odleglosc,cena;
    private Czas czasOdlotu;

    Trasa(Lotnisko poczatek, Lotnisko koniec, int czestotliwosc, Czas czasOdlotu, int iloscMiejsc, Maszyna przypisanaMaszyna){
        this.przypisanaMaszyna=przypisanaMaszyna;
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

    public Maszyna getMaszyna(){
        return przypisanaMaszyna;
    }

    public int getIntCzestotliwosc(){
        return czestotliwosc;
    }

    public String getCzestotliwosc(){
        if(czestotliwosc==1) return "Codziennie";
        else if(czestotliwosc==2) return "Raz w tygodniu";
        else if(czestotliwosc==3) return "Co dwa tygodnie";
        return "";
    }

}
