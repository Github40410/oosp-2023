public class OldDivaseAdapter implements SmartDivase{

    private OldDivase oldDivase;

    public OldDivaseAdapter(OldDivase oldDivase){
        this.oldDivase = oldDivase;
    }

    @Override
    public void turnOn() {
        oldDivase.activate();
    }

    @Override
    public void turnOff() {
        System.out.println("Старое устройство не поддерживает эту функцию!");
    }
}
