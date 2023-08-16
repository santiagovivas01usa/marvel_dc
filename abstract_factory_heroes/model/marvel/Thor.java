package abstract_factory_heroes.model.marvel;

import abstract_factory_heroes.model.FlyingHero;

public class Thor implements FlyingHero{

    @Override
    public void volar() {
        System.out.println("Thor se va volando");
    }
    
}
