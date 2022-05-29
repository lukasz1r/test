public class DuzySamolot extends Maszyna{
    protected int iloscMiejsc = 200;
    protected int zasieg = 4000;
    protected String nazwa;

    DuzySamolot(String nazwa){
        super(nazwa);
        this.nazwa = nazwa;
        iloscMiejsc = 200;
        zasieg = 4000;
    }
}
