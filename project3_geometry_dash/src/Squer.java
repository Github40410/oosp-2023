public class Squer extends Shape{

    public Squer(DisplayDivase displayDivase){
        super(displayDivase);
    }

    @Override
    public void drow() {
        displayDivase.displayShape("Квадрат");
    }
}
