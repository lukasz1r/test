public class SredniSamolot extends Maszyna{
    protected int iloscMiejsc = 100;
    protected int zasieg = 3000;
    protected String nazwa;

    SredniSamolot(String nazwa, int iloscMiejsc){
        super(nazwa, iloscMiejsc);
        this.nazwa = nazwa;
        iloscMiejsc = 100;
        zasieg = 3000;
    }
}
