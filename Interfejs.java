public class Interfejs {
    public static void main(String[] args) {
        Lotnisko Warszawa = new Lotnisko("Warszawa", 25, 40);
        Lotnisko Berlin = new Lotnisko("Berlin", 18, 35);
        BazaDanych.Lotniska.add(Warszawa);
        BazaDanych.Lotniska.add(Berlin);    
        //Komendy.dodajSamolot();
        // Komendy.dodajSamolot();
        // System.out.println(BazaDanych.Maszyny);
        Komendy.dodajTrase();
        //System.out.println(BazaDanych.Trasy);
        // Posrednik xd = new Posrednik(null);
        // xd.rezerwujBilety();
        Komendy.usunTrase();
        System.out.println(BazaDanych.Trasy);
        
    }
}