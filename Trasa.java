public class Trasa {
    
    private Lotnisko poczatek, koniec;
    private String przypisanaMaszyna;
    private int iloscMiejsc,czestotliwosc;
    private float cena;
    private double odleglosc;
    private Czas czasOdlotu;

    Trasa(Lotnisko a, Lotnisko b, int czestotliwosc, Czas czas){
        poczatek = a;
        koniec = b;
        this.czestotliwosc = czestotliwosc;
        czasOdlotu = czas;
        odleglosc=Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
    }

    public void zakup(){
        iloscMiejsc--;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public float getCena(){
        return cena;
    }
    public double getOdleglosc(){
        return odleglosc;
    }

    public Czas getCzas(){
        return czasOdlotu;
    }


}
