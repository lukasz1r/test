/*
 * <h3>Klasa Maszyna jest klasą abstrakcyjną, z której dziedziczą klasy samolotów.</h3>
 * <p>Usprawnia ona zarządzanie samolotami</p>
 */
public abstract class Maszyna {
    
    protected int iloscMiejsc, zasieg;
    protected String nazwa;

    //Metoda getMiejsca zwraca ilość miejsc jaką mięści maszyna
    public int getMiejsca(){
        return iloscMiejsc;
    }

    //Metoda getZasieg zwraca zasięg maszyny
    public int getZasieg(){
        return zasieg;
    }

    //Metoda getNazwa zwraca nazwę maszyny
    public String getNazwa(){
        return nazwa;
    }
}
