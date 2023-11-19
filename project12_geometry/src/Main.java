public class Main {
    public static void main(String[] arg){
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        CompositeGrafic compositeGrafic = new CompositeGrafic();
        compositeGrafic.add(circle);
        compositeGrafic.add(square);

        CompositeGrafic compositeGrafic1 = new CompositeGrafic();
        compositeGrafic1.add(triangle);
        compositeGrafic.add(compositeGrafic1);

        compositeGrafic.draw();
    }
}
