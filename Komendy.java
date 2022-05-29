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
        scan.close();
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
        scan.close();
    }

    public void dodajSamolot(){
        
        int iloscMiejsc = 0;
        String nazwa = " ";
        Scanner scan = new Scanner(System.in);
        
            System.out.println("Podaj nazwe samolotu: ");   //  KUUUUUURWAAAAAAAAA CZEMU TO SIĘ TAK JEBIE I POMIJA TEN SCANER WSZYSTKO ZROBIŁEM ABY TO NAPRAWIDC I CHUJ
            nazwa = scan.nextLine();
        
        
            System.out.println("Podaj ilosc wymaganych miejsc: ");
            iloscMiejsc = scan.nextInt();
        
        
        Maszyna samolot = new Maszyna(nazwa, iloscMiejsc);
        samolot.dodajSamolot();
        
        baza.Maszyny.add(samolot);
        scan.close();
    }
  
    public void usunSamolot(){
        Scanner scan = new Scanner(System.in);
        int iter = 0;
        System.out.println("Podaj nazwe samolotu do usuniecia: ");
        String nazwaDoUsuniecia = scan.nextLine();

        for(Maszyna i : baza.Maszyny){
            if(i.getNazwa().equals(nazwaDoUsuniecia)){
                System.out.println("Usunieto maszyne: " + i.getNazwa());
                break;
            }
            iter++;
        }
        baza.Maszyny.remove(iter); 
        scan.close();
    }
    
}
