package abstract_factory_heroes.model.marvel;

import abstract_factory_heroes.model.RichHero;

public class IronMan implements RichHero{

    @Override
    public void chicanear() {
        System.out.println("Me llamo Tony Stark y la inteligencia es mi superpoder.");
    }
    
}
