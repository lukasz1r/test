public class MalySamolot extends Maszyna{
    
    protected int iloscMiejsc;
    protected int zasieg;
    protected String nazwa;

    MalySamolot(String nazwa, int iloscMiejsc){
        super(nazwa, iloscMiejsc);
        this.nazwa = nazwa;
        this.iloscMiejsc = 50;
        zasieg = 2000;
    }


}