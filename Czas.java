/**
 * <h3>Klasa Czas definiuje czas wylotu samolotów.</h3>
 * <p>Jej parametry to:</p>
 * <ul>
 *      <li>godzina - godzina wylotu</li>
 *      <li>minuta - minuta wylotu</li>
 * </ul>
 */
//!Konstruktor czasu wylotu
public class Czas {
    private int godzina, minuta;
    Czas(int godzina, int minuta){
        this.godzina=godzina;
        this.minuta=minuta;
    }

    //!Metoda getGodzina zwraca godzinę
    public int getGodzina(){
        return godzina;
    }

    //!Metoda getMinuta zwraca minutę
    public int getMinuta() {
        return minuta;
    }

    //!Metoda toString zwraca parametry czasu
    public String toString(){
        return godzina+":"+minuta;
    }
}   
