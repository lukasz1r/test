/**
 * <h3>Klasa MalySamolot definiuje najmniejszą dostępną maszynę.</h3>
 * <p>Parametry</p>
 * <ul>
 *      <li>iloscMiejsc -> Maksymalna ilość miejsc jaką może pomieścić samolot</li>
 *      <li>zasieg -> Maksymalny zasieg jaki samolot może obsłużyć</li>
 *      <li>nazwa -> Nazwa samolotu, który przyjmie paramtery charakteryzujące MalySamolot</li>
 * </ul>
 */

public class MalySamolot extends Maszyna{
    
    MalySamolot(String nazwa){
        super.iloscMiejsc=20;
        super.nazwa=nazwa;
        super.zasieg=500;
    }
}