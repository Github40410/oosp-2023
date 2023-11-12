public class Main {
    public static void main(String[] arg){

        DisplayDivase monitor = new Monitor();
        DisplayDivase plotter = new Plotter();
        DisplayDivase printer = new Printer();

        Shape triange = new Triange(plotter);
        triange.drow();

        Shape circle = new Circle(printer);
        circle.drow();

        Shape squer = new Squer(monitor);
        squer.drow();
    }
}
