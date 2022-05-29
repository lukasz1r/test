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

    Maszyna(String nazwa){
        this.nazwa = nazwa;
    }

}
