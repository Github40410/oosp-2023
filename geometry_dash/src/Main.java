public class Main {
    public static void main(String[] args) {
        Shape triangel = FactoruShape.createShape("triangle", 5, 6);
        Shape rectangle = FactoruShape.createShape("rectangle", 19, 345);
        Shape circle = FactoruShape.createShape("circle", 66);

        System.out.println("Площадь треуглдьника: " + triangel.colculateArea());
        System.out.println("Площадь прямоугольника: " + rectangle.colculateArea());
        System.out.println("Площадь круга: " + circle.colculateArea());
    }
}
