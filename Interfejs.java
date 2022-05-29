public class Interfejs {
    public static void main(String[] args) {
        
        Lotnisko Warszawa = new Lotnisko("Warszawa", 25, 40);
        Lotnisko Berlin = new Lotnisko("Berlin", 18, 35);

        
        System.out.println(Warszawa.getNazwa() + " " + Warszawa.getX()+ " " + Warszawa.getY());

        MalySamolot awionetka = new MalySamolot("Awionetka");
        System.out.println(awionetka.zasieg);
        Komendy komenda = new Komendy();
        komenda.dodajLotnisko();   
        komenda.dodajLotnisko();   
        System.out.println(komenda.baza.Lotniska);     
    }
}
