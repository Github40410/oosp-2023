public class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double colculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}
