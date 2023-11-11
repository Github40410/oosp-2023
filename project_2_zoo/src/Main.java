import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){

        ArrayList<Animal> animals = new ArrayList<>();

        AbstractFactoryAnimal lionFactory = new LionFactory();
        AbstractFactoryAnimal hippopotamusFactory = new HippopotamusFactory();
        AbstractFactoryAnimal elephantFactory = new ElephantFactory();

        animals.add(lionFactory.create("Симба"));
        animals.add(lionFactory.create("Муфаса"));
        animals.add(hippopotamusFactory.create("Глория"));
        animals.add(elephantFactory.create("Дамбо"));

        for (Animal animal: animals){
            animal.say();
        }
    }
}
