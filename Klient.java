import java.util.ArrayList;
import java.util.List;

public class Klient {
    
    private String imie, nazwisko, PESEL;

    List<Rezerwacja> wykupioneLoty = new ArrayList<Rezerwacja>();

    Klient(String imie, String nazwisko, String PESEL){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }

    public void rezerwujLot(){

    }
}
