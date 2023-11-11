public class ElephantFactory extends AbstractFactoryAnimal{
    @Override
    public Animal create(String name) {
        return new Elephant(name);
    }
}
