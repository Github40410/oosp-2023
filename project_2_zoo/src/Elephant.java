public class Elephant extends Animal{

    public Elephant(String name){
        super(name);
    }

    @Override
    void say() {
        System.out.println(name + ": " + "Я слон!");
    }
}
