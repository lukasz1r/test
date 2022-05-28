public class Trasa {
    
    private Lotnisko poczatek;
    private Lotnisko koniec;
    private String przypisanaMaszyna;
    private int iloscMiejsc;
    private int czestotliwosc;
    private float cena;
    private Czas czasOdlotu;

    Trasa(Lotnisko a, Lotnisko b, int czestotliwosc, Czas czas){
        poczatek = a;
        koniec = b;
        this.czestotliwosc = czestotliwosc;
        czasOdlotu = czas;
    }

    public void zakup(){

    }

    public int getIloscMiejsc(){
        return iloscMiejsc;
    }

    public float getCena(){
        return cena;
    }

    public Czas getCzas(){
        return czasOdlotu;
    }


}
