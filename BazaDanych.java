import java.util.ArrayList;
import java.util.List;

public abstract class BazaDanych {
    public static List<Lotnisko> Lotniska = new ArrayList<>();
    public static List<Maszyna> Maszyny = new ArrayList<>();
    public static List<Trasa> Trasy = new ArrayList<>();
    public static List<Rezerwacja> Rezerwacje = new ArrayList<>();
    public static List<Klient> Klienci = new ArrayList<>();
    public static List<Posrednik> Posrednicy = new ArrayList<>();

    public void getLotniska(){
        int iter = 1;
        System.out.println("Lista lotnisk: ");
        for(Lotnisko i : Lotniska){
            System.out.println(iter + ".  " + i.getNazwa() + " | " + i.getX() + " | " + i.getY());
            iter++;
        }
    }

    public void getSamoloty(){
        int iter = 1;
        System.out.println("Lista samolotow: ");
        for(Maszyna i : Maszyny){
            System.out.println(iter + ".  " + i.getNazwa() + " | " + i.getMiejsca() + " | " + i.getZasieg());
            iter++;
        }
    }
}
