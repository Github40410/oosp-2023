public class SmartHomeFacade {
    private Light light;
    private Audio audio;
    private Temperature temperature;

    public SmartHomeFacade(){
        this.light = new Light();
        this.temperature = new Temperature();
        this.audio = new Audio();
    }

    public void turnOnLight(){
        this.light.turnOn();
    }

    public void turnOffLight(){
        this.light.turnOff();
    }

    public void audioOn(){
        this.audio.audioOn();
    }

    public void audioOff(){
        this.audio.audioOff();
    }

    public void setTemperatureSystem(double d){
        this.temperature.setTemperature(d);
    }
}
