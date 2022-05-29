import java.util.Scanner;
public class Komendy {
    //public aaby szybciej

    Scanner scan = new Scanner(System.in);
    public BazaDanych baza = new BazaDanych();

    public void dodajLotnisko(){
        
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

}
