public class Maszyna {
    
    protected int iloscMiejsc;
    protected String nazwa;
    protected int zasieg;

    Maszyna(String nazwa, int iloscMiejsc){
        this.nazwa = nazwa;
        this.iloscMiejsc = iloscMiejsc;         
    }

    public void dodajSamolot(){

        //uwaga łopatologiczne
        if(this.iloscMiejsc <= 50){
            MalySamolot samolot = new MalySamolot(this.nazwa, this.iloscMiejsc);
            this.zasieg = 2000;
        }
        if(this.iloscMiejsc >50 && this.iloscMiejsc <=100){
            SredniSamolot samolot = new SredniSamolot(this.nazwa, this.iloscMiejsc);
            this.zasieg = 3000;
        }
        if(this.iloscMiejsc >100 && this.iloscMiejsc <=200){
            DuzySamolot samolot = new DuzySamolot(this.nazwa, this.iloscMiejsc);
            this.zasieg = 4000;
        }
        if(this.iloscMiejsc >200 && this.iloscMiejsc <=400){
            WielkiSamolot samolot = new WielkiSamolot(this.nazwa, this.iloscMiejsc);
            this.zasieg = 5000;
        }
        
    }

    public int getMiejsca(){
        return iloscMiejsc;
    }

    public int getZasieg(){
        return zasieg;
    }

    public String getNazwa(){
        return nazwa;
    }

}
