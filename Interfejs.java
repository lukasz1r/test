public class Interfejs {
    public static void main(String[] args) {
        
        MalySamolot awionetka = new MalySamolot("Awionetka");

        Komendy komenda = new Komendy();
        Lotnisko Warszawa = new Lotnisko("Warszawa", 25, 40);
        Lotnisko Berlin = new Lotnisko("Berlin", 18, 35);
        komenda.baza.Lotniska.add(Warszawa);
        komenda.baza.Lotniska.add(Berlin);
        
    }
}
