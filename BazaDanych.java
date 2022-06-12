import java.util.ArrayList;
import java.util.List;

/**
 * <h3>Klasa BazaDanych</h3>
 * <p>Przechowuje wszelkie obiekty zawarte w programie w formie ArrayList.</p>
 * <ul>
 *      <li><b>Lotniska</b> - baza lotnisk</li>
 *      <li><b>Maszyny</b> - baza maszyn</li>
 *      <li><b>Trasy</b> - baza tras</li>
 *      <li><b>Rezerwacje</b> - baza rezerwacji</li>
 *      <li><b>Klienci</b> - baza klientów</li>
 *      <li><b>Pośrednicy</b> - baza pośredników</li>
 * </ul> 
 */

public abstract class BazaDanych {
    public static List<Lotnisko> Lotniska = new ArrayList<>();
    public static List<Maszyna> Maszyny = new ArrayList<>();
    public static List<Trasa> Trasy = new ArrayList<>();
    public static List<Rezerwacja> Rezerwacje = new ArrayList<>();
    public static List<Klient> Klienci = new ArrayList<>();
    public static List<Posrednik> Posrednicy = new ArrayList<>();

    //*Metoda getLotniska wypisuje lotniska z bazy danych
    public static void getLotniska(){
        int iter = 1;
        System.out.println("Lista lotnisk: ");
        for(Lotnisko i : Lotniska){
            System.out.println(iter + ".  " + i.getNazwa() + " | " + i.getX() + "x | " + i.getY()+"y");
            iter++;
        }
    }

    //*Metoda getSamoloty wypisuje Samoloty z bazy danych
    public static void getSamoloty(){
        int iter = 1;
        System.out.println("Lista samolotow: ");
        for(Maszyna i : Maszyny){
            System.out.println(iter + ".  " + i.getNazwa() + " | " + i.getMiejsca() + " miejsc | " + i.getZasieg()+"km zasiegu");
            iter++;
        }
    }

    //*Metoda getTrasy wypisuje Trasy z bazy danych
    public static void getTrasy(){
        int iter=1;
        System.out.println("Lista tras: ");
        for(Trasa i : Trasy){
            System.out.println(iter+".  "+ i.getPoczatek().getNazwa()+" -> "+i.getKoniec().getNazwa()+"\n"+i.getCzas()+" | "
            +Math.round(i.getOdleglosc()*100.0)/100.0 +"km"+" | cena: "+Math.round(i.getCena()*100.0)/100.0+"\nmiejsc: "+i.getIloscMiejsc()+" | "+ i.getCzestotliwosc()+"\n"+i.getMaszyna().nazwa + "\n");
            iter++;
        }   
    }

    //*Metoda getRezerwacje wypisuje Rezerwacje z bazy danych
    public static void getRezerwacje() {
        int iter=1;
        System.out.println("Lista rezerwacji: ");
        for (Rezerwacja i : Rezerwacje){
            System.out.println(iter+".  "+i);
            iter++;
        }
    }

    //*Metoda getKlienci wypisuje Klientów z bazy danych
    public static void getKlienci() {
        int iter=1;
        System.out.println("Lista klientow: ");
        for (Klient i : Klienci){
            System.out.println(iter+".  "+i.getImie()+" "+ i.getNazwisko()+" PESEL: "+i.getPESEL());
            iter++;
        }
    }

    //*Metoda getPosrednicy wypisuje pośredników z bazy danych
    public static void getPosrednicy() {
        int iter=1;
        System.out.println("Lista posrednikow: ");
        for(Posrednik i : Posrednicy){
            System.out.println(iter+".  "+i.getNazwa());
            iter++;
        }
    }
}
