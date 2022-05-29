public class WielkiSamolot extends Maszyna{
    protected int iloscMiejsc = 400;
    protected int zasieg = 5000;
    protected String nazwa;

    WielkiSamolot(String nazwa, int iloscMiejsc, int zasieg){
        super(nazwa, iloscMiejsc, zasieg);
        this.nazwa = nazwa;
        this.iloscMiejsc = iloscMiejsc;
        this.zasieg = zasieg;
    }
}
