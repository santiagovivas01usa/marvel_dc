package abstract_factory_heroes.model.dc;

import abstract_factory_heroes.model.RichHero;

public class BatMan implements RichHero{

    @Override
    public void chicanear() {
        System.out.println("Soy Batman.");
    }
    
}
