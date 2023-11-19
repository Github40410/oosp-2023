public class Main {
    public static void main(String[] arg){
        SmartHomeFacade smartHomeFacade = new SmartHomeFacade();

        smartHomeFacade.turnOnLight();
        smartHomeFacade.audioOn();
        smartHomeFacade.setTemperatureSystem(25);
        smartHomeFacade.audioOff();
        smartHomeFacade.turnOffLight();
    }
}
