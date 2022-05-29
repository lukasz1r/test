public class MalySamolot extends Maszyna{
    
    protected int iloscMiejsc;
    protected int zasieg;
    protected String nazwa;

    MalySamolot(String nazwa){
        super(nazwa);
        this.nazwa = nazwa;
        iloscMiejsc = 50;
        zasieg = 2000;
    }


}