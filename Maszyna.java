public class Maszyna {
    
    protected int iloscMiejsc;
    protected String nazwa;
    protected int zasieg;

    public int getMiejsca(){
        return iloscMiejsc;
    }

    public int getZasieg(){
        return zasieg;
    }

    public String getNazwa(){
        return nazwa;
    }

    Maszyna(String nazwa, int iloscMiejsc){
        this.nazwa = nazwa;
        this.iloscMiejsc = iloscMiejsc;

        MalySamolot samolot = new MalySamolot(nazwa, iloscMiejsc);
       
    }

}
