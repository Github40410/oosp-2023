public class Hippopotamus extends Animal{

    public Hippopotamus(String name){
        super(name);
    }

    @Override
    void say() {
        System.out.println(name + ": " + "Я бегемот!");
    }
}
