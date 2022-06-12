/*
 * <h3>Klasa WielkiSamolot definiuje największą dostępną maszynę.</h3>
 * <p>Parametry</p>
 * <ul>
 *      <li>iloscMiejsc -> Maksymalna ilość miejsc jaką może pomieścić samolot</li>
 *      <li>zasieg -> Maksymalny zasieg jaki samolot może obsłużyć</li>
 *      <li>nazwa -> Nazwa samolotu, który przyjmie paramtery charakteryzujące WielkiSamolot</li>
 * </ul>
 */

public class WielkiSamolot extends Maszyna{
    protected int iloscMiejsc = 400;
    protected int zasieg = 5000;

    WielkiSamolot(String nazwa){
        super.iloscMiejsc=iloscMiejsc;
        super.nazwa=nazwa;
        super.zasieg=zasieg;
    }
}
    