import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Klient {
    
    private String imie, nazwisko, PESEL;

    List<Rezerwacja> wykupioneLoty = new ArrayList<Rezerwacja>();

    Klient(String imie, String nazwisko, String PESEL){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }

    public void rezerwujLot(){
        String x1,x2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Wybierz lotnisko poczatkowe: ");
        x1 = scan.next();
        for(Lotnisko z : BazaDanych.Lotniska){
            if(z.getNazwa().equals(x1)){
                System.out.print("Wybierz lotnisko koncowe: ");
                x2 = scan.next();
                for(Lotnisko y : BazaDanych.Lotniska){
                    if(y.getNazwa().equals(x2)){
                        for(Trasa i : BazaDanych.Trasy){
                            if(z.getNazwa().equals(i.getPoczatek().getNazwa())&&y.getNazwa().equals(i.getKoniec().getNazwa())){
                                Rezerwacja lot = new Rezerwacja(i);
                                BazaDanych.Rezerwacje.add(lot);
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
