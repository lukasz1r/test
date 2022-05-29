public class SredniSamolot extends Maszyna{
    protected int iloscMiejsc = 100;
    protected int zasieg = 3000;
    protected String nazwa;

    SredniSamolot(String nazwa, int iloscMiejsc, int zasieg){
        super(nazwa, iloscMiejsc, zasieg);
        this.nazwa = nazwa;
        this.iloscMiejsc = iloscMiejsc;
        this.zasieg = zasieg;
    }
}
