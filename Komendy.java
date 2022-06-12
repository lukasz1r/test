import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <h3>Klasa Komendy zawiera zbiór wszystkich metod wykorzystywanych do obsługi systemu.</h3>
 */
public abstract class Komendy {

    //!Metoda dodajLotnisko tworzy obiekt lotniska
    public static void dodajLotnisko() throws Exception{
            Scanner scan = new Scanner(System.in);
            String nazwa;
            int x, y;
            System.out.print("Podaj nazwe lotniska: ");
            nazwa = scan.next();
            System.out.print("Podaj X: ");
            x = scan.nextInt();
            System.out.print("Podaj Y: ");
            y = scan.nextInt();
            Lotnisko lotnisko = new Lotnisko(nazwa, x, y);
            BazaDanych.Lotniska.add(lotnisko);
            System.out.println("Dodano lotnisko!");
    }

    //!Metoda usunLotnisko usuwa obiekt lotniska
    public static void usunLotnisko()throws Exception{
            Scanner scan = new Scanner(System.in);
            int pom = 0, iter = 0;
            System.out.println("Podaj nazwe lotniska do usuniecia: ");
            String nazwa = scan.next();

            for(Lotnisko i : BazaDanych.Lotniska){
                if(i.getNazwa().equals(nazwa)){
                    BazaDanych.Lotniska.remove(iter);
                    System.out.println("Usunieto lotnisko: " + i.getNazwa());
                    pom=1;
                    break;
                }
                iter++;
            }
            if(pom!=1) throw new Exception("Brak lotniska w bazie danych!"); 
    }

