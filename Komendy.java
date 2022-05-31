import java.util.Scanner;
public class Komendy {
    //public aaby szybciej

    public BazaDanych baza = new BazaDanych();
    public void dodajLotnisko(){
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
        baza.Lotniska.add(lotnisko);
    }

    public void usunLotnisko(){
        Scanner scan = new Scanner(System.in);
        int iter = 0;
        System.out.println("Podaj nazwe lotniska do usuniecia: ");
        String nazwaDoUsuniecia = scan.nextLine();

        for(Lotnisko i : baza.Lotniska){
            if(i.getNazwa().equals(nazwaDoUsuniecia)){
                System.out.println("Usunieto lotnisko: " + i.getNazwa());
                break;
            }
            iter++;
        }
        baza.Lotniska.remove(iter);
    }

    public void dodajSamolot(){
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
        baza.Maszyny.add(samolot);
    }
  
    public void usunSamolot(){
        Scanner scan = new Scanner(System.in);
        int iter = 0,pom = 0;
        String temp="";
        System.out.print("Podaj nazwe samolotu do usuniecia: ");
        String nazwaDoUsuniecia = scan.nextLine();

        for(Maszyna i : baza.Maszyny){
            if(i.getNazwa().equals(nazwaDoUsuniecia)){
                pom = 1;
                temp=i.getNazwa();
                break;
            }
            iter++;
        }
        if(pom==1){
            System.out.println("Usunieto samolot "+temp);
            baza.Maszyny.remove(iter);
        }
        else {
            System.out.println("Brak samolotu w bazie");
        }
    }
}
