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

        //uwaga bo łopatologiczne że chuj XD

        if(iloscMiejsc<=50){
            MalySamolot samolot = new MalySamolot(nazwa, 50);
        }
        if(iloscMiejsc>50 && iloscMiejsc<=100){
            SredniSamolot samolot = new SredniSamolot(nazwa, 100);
        }
        if(iloscMiejsc>100 && iloscMiejsc<=200){
            DuzySamolot samolot = new DuzySamolot(nazwa, 200);
        }
        if(iloscMiejsc>200 && iloscMiejsc<=400){
            WielkiSamolot samolot = new WielkiSamolot(nazwa, 400);
        }
    }

}