    //!Metoda dodajSamolot dodaje samolot
    public static void dodajSamolot()throws Exception{
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
                    throw new Exception("Nieprawidlowa liczba!"); 
                }
    }

    //!Metoda usunSamolot usuwa samolot
    public static void usunSamolot()throws Exception{
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
            if(pom!=1) throw new Exception("Brak samolotu w bazie danych!"); 
    }

    //!Metoda dodajTrase dodaje trasę
    public static void dodajTrase()throws Exception { 
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
        if(czestotliwosc!=1&&czestotliwosc!=2&&czestotliwosc!=3) throw new Exception("Nieprawidlowa liczba!");
        System.out.print("Wybierz lotnisko poczatkowe: ");
        poczatek = scan.next();
        for(Lotnisko x1 : BazaDanych.Lotniska){
            if(x1.getNazwa().equals(poczatek)){
                System.out.print("Wybierz lotnisko koncowe: ");
                koniec = scan.next();
                for(Lotnisko x2 : BazaDanych.Lotniska){
                    if(x2.getNazwa().equals(koniec)){
                        for(Maszyna i : BazaDanych.Maszyny){
                            if(i.iloscMiejsc>iloscMiejsc){
                                Trasa trasa = new Trasa(x1, x2, czestotliwosc, czas, iloscMiejsc,i);
                                BazaDanych.Trasy.add(trasa);
                                System.out.println("Dodano trase!");
                                pom=1;
                                break;
                                }
                            }
                        }
                    }
                }
            }
            if(pom!=1) throw new Exception("Nieodpowiednie dane!"); 
    }  

    //!Metoda usunTrase usuwa trasę
    public static void usunTrase()throws Exception{
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
            if(pom!=1) throw new Exception("Brak trasy w bazie danych!"); 
    }   

    //!Metoda dodajKlienta dodaje klienta
    public static void dodajKlienta(){
        Scanner scan = new Scanner(System.in);
        String imie,nazwisko,PESEL;
        System.out.print("Podaj imie: ");
        imie = scan.next();
        System.out.print("Podaj nazwisko: ");
        nazwisko = scan.next();
        System.out.print("Podaj PESEL: ");
        PESEL = scan.next();
        Klient klient = new Klient(imie, nazwisko, PESEL);
        BazaDanych.Klienci.add(klient);
        System.out.println("Dodano klienta!");
    }

    //!Metoda usunKlienta usuwa klienta
    public static void usunKlienta()throws Exception{
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
            if (pom!=1) throw new Exception("Brak klienta w bazie danych");; 
    }

    //!Metoda dodajPosrednika dodaje pośrednika
    public static void dodajPosrednika(){
            Scanner scan = new Scanner(System.in);
            String nazwa;
            System.out.print("Podaj nazwe firmy: ");
            nazwa = scan.next();
            Posrednik posrednik = new Posrednik(nazwa);
            BazaDanych.Posrednicy.add(posrednik);
            System.out.println("Dodano pośrednika!");
    }

    //!Metoda usunPosrednika usuwa pośrednika
    public static void usunPosrednika()throws Exception{
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
            if(pom!=1) throw new Exception("Brak firmy w bazie danych!"); 
    }

    //!Metoda wybierzUzytkownika umożliwia zalogowanie się do systemu
    public static Pomoc wybierzUzytkownika() throws Exception{
            Scanner scan = new Scanner(System.in);
            int x, iter;
            System.out.println("Wybierz uzytkownika:");
            System.out.println("1. Admin");
            System.out.println("2. Klient");
            System.out.println("3. Posrednik");
            System.out.println("\n0. Zakoncz program!");
            x = scan.nextInt();
            switch (x) {
                case 1:
                    System.out.print("Podaj haslo: ");
                    int haslo = scan.nextInt();
                    if(haslo == 123){
                        System.out.println("\nWybrano admina!");
                        return new Pomoc(1,0);
                    }
                    else{
                        throw new Exception("\nBledne haslo!");
                    } 
                case 2:
                    String imie, nazwisko, PESEL;
                    iter=0;
                    System.out.println("Podaj swoje dane:");
                    System.out.print("Podaj imie: ");
                    imie = scan.next();
                    System.out.print("Podaj nazwisko: ");
                    nazwisko = scan.next();
                    System.out.print("Podaj PESEL: ");
                    PESEL = scan.next();
                    for(Klient i : BazaDanych.Klienci){
                        if(i.getImie().equals(imie)&&i.getNazwisko().equals(nazwisko)&&i.getPESEL().equals(PESEL)){
                            System.out.println("\nWitaj "+i.getImie());
                            return new Pomoc(2, iter);
                        }
                        iter++;
                    }
                    throw new Exception("\nBrak takiego klienta w bazie danych!");
                    
                case 3:
                    String nazwa;
                    iter=0;
                    System.out.println("Podaj swoje dane:");
                    System.out.print("Podaj nazwe: ");
                    nazwa = scan.next();
                    for(Posrednik i : BazaDanych.Posrednicy){
                        if(i.getNazwa().equals(nazwa)){
                            System.out.println("\nWitaj "+ i.getNazwa());
                            return new Pomoc(3, iter);
                        }
                    }
                    throw new Exception("\nBrak takiej firmy w bazie danych!");
                case 0:
                    return new Pomoc(4, 0);
                default:
                    throw new Exception("\nNieprawidlowa liczba!");
            }
        }

    //!Metoda zapis zapisuje dane do pliku 
    public static void zapis() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj nazwe pliku do zapisu: ");
        String nazwa = scan.next();
        PrintWriter zapis = new PrintWriter(nazwa+".txt");
        for(Maszyna i : BazaDanych.Maszyny){
            zapis.print(i.nazwa+" ");
            zapis.print(i.getClass()+"\n");
        }
        zapis.println("-");
        for(Lotnisko i : BazaDanych.Lotniska){
            zapis.print(i.getNazwa()+" ");
            zapis.print(i.getX()+" ");
            zapis.print(i.getY()+"\n");
        }
        zapis.println("-");
        for(Trasa i : BazaDanych.Trasy){
            zapis.print(i.getPoczatek().getNazwa()+" ");
            zapis.print(i.getKoniec().getNazwa()+" ");
            zapis.print(i.getIntCzestotliwosc()+" ");
            zapis.print(i.getCzas().getGodzina()+" ");
            zapis.print(i.getCzas().getMinuta()+" ");
            zapis.print(i.getIloscMiejsc()+" ");
            zapis.print(i.getMaszyna().getNazwa()+"\n");
        }
        zapis.println("-");
        for(Klient i : BazaDanych.Klienci){
            zapis.print(i.getImie()+" ");
            zapis.print(i.getNazwisko()+" ");
            zapis.print(i.getPESEL()+"\n");
        }
        zapis.println("-");
        for(Posrednik i : BazaDanych.Posrednicy){
            zapis.print(i.getNazwa()+"\n");
        }
        zapis.println("-");
        zapis.close();
    }

    //!Metoda wczytywanie wczytuje dane z pliku
    public static void wczytywanie() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj nazwe pliku do odczytu: ");
        String nazwaPliku = scan.next();
        Scanner plik = new Scanner(new File(nazwaPliku+".txt"));
        while(true){
            String nazwa = plik.next();
            if(nazwa.equals("-")) break;
            plik.next();
            String rozmiar = plik.next();
            if(rozmiar.equals("MalySamolot")){
                MalySamolot samolot = new MalySamolot(nazwa);
                BazaDanych.Maszyny.add(samolot);
            }
            else if(rozmiar.equals("SredniSamolot")){
                SredniSamolot samolot = new SredniSamolot(nazwa);
                BazaDanych.Maszyny.add(samolot);
            }
            else if(rozmiar.equals("DuzySamolot")){
                DuzySamolot samolot = new DuzySamolot(nazwa);
                BazaDanych.Maszyny.add(samolot);
            }
            else if(rozmiar.equals("WielkiSamolot")){
                WielkiSamolot samolot = new WielkiSamolot(nazwa);
                BazaDanych.Maszyny.add(samolot);
            }
        }
        while (true) {
            String nazwa = plik.next();
            if(nazwa.equals("-")) break;
            int x = plik.nextInt();
            int y = plik.nextInt();
            Lotnisko lotnisko = new Lotnisko(nazwa, x, y);
            BazaDanych.Lotniska.add(lotnisko);
        }
        while (true) {
            String poczatek = plik.next();
            if(poczatek.equals("-")) break;
            String koniec = plik.next();
            int czestotliwosc = plik.nextInt();
            int godzina = plik.nextInt();
            int minuta = plik.nextInt();
            int iloscMiejsc = plik.nextInt();
            String maszyna = plik.next();
            
            Lotnisko lPoczatek=null ,lKoniec=null;
            for(Lotnisko i : BazaDanych.Lotniska){
                if(i.getNazwa().equals(poczatek)) lPoczatek=i;
                else if(i.getNazwa().equals(koniec)) lKoniec=i;
            }

            Maszyna przypisanaMaszyna = null;
            for(Maszyna i : BazaDanych.Maszyny){
                if(i.getNazwa().equals(maszyna)) przypisanaMaszyna = i;
            }

            Trasa trasa = new Trasa(lPoczatek, lKoniec, czestotliwosc, new Czas(godzina, minuta), iloscMiejsc, przypisanaMaszyna);
            BazaDanych.Trasy.add(trasa);
        }   
        while (true) { 
            String imie = plik.next();
            if(imie.equals("-")) break;
            String nazwisko = plik.next();
            String PESEL = plik.next();

            Klient klient = new Klient(imie, nazwisko, PESEL);
            BazaDanych.Klienci.add(klient);
        }
        while(true){
            String nazwa = plik.next();
            if(nazwa.equals("-")) break;

            Posrednik posrednik = new Posrednik(nazwa);
            BazaDanych.Posrednicy.add(posrednik);
        }
    }
}



    