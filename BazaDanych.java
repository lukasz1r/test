import java.util.ArrayList;
import java.util.List;

public class BazaDanych {
    //public aby szybko testować
    public List<Lotnisko> Lotniska = new ArrayList<>();
    public List<Maszyna> Maszyny = new ArrayList<>();
    public List<Trasa> Trasy = new ArrayList<>();
    public List<Rezerwacja> Rezerwacje = new ArrayList<>();

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
