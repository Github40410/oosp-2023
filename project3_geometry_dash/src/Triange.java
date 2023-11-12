public class Triange extends Shape{

    public Triange(DisplayDivase displayDivase){
        super(displayDivase);
    }

    @Override
    public void drow() {
        displayDivase.displayShape("Треугольник");
    }
}
