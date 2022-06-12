/*
 * <h3>Klasa Lotnisko obsługuje tworzenie i zarządzanie lotniskami.</h3>
 * <p>Jej paramtery to:</p>
 * <ul>
 *      <li>nazwa - nazwa miasta w jakim znajduje się lotnisko</li>
 *      <li>x - przybliżona współrzędna X lotniska</li>
 *      <li>y - przybliżona współrzędna Y lotniska</li>
 * </ul>
 */

public class Lotnisko{
    

    private String nazwa;
    private int x, y;

    //Konstruktor Lotniska
    Lotnisko(String nazwa, int x, int y){
        this.nazwa = nazwa;
        this.x = x;
        this.y = y;
    }

    //Metoda getNazwa wypisuje nazwę lotniska
    public String getNazwa(){
        return nazwa;
    }

    //Metoda getX wypisuje współrzędną X lotniska
    public int getX(){
        return x;
    }

    //Metoda getY wypisuje współrzędną Y lotniska
    public int getY() {
        return y;
    }   

    //Metoda toString wypisuje parametry lotniska
    public String toString(){
        return nazwa + " | " + x + " | " + y ;
    }
}
    