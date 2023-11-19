public class Main {
    public static void main(String[] arg){
        ShapeManeger shapeManeger = new ShapeManeger();


        Shape circle = null;
        try {
            circle = shapeManeger.getShape("Круг");
            circle.draw();
        } catch (CloneNotSupportedException e) {
            System.out.println("Ошибка");
        }


        Shape square = null;
        try {
            square = shapeManeger.getShape("Квадрат");
            square.draw();
        } catch (CloneNotSupportedException e) {
            System.out.println("Ошибка");
        }

    }
}
