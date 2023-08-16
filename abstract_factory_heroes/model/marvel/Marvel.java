package abstract_factory_heroes.model.marvel;

import abstract_factory_heroes.model.FlyingHero;
import abstract_factory_heroes.model.IFabrica;
import abstract_factory_heroes.model.RichHero;

public class Marvel implements IFabrica {

    @Override
    public FlyingHero getFlyingHero() {
        return new Thor();
    }

    @Override
    public RichHero getRichHero() {
        return new IronMan();
    }
    
}
