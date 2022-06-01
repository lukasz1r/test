import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Klient {
    
    private String imie, nazwisko, PESEL;

    List<Rezerwacja> wykupioneLoty = new ArrayList<Rezerwacja>();
    BazaDanych baza = new BazaDanych();

    Klient(String imie, String nazwisko, String PESEL){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }

    public void rezerwujLot(){
        String x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Wybierz lotnisko początkowe: ");
        x = scan.next();
        for(Lotnisko z : baza.Lotniska){
            if(z.equals(x)){
                System.out.print("Wybierz lotnisko koncowe: ");
                x = scan.next();
                for(Lotnisko y : baza.Lotniska){
                    if(y.equals(x)){
                        for(Trasa i : baza.Trasy){
                            if(z.equals(i.getPoczatek())&&y.equals(i.getKoniec())){
                                Rezerwacja lot = new Rezerwacja(i);
                                wykupioneLoty.add(lot);
                                i.zakup();
                            }
                        }
                    }
                }
            }
        }
    }
}
