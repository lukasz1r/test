import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Posrednik {

    private String nazwa;
    List<Rezerwacja> wykupioneLoty = new ArrayList<Rezerwacja>();

    Posrednik(String nazwa){
        this.nazwa = nazwa;
    }

    public void rezerwujBilety()throws Exception{
        String poczatek,koniec;
        int bilety,pom=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe biletow do kupienia: ");
        bilety=scan.nextInt();
        System.out.print("Wybierz lotnisko poczatkowe: ");
        poczatek = scan.next();
        for(Lotnisko x1 : BazaDanych.Lotniska){
            if(x1.getNazwa().equals(poczatek)){
                System.out.print("Wybierz lotnisko koncowe: ");
                koniec = scan.next();
                for(Lotnisko x2 : BazaDanych.Lotniska){
                    if(x2.getNazwa().equals(koniec)){
                        for(Trasa t : BazaDanych.Trasy){
                            if(t.getPoczatek().getNazwa().equals(poczatek)&&t.getKoniec().getNazwa().equals(koniec)){
                                Rezerwacja lot = new Rezerwacja(t);
                                System.out.println("Kupiono bilet/y do: "+t.getKoniec().getNazwa()+" x"+bilety+"!");
                                BazaDanych.Rezerwacje.add(lot);
                                wykupioneLoty.add(lot);
                                for(int h = 0; h<bilety;h++) t.zakup();
                            }
                        }
                    }
                }
            }
        }
        if(pom==0) throw new Exception("Wybrano nieprawidłową trasę!");
    }
    public String getNazwa() {
        return nazwa;
    }
}



    