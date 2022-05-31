public class Interfejs {
    public static void main(String[] args) {
        Komendy komenda = new Komendy();
        Lotnisko Warszawa = new Lotnisko("Warszawa", 25, 40);
        Lotnisko Berlin = new Lotnisko("Berlin", 18, 35);
        komenda.baza.Lotniska.add(Warszawa);
        komenda.baza.Lotniska.add(Berlin);
        Trasa chuj = new Trasa(Warszawa,Berlin,1,new Czas(10,30));
        System.out.println(chuj.getOdleglosc());
        
        komenda.dodajSamolot();
        komenda.dodajSamolot();
        komenda.dodajSamolot();
        komenda.baza.getSamoloty();
        komenda.usunSamolot();
        komenda.usunSamolot();
        komenda.baza.getSamoloty();
        
    }
}
