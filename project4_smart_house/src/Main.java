public class Main {
    public static void main(String[] arg){
        SmartPlug smartPlug = new SmartPlug();

        smartPlug.turnOn();
        smartPlug.turnOff();

        OldDivase oldDivase = new OldDivase();

        OldDivaseAdapter oldDivaseAdapter = new OldDivaseAdapter(oldDivase);
        oldDivaseAdapter.turnOn();
        oldDivaseAdapter.turnOff();
    }
}
