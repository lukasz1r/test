import java.util.Scanner;
public abstract class Komendy {

    public static void dodajLotnisko(){
        Scanner scan = new Scanner(System.in);
        String nazwaTemp;
        int xTemp, yTemp;

        System.out.println("Podaj nazwe lotniska\n");
        nazwaTemp = scan.nextLine();

        System.out.println("Podaj X\n");
        xTemp = scan.nextInt();

        System.out.println("Podaj Y\n");
        yTemp = scan.nextInt();

        Lotnisko lotnisko = new Lotnisko(nazwaTemp, xTemp, yTemp);
        BazaDanych.Lotniska.add(lotnisko);
    }

    public static void usunLotnisko(){
        Scanner scan = new Scanner(System.in);
        int iter = 0;
        System.out.println("Podaj nazwe lotniska do usuniecia: ");
        String nazwaDoUsuniecia = scan.nextLine();

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
        String nazwa;
        int x=5;
        Maszyna samolot = null;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj nazwe samolotu: ");
        nazwa = scan.next();
        while(x==5){
        System.out.println("Wybierz rozmiar samolotu:");
        System.out.println("1. Maly");
        System.out.println("2. Sredni");
        System.out.println("3. Duzy");
        System.out.println("4. Wielki");
        x=scan.nextInt();
        switch (x) {
            case 1:
            samolot = new MalySamolot(nazwa);
                break;
            case 2:
            samolot = new SredniSamolot(nazwa);
                break;
            case 3:
            samolot = new DuzySamolot(nazwa);
                break;
            case 4:
            samolot = new WielkiSamolot(nazwa);
                break;
            default: x=5;
        }
    }
        BazaDanych.Maszyny.add(samolot);
    }
  
    public static void usunSamolot(){
        Scanner scan = new Scanner(System.in);
        int iter = 0,pom = 0;
        String temp="";
        System.out.print("Podaj nazwe samolotu do usuniecia: ");
        String nazwaDoUsuniecia = scan.nextLine();

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
        String poczatek,koniec;
        int g,m,czestotliwosc,iloscMiejsc;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj czas odlotu: ");
        System.out.print("godzina: ");
        g=scan.nextInt();
        System.out.print("minuta: ");
        m=scan.nextInt();
        Czas czas = new Czas(g, m);
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
                        }
                    }
                }
            }
        }
    }

