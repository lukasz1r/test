public class DuzySamolot extends Maszyna{
    protected int iloscMiejsc = 200;
    protected int zasieg = 4000;
    protected String nazwa;

    DuzySamolot(String nazwa, int iloscMiejsc, int zasieg){
        super(nazwa, iloscMiejsc, zasieg);
        this.nazwa = nazwa;
        this.iloscMiejsc = iloscMiejsc;
        this.zasieg = zasieg;
    }
}
