public abstract class Animal {

    public String name;

    public Animal(String name){
        this.name = name;
    }

    private String getName() {
        return name;
    }

    abstract void say();
}
