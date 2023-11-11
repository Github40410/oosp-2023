public class Lion extends Animal{

    public Lion(String name){
        super(name);
    }

    @Override
    void say() {
        System.out.println(name + ": " + "Я лев!");
    }
}
