public class Rezerwacja{

    private double cena; 
    private Trasa trasa;
    private Czas czas;

    Rezerwacja(Trasa trasa){
        this.trasa = trasa;
        this.cena = trasa.getCena();
        this.czas = trasa.getCzas();   
    }

    public Trasa getTrasa(){
        for(Trasa i : BazaDanych.Trasy){
            if(i.equals(trasa)) return i;
        }
        return null;
    }
    public String toString() {
        return trasa + " | " + cena + " | " + czas;
    }
}