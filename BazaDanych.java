import java.util.ArrayList;
import java.util.List;

public abstract class BazaDanych {
    public static List<Lotnisko> Lotniska = new ArrayList<>();
    public static List<Maszyna> Maszyny = new ArrayList<>();
    public static List<Trasa> Trasy = new ArrayList<>();
    public static List<Rezerwacja> Rezerwacje = new ArrayList<>();
    public static List<Klient> Klienci = new ArrayList<>();
    public static List<Posrednik> Posrednicy = new ArrayList<>();

    public static void getLotniska(){
        int iter = 1;
        System.out.println("Lista lotnisk: ");
        for(Lotnisko i : Lotniska){
            System.out.println(iter + ".  " + i.getNazwa() + " | " + i.getX() + "x | " + i.getY()+"y");
            iter++;
        }
    }

    public static void getSamoloty(){
        int iter = 1;
        System.out.println("Lista samolotow: ");
        for(Maszyna i : Maszyny){
            System.out.println(iter + ".  " + i.getNazwa() + " | " + i.getMiejsca() + " miejsc | " + i.getZasieg()+"km zasiegu");
            iter++;
        }
    }

    public static void getTrasy(){
        int iter=1;
        System.out.println("Lista tras: ");
        for(Trasa i : Trasy){
            System.out.println(iter+".  "+ i.getPoczatek().getNazwa()+" -> "+i.getKoniec().getNazwa()+"\n"+i.getCzas()+" | "
            +Math.round(i.getOdleglosc()*100.0)/100.0 +"km"+" | cena: "+Math.round(i.getCena()*100.0)/100.0+"\nmiejsc: "+i.getIloscMiejsc()+" | "+ i.getCzestotliwosc()+"\n"+i.getMaszyna().nazwa);
            iter++;
        }   
    }

    public static void getRezerwacje() {
        int iter=1;
        System.out.println("Lista rezerwacji: ");
        for (Rezerwacja i : Rezerwacje){
            System.out.println(iter+".  "+i);
            iter++;
        }
    }

    public static void getKlienci() {
        int iter=1;
        System.out.println("Lista klientow: ");
        for (Klient i : Klienci){
            System.out.println(iter+".  "+i.getImie()+" "+ i.getNazwisko()+" PESEL: "+i.getPESEL());
            iter++;
        }
    }

    public static void getPosrednicy() {
        int iter=1;
        System.out.println("Lista posrednikow: ");
        for(Posrednik i : Posrednicy){
            System.out.println(iter+".  "+i.getNazwa());
            iter++;
        }
    }
}
