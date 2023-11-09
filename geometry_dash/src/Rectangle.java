public class Rectangle extends Shape{

    private double widht;
    private double hight;

    public Rectangle(double widht, double hight){
        this.widht = widht;
        this.hight = hight;
    }

    @Override
    public double colculateArea() {
        return widht*hight;
    }
}
