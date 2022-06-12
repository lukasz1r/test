/*
 * <h3>Klasa DuzySamolot definiuje największą dostępną maszynę.</h3>
 * <p>Parametry</p>
 * <ul>
 *      <li>iloscMiejsc -> Maksymalna ilość miejsc jaką może pomieścić samolot</li>
 *      <li>zasieg -> Maksymalny zasieg jaki samolot może obsłużyć</li>
 *      <li>nazwa -> Nazwa samolotu, który przyjmie paramtery charakteryzujące DuzySamolot</li>
 * </ul>
 */

public class DuzySamolot extends Maszyna{
    protected int iloscMiejsc = 200;
    protected int zasieg = 4000;

    DuzySamolot(String nazwa){
        super.iloscMiejsc=iloscMiejsc;
        super.nazwa=nazwa;
        super.zasieg=zasieg;
    }
}
    