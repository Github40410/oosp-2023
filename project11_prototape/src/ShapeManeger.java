import java.util.HashMap;

public class ShapeManeger {
    private HashMap<String, Object> shapeMap;

    public ShapeManeger(){
        shapeMap = new HashMap<>();

        Circle circle = new Circle();
        shapeMap.put(circle.getType(), circle);

        Square square = new Square();
        shapeMap.put(square.getType(), square);
    }

    public Shape getShape(String type) throws CloneNotSupportedException {
        Shape shape = (Shape) shapeMap.get(type);
        if (shape == null) {
            System.out.println("Фигура " + type + " не найдена.");
        }
        return (Shape) shape.clone();
    }
}
