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

    public void rezerwujLot() throws Exception{
        String x1,x2;
        int pom=0;
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
                            if(i.getPoczatek().getNazwa().equals(x1)&&i.getKoniec().getNazwa().equals(x2)){
                                Rezerwacja lot = new Rezerwacja(i);
                                System.out.println("Zarezerwowano lot do: "+i.getKoniec().getNazwa()+"!");
                                BazaDanych.Rezerwacje.add(lot);
                                wykupioneLoty.add(lot);
                                i.zakup();
                                pom=1;
                            }
                        }
                    }
                }
            }
        }
        if(pom==0) throw new Exception("Wybrano nieprawidłową trasę!");
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getPESEL() {
        return PESEL;
    }
}
    