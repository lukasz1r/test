/*
 * <h3>Klasa DuzySamolot definiuje dostępną dużą maszynę.</h3>
 * <p>Parametry</p>
 * <ul>
 *      <li>iloscMiejsc -> Maksymalna ilość miejsc jaką może pomieścić samolot</li>
 *      <li>zasieg -> Maksymalny zasieg jaki samolot może obsłużyć</li>
 *      <li>nazwa -> Nazwa samolotu, który przyjmie paramtery charakteryzujące DuzySamolot</li>
 * </ul>
 */

public class DuzySamolot extends Maszyna{
  
    DuzySamolot(String nazwa){
        super.iloscMiejsc=200;
        super.nazwa=nazwa;
        super.zasieg=4000;
    }
}
    