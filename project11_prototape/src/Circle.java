public class Circle extends Shape{

    public Circle(){
        type = "Круг";
    }

    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }
}
