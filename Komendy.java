import java.util.Scanner;
public abstract class Komendy {

    public static void dodajLotnisko(){
    try {
        Scanner scan = new Scanner(System.in);
        String nazwaTemp;
        int xTemp, yTemp;
        System.out.print("Podaj nazwe lotniska: ");
        nazwaTemp = scan.next();
        System.out.print("Podaj X: ");
        xTemp = scan.nextInt();
        System.out.print("Podaj Y: ");
        yTemp = scan.nextInt();
        Lotnisko lotnisko = new Lotnisko(nazwaTemp, xTemp, yTemp);
        BazaDanych.Lotniska.add(lotnisko);
        System.out.println("Dodano lotnisko!");
    } catch (Exception e) {
        System.out.println("Wystapil blad!\nNie stworzono obiektu!");
    }
    }

    public static void usunLotnisko(){
        Scanner scan = new Scanner(System.in);
        int iter = 0;
        System.out.println("Podaj nazwe lotniska do usuniecia: ");
        String nazwaDoUsuniecia = scan.next();

        for(Lotnisko i : BazaDanych.Lotniska){
            if(i.getNazwa().equals(nazwaDoUsuniecia)){
                System.out.println("Usunieto lotnisko: " + i.getNazwa());
                break;
            }
            iter++;
        }
        BazaDanych.Lotniska.remove(iter);
    }

    public static void dodajSamolot(){
    try {
        String nazwa;
        int x=5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj nazwe samolotu: ");
        nazwa = scan.next();
        System.out.println("Wybierz rozmiar samolotu:");
        System.out.println("1. Maly");
        System.out.println("2. Sredni");
        System.out.println("3. Duzy");
        System.out.println("4. Wielki");
        x=scan.nextInt();
            switch (x) {
                case 1:
                BazaDanych.Maszyny.add(new MalySamolot(nazwa));
                    break;
                case 2:
                BazaDanych.Maszyny.add(new SredniSamolot(nazwa));
                    break;
                case 3:
                BazaDanych.Maszyny.add(new DuzySamolot(nazwa));
                    break;
                case 4:
                BazaDanych.Maszyny.add(new WielkiSamolot(nazwa));
                    break;
                default:
                System.out.println("Wystapil blad!\nNie stworzono obiektu!"); 
                break;
            }
    }catch (Exception e) {
        System.out.println("Wystapil blad!\nNie stworzono obiektu!");
    }
    }

  
    public static void usunSamolot(){
        Scanner scan = new Scanner(System.in);
        int iter = 0,pom = 0;
        String temp="";
        System.out.print("Podaj nazwe samolotu do usuniecia: ");
        String nazwaDoUsuniecia = scan.next();

        for(Maszyna i : BazaDanych.Maszyny){
            if(i.getNazwa().equals(nazwaDoUsuniecia)){
                pom = 1;
                temp=i.getNazwa();
                break;
            }
            iter++;
        }
        if(pom==1){
            System.out.println("Usunieto samolot "+temp);
            BazaDanych.Maszyny.remove(iter);
        }
        else {
            System.out.println("Brak samolotu w bazie");
        }
    }

    public static void dodajTrase() { 
    try {
        String poczatek,koniec;
        int g,m,czestotliwosc=0,iloscMiejsc=0, pom=0;
        Czas czas=null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj czas odlotu: ");
        System.out.print("godzina: ");
        g=scan.nextInt();
        System.out.print("minuta: ");
        m=scan.nextInt();
        czas = new Czas(g, m);
        System.out.print("Podaj ilosc miejsc: ");
        iloscMiejsc = scan.nextInt();
        System.out.println("Wybierz czestotliwosc: \n 1 - codziennie \n 2 - raz w tygodniu \n 3 - co dwa tygodnie");
        czestotliwosc = scan.nextInt();
        System.out.print("Wybierz lotnisko poczatkowe: ");
        poczatek = scan.next();
        for(Lotnisko x1 : BazaDanych.Lotniska){
            if(x1.getNazwa().equals(poczatek)){
                System.out.print("Wybierz lotnisko koncowe: ");
                koniec = scan.next();
                for(Lotnisko x2 : BazaDanych.Lotniska){
                    if(x2.getNazwa().equals(koniec)){
                        Trasa trasa = new Trasa(x1, x2, czestotliwosc, czas, iloscMiejsc);
                        BazaDanych.Trasy.add(trasa);
                        System.out.println("Dodano trase!");
                        pom=1;
                        }
                    }
                }
            }
            if(pom!=1) System.out.println("Wystapil blad!\nNie stworzono obiektu!");
           
    } catch (Exception e) {
        System.out.println("Wystapil blad!\nNie stworzono obiektu!");
    }
    }  
    public static void usunTrase(){
        try {
        Scanner scan = new Scanner(System.in);
        String poczatek, koniec;
        int pom=0,i=0;
        System.out.println("Podaj trase do usuniecia:");
        System.out.print("Wybierz lotnisko poczatkowe: ");
        poczatek=scan.next();
        System.out.print("Wybierz lotnisko koncowe: ");
        koniec=scan.next();        
        for(Trasa t1: BazaDanych.Trasy){
            if(t1.getPoczatek().getNazwa().equals(poczatek)&&t1.getKoniec().getNazwa().equals(koniec)){
                BazaDanych.Trasy.remove(i);
                System.out.println("Usunieto trase!");
                pom=1;
                break;
            }
            i++;
        }        
        if(pom!=1) System.out.println("Wystapil blad!\nNie stworzono obiektu!");
        
    } catch (Exception e) {
        System.out.println("Wystapil blad!\nNie stworzono obiektu!");
    }
    }   

    public static void dodajKlienta() {
        try {
        Scanner scan = new Scanner(System.in);
        String imie,nazwisko,PESEL;
        System.out.print("Podaj imie: ");
        imie = scan.next();
        System.out.println("Podaj nazwisko: ");
        nazwisko = scan.next();
        System.out.println("Podaj PESEL");
        PESEL = scan.next();
        Klient klient = new Klient(imie, nazwisko, PESEL);
        BazaDanych.Klienci.add(klient);
        System.out.println("Dodano klienta!");
    } catch (Exception e) {
        System.out.println("Wystapil blad!\nNie stworzono obiektu!");
    }
    }
}

