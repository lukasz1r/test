
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
            System.out.println("Wystapil blad!\nNie dodano lotniska!");
        }
    }

    public static void usunLotnisko(){
        try {
            Scanner scan = new Scanner(System.in);
            int pom = 0, iter = 0;
            System.out.println("Podaj nazwe lotniska do usuniecia: ");
            String nazwaDoUsuniecia = scan.next();

            for(Lotnisko i : BazaDanych.Lotniska){
                if(i.getNazwa().equals(nazwaDoUsuniecia)){
                    BazaDanych.Lotniska.remove(iter);
                    System.out.println("Usunieto lotnisko: " + i.getNazwa());
                    pom=1;
                    break;
                }
                iter++;
            }
            if(pom!=1) System.out.println("Wystapil blad!\nNie usunieto lotniska!");
        } catch (Exception e) {
            System.out.println("Wystapil blad!\nNie usunieto lotniska!");
        }
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
                    System.out.println("Dodano samolot!");
                        break;
                    case 2:
                    BazaDanych.Maszyny.add(new SredniSamolot(nazwa));
                    System.out.println("Dodano samolot!");
                        break;
                    case 3:
                    BazaDanych.Maszyny.add(new DuzySamolot(nazwa));
                    System.out.println("Dodano samolot!");
                        break;
                    case 4:
                    BazaDanych.Maszyny.add(new WielkiSamolot(nazwa));
                    System.out.println("Dodano samolot!");    
                        break;
                    default:
                    System.out.println("Wystapil blad!\nNie dodano samolotu!"); 
                    break;
                }
        }catch (Exception e) {
            System.out.println("Wystapil blad!\nNie dodano samolotu!");
        }
    }

  
    public static void usunSamolot(){
        try {
            Scanner scan = new Scanner(System.in);
            int iter = 0,pom = 0;
            System.out.print("Podaj nazwe samolotu do usuniecia: ");
            String nazwaDoUsuniecia = scan.next();

            for(Maszyna i : BazaDanych.Maszyny){
                if(i.getNazwa().equals(nazwaDoUsuniecia)){
                    BazaDanych.Maszyny.remove(iter);
                    System.out.println("Usunieto samolot!");
                    pom = 1;
                    break;
                }
                iter++;
            }
            if(pom!=1) System.out.println("Wystapil blad!\nNie usunieto samolotu!");
        } catch (Exception e) {
            System.out.println("Wystapil blad!\nNie usunieto samolotu!");
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
                        break;
                        }
                    }
                }
            }
            if(pom!=1) System.out.println("Wystapil blad!\nNie dodano trasy!");
           
    } catch (Exception e) {
        System.out.println("Wystapil blad!\nNie dodano trasy!");
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
            if(pom!=1) System.out.println("Wystapil blad!\nNie usunieto trasy!");
        
        } catch (Exception e) {
            System.out.println("Wystapil blad!\nNie usunieto trasy!");
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
        System.out.println("Wystapil blad!\nNie dodano klienta!");
    }
    }

    public static void usunKlienta(){
        try {
            
            Scanner scan = new Scanner(System.in);
            String imie, nazwisko, PESEL;
            int pom = 0, iter = 0;

            System.out.println("Wprowadz dane klienta do usuniecia: ");
            System.out.print("Podaj imie: ");
            imie = scan.next();
            System.out.print("Podaj nazwisko: ");
            nazwisko = scan.next();
            System.out.print("Podaj PESEL: ");
            PESEL = scan.next();
            for(Klient i : BazaDanych.Klienci){
                if(i.getImie().equals(imie)&&i.getNazwisko().equals(nazwisko)&&i.getPESEL().equals(PESEL)){
                    BazaDanych.Klienci.remove(iter);
                    System.out.println("Usunieto klienta!");
                    pom=1;
                    break;
                }
                iter++;
            }
            if (pom!=1) System.out.println("Wystapil blad!\nNie usunieto klienta!"); 
        } catch (Exception e) {
            System.out.println("Wystapil blad!\nNie usunieto klienta!");
        }
    }

    public static void dodajPosrednika(){
        try {
            Scanner scan = new Scanner(System.in);
            String nazwa;
            System.out.print("Podaj nazwe firmy: ");
            nazwa = scan.next();
            Posrednik posrednik = new Posrednik(nazwa);
            BazaDanych.Posrednicy.add(posrednik);
            System.out.println("Dodano pośrednika!");
        } catch (Exception e) {
            System.out.println("Wystapil blad!\nNie dodano posrednika!");
        }
    }

    public static void usunPosrednika(){
        try {
            Scanner scan = new Scanner(System.in);
            String nazwa;
            int iter = 0, pom = 0;
            System.out.println("Podaj dane firmy do usuniecia:");
            System.out.print("Podaj nazwe: ");
            nazwa = scan.next();
            for(Posrednik i :BazaDanych.Posrednicy){
                if(i.getNazwa().equals(nazwa)){
                    BazaDanych.Posrednicy.remove(iter);
                    pom=1;
                    System.out.println("Usunieto posrednika!");
                    break;
                }
                iter++;
            }    
            if(pom!=1) System.out.println("Wystapil blad!\nNie dodano posrednika!");
        } catch (Exception e) {
            System.out.println("Wystapil blad!\nNie dodano posrednika!");
        }
    }

    public static Pomoc wybierzUzytkownika() throws Exception{
            Scanner scan = new Scanner(System.in);
            int x, iter;
            System.out.println("Wybierz uzytkownika:");
            System.out.println("1. Admin");
            System.out.println("2. Klient");
            System.out.println("3. Posrednik");
            x = scan.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Podaj haslo: ");
                    int haslo = scan.nextInt();
                    if(haslo == 123){
                        System.out.println("Wybrano admina!");
                        return new Pomoc(1,0);
                    }
                    else{
                        System.out.println("Bledne haslo!");
                        return new Pomoc (0,0);
                    } 
                case 2:
                    String imie, nazwisko, PESEL;
                    iter=0;
                    System.out.println("Podaj swoje dane:");
                    System.out.print("Podaj imie: ");
                    imie = scan.next();
                    System.out.println("Podaj nazwisko: ");
                    nazwisko = scan.next();
                    System.out.println("Podaj PESEL: ");
                    PESEL = scan.next();
                    for(Klient i : BazaDanych.Klienci){
                        if(i.getImie().equals(imie)&&i.getNazwisko().equals(nazwisko)&&i.getPESEL().equals(PESEL)){
                            System.out.println("Witaj "+i.getImie());
                            return new Pomoc(2, iter);
                        }
                        iter++;
                    }
                    System.out.println("Brak takiego klienta w bazie danych!");
                    return new Pomoc(0, 0);
                    
                case 3:
                    String nazwa;
                    iter=0;
                    System.out.println("Podaj swoje dane:");
                    System.out.print("Podaj nazwe: ");
                    nazwa = scan.next();
                    for(Posrednik i : BazaDanych.Posrednicy){
                        if(i.getNazwa().equals(nazwa)){
                            System.out.println("Witaj "+ i.getNazwa());
                            return new Pomoc(3, iter);
                        }
                    }
                    System.out.println("Brak takiej firmy w bazie danych!");
                    return new Pomoc(0, 0);
                default:
                    System.out.println("Blad!");
                    return new Pomoc(0, 0);
            }
            
    }

}

