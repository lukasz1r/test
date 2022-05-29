public class Interfejs {
    public static void main(String[] args) {
        
        Lotnisko Warszawa = new Lotnisko("Warszawa", 30, 20);
        System.out.println(Warszawa.getX());
        System.out.println(Warszawa.getNazwa() + " " + Warszawa.getX()+ " " + Warszawa.getY());

        MalySamolot awionetka = new MalySamolot("Awionetka", 300, 4000);
        // System.out.println(awionetka.nazwa);
        System.out.println(awionetka.getMiejsca());
        
    }
}
