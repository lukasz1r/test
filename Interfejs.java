public class Interfejs {
    public static void main(String[] args) {
        
        

        Komendy komenda = new Komendy();
        Lotnisko Warszawa = new Lotnisko("Warszawa", 25, 40);
        Lotnisko Berlin = new Lotnisko("Berlin", 18, 35);
        komenda.baza.Lotniska.add(Warszawa);
        komenda.baza.Lotniska.add(Berlin);
        
        komenda.dodajSamolot();
        komenda.dodajSamolot();
        komenda.dodajSamolot();
        System.out.println(komenda.baza.Maszyny); 
        // System.out.println(komenda.baza.Maszyny); 
        komenda.baza.getSamoloty();
        // komenda.usunSamolot();
        
        komenda.baza.getSamoloty();
        
    }
}
