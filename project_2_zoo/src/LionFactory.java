public class LionFactory extends AbstractFactoryAnimal{
    @Override
    public Animal create(String name) {
        return new Lion(name);
    }
}
