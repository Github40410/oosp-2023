public class Triangel extends Shape{

    private double base;
    private double hight;

    public Triangel(double base, double hight){
        this.base = base;
        this.hight = hight;
    }

    @Override
    public double colculateArea() {
        return base*hight*0.5;
    }
}
