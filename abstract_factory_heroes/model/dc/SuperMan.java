package abstract_factory_heroes.model.dc;

import abstract_factory_heroes.model.FlyingHero;

public class SuperMan implements FlyingHero{

    @Override
    public void volar() {
        System.out.println("estoy volandooooo.");
    }
    
}
