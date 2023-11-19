import java.util.ArrayList;
import java.util.List;

public class CompositeGrafic implements Grafic{
    private List<Grafic> grafics = new ArrayList<>();

    public void add(Grafic graphic) {
        grafics.add(graphic);
    }

    public void remove(Grafic graphic) {
        grafics.remove(graphic);
    }

    @Override
    public void draw() {
        for (Grafic graphic : grafics) {
            graphic.draw();
        }
    }
}
