/**
 * <h3>Klasa rezerwacja</h3>
 * <p>Zawiera parametry: </p>
 * <ul>
 *      <li>cena - cena rezerwacji</li>
 *      <li>trasa - zarezerwowana trasa</li>
 *      <li>czas - czas wylotu</li>
 * 
 * </ul>
 */

public class Rezerwacja{

    private double cena; 
    private Trasa trasa;
    private Czas czas;

    //!Konstruktor rezerwacji
    Rezerwacja(Trasa trasa){
        this.trasa = trasa;
        this.cena = trasa.getCena();
        this.czas = trasa.getCzas();   
    }

    //!Metoda getTrasa zwraca trasę
    public Trasa getTrasa(){
        for(Trasa i : BazaDanych.Trasy){
            if(i.equals(trasa)) return i;
        }
        return null;
    }
    //!Metoda toString wypisuje paramtery rezerwacji
    public String toString() {
        return trasa + " | " + cena + " | " + czas;
    }
}   