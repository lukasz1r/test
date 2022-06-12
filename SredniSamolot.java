/*
 * <h3>Klasa SredniSamolot definiuje dostępną maszynę średniego rozmiaru.</h3>
 * <p>Parametry</p>
 * <ul>
 *      <li>iloscMiejsc -> Maksymalna ilość miejsc jaką może pomieścić samolot</li>
 *      <li>zasieg -> Maksymalny zasieg jaki samolot może obsłużyć</li>
 *      <li>nazwa -> Nazwa samolotu, który przyjmie paramtery charakteryzujące SredniSamolot</li>
 * </ul>
 */

public class SredniSamolot extends Maszyna{
 
    SredniSamolot(String nazwa){
        super.iloscMiejsc=100;
        super.nazwa=nazwa;
        super.zasieg=3000;
    }
}
    