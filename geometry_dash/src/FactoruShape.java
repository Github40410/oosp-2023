import java.util.Scanner;

public class FactoruShape {
    public static Shape createShape(String s, double... param){
        switch (s){
            case "circle":
                if(param.length == 1)
                    return new Circle(param[0]);
                break;
            case "rectangle":
                if (param.length==2)
                    return new Rectangle(param[0], param[1]);
                break;
            case "triangle":
                if (param.length==2)
                    return new Triangel(param[0], param[1]);
                break;
        }
        return null;
    }
}
