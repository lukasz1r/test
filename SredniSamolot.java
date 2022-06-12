/*
 * <h3>Klasa SredniSamolot definiuje największą dostępną maszynę.</h3>
 * <p>Parametry</p>
 * <ul>
 *      <li>iloscMiejsc -> Maksymalna ilość miejsc jaką może pomieścić samolot</li>
 *      <li>zasieg -> Maksymalny zasieg jaki samolot może obsłużyć</li>
 *      <li>nazwa -> Nazwa samolotu, który przyjmie paramtery charakteryzujące SredniSamolot</li>
 * </ul>
 */

public class SredniSamolot extends Maszyna{
    protected int iloscMiejsc = 100;
    protected int zasieg = 3000;

    SredniSamolot(String nazwa){
        super.iloscMiejsc=iloscMiejsc;
        super.nazwa=nazwa;
        super.zasieg=zasieg;
    }
}
    