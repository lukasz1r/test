import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * <h3>Klasa pośrednik definiuje pośredników wykupujących więcej niż jeden bilet.</h3>
 * <p>Paramtery to:</p>
 * <ul>
 *      <li>nazwa - nazwa pośrednika</li>
 *      <li>wykupioneLoty - lista wykupionych przez pośrednika lotów </li>
 * </ul>
 */

public class Posrednik {

    private String nazwa;
    List<Rezerwacja> wykupioneLoty = new ArrayList<Rezerwacja>();

    //Konstruktor pośrednika
    Posrednik(String nazwa){
        this.nazwa = nazwa;
    }

    //Metoda rezerwacji biletów przez pośrednika
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
                            if(t.getPoczatek().getNazwa().equals(poczatek)&&t.getKoniec().getNazwa().equals(koniec)&&t.getIloscMiejsc()>=bilety){
                                Rezerwacja lot = new Rezerwacja(t);
                                System.out.println("Kupiono bilet/y do: "+t.getKoniec().getNazwa()+" x"+bilety+"!");
                                BazaDanych.Rezerwacje.add(lot);
                                wykupioneLoty.add(lot);
                                for(int h = 0; h<bilety;h++) t.zakup();
                                pom=1;
                            }
                        }
                    }
                }
            }
        }
        if(pom==0) throw new Exception("Rezerwacja zakonczona niepowodzeniem!");
    }

    //Metoda getNazwa zwracająca nazwę pośrednika
    public String getNazwa() {
        return nazwa;
    }
}



    