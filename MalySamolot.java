/*
 * <h3>Klasa MalySamolot definiuje największą dostępną maszynę.</h3>
 * <p>Parametry</p>
 * <ul>
 *      <li>iloscMiejsc -> Maksymalna ilość miejsc jaką może pomieścić samolot</li>
 *      <li>zasieg -> Maksymalny zasieg jaki samolot może obsłużyć</li>
 *      <li>nazwa -> Nazwa samolotu, który przyjmie paramtery charakteryzujące MalySamolot</li>
 * </ul>
 */

public class MalySamolot extends Maszyna{
    
    protected int iloscMiejsc=20;
    protected int zasieg=500;

    MalySamolot(String nazwa){
        super.iloscMiejsc=iloscMiejsc;
        super.nazwa=nazwa;
        super.zasieg=zasieg;
    }
}