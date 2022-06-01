import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Posrednik {

    private String nazwa;
    List<Rezerwacja> wykupioneLoty = new ArrayList<Rezerwacja>();

    Posrednik(String nazwa){
        this.nazwa = nazwa;
    }

    public void rezerwujBilety(){
        String x1,x2;
        int j;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe biletow do kupienia: ");
        j=scan.nextInt();
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
                                for(int h = 0; h<j;h++) i.zakup();
                            }
                        }
                    }
                }
            }
        }
    }
}



