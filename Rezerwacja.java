public class Rezerwacja{

    BazaDanych baza = new BazaDanych();
    private double cena; 
    private Trasa trasa;
    private Czas czas;

    Rezerwacja(Trasa trasa){
        this.trasa = trasa;
        this.cena = trasa.getCena();
        this.czas = trasa.getCzas();   
    }

    
    public String toString() {
        return trasa + " | " + cena + " | " + czas;
    }
}