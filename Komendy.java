import java.util.Scanner;
public class Komendy {
    //public aaby szybciej

    public BazaDanych baza = new BazaDanych();

    public void dodajLotnisko(){
        Scanner scan = new Scanner(System.in);
        String nazwaTemp = "Madryt";
        int xTemp = 0;
        int yTemp = 15;

        System.out.println("Podaj nazwe lotniska\n");
        nazwaTemp = scan.nextLine();

        System.out.println("Podaj X\n");
        xTemp = scan.nextInt();

        System.out.println("Podaj Y\n");
        yTemp = scan.nextInt();

        //jakiś tam kod

        Lotnisko lotnisko = new Lotnisko(nazwaTemp, xTemp, yTemp);
        baza.Lotniska.add(lotnisko);
    
    }

}
