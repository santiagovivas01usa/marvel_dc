package abstract_factory_heroes.model.dc;

import abstract_factory_heroes.model.FlyingHero;
import abstract_factory_heroes.model.IFabrica;
import abstract_factory_heroes.model.RichHero;

public class DC implements IFabrica{

    @Override
    public FlyingHero getFlyingHero() {
        return new SuperMan();
    }

    @Override
    public RichHero getRichHero() {
        return new BatMan();
    }
    
}
