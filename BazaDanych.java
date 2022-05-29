import java.util.ArrayList;
import java.util.List;

public class BazaDanych {
    //public aby szybko testować
    public List<Lotnisko> Lotniska = new ArrayList<Lotnisko>();

    public void getLotniska(){
        int iter = 1;
        System.out.println("Lista lotnisk: ");
        for(Lotnisko i : Lotniska){
            System.out.println(iter + ".  " + i.getNazwa() + " | " + i.getX() + " | " + i.getY());
            iter++;
        }
    }
}
