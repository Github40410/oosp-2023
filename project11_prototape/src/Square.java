public class Square extends Shape{

    public Square(){
        type = "Квадрат";
    }

    @Override
    public void draw() {
        System.out.println("Рисую квадрат");
    }
}
