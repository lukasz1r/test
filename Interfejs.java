public class Interfejs {
    public static void main(String[] args) {
        Lotnisko Warszawa = new Lotnisko("Warszawa", 25, 40);
        Lotnisko Berlin = new Lotnisko("Berlin", 18, 35);
        BazaDanych.Lotniska.add(Warszawa);
        BazaDanych.Lotniska.add(Berlin);    
        // komenda.dodajSamolot();
        // komenda.dodajSamolot();
        // komenda.dodajSamolot();
        // komenda.baza.getSamoloty();
        // komenda.usunSamolot();
        // komenda.usunSamolot();
        // komenda.baza.getSamoloty();
        Komendy.dodajTrase();
        System.out.println(BazaDanych.Trasy);
        Posrednik xd = new Posrednik(null);
        xd.rezerwujBilety();
    }
}
