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
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj nazwe samolotu: ");
        nazwa = scan.next();
        SredniSamolot samolot = new SredniSamolot(nazwa);
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
