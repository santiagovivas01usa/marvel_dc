package abstract_factory_heroes.model;

public interface IFabrica {
    public FlyingHero getFlyingHero();
    public RichHero getRichHero();
}
