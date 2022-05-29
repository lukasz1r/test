public class WielkiSamolot extends Maszyna{
    protected int iloscMiejsc = 400;
    protected int zasieg = 5000;
    protected String nazwa;

    WielkiSamolot(String nazwa, int iloscMiejsc){
        super(nazwa, iloscMiejsc);
        this.nazwa = nazwa;
        iloscMiejsc = 400;
        zasieg = 5000;
    }
}
