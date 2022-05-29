public class Interfejs {
    public static void main(String[] args) {
        
        Lotnisko Warszawa = new Lotnisko("Warszawa", 30, 20);
        // System.out.println(Warszawa.getX());
        System.out.println(Warszawa.getNazwa() + " " + Warszawa.getX()+ " " + Warszawa.getY());

        MalySamolot awionetka = new MalySamolot("Awionetka");
        System.out.println(awionetka.zasieg);
        
        
    }
}
