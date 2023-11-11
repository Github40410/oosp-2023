public class HippopotamusFactory extends AbstractFactoryAnimal{
    @Override
    public Animal create(String name) {
        return new Hippopotamus(name);
    }
}
