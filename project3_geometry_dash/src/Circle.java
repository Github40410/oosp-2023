public class Circle extends Shape{

    public Circle(DisplayDivase displayDivase){
        super(displayDivase);
    }

    @Override
    public void drow() {
        displayDivase.displayShape("Круг");
    }
}
