public class SmartPlug implements SmartDivase{
    @Override
    public void turnOn() {
        System.out.println("Умная разетка влючилась");
    }

    @Override
    public void turnOff() {
        System.out.println("Умная разетка выключилась");
    }
}
