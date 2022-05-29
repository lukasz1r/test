public class MalySamolot extends Maszyna{
    
    protected int iloscMiejsc = 50;
    protected int zasieg = 2000;
    protected String nazwa;

    MalySamolot(String nazwa, int iloscMiejsc, int zasieg){
        super(nazwa, iloscMiejsc, zasieg);
        this.nazwa = nazwa;
        this.iloscMiejsc = iloscMiejsc;
        this.zasieg = zasieg;
    }


}