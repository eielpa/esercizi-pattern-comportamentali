public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn= new LightOn(light);
        Command lightOff= new LightOff(light);
        Command fanOn= new FanOn(fan);
        Command fanOff= new FanOff(fan);

        Remote remote = new Remote();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(fanOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.setCommand(fanOff);
        remote.pressButton();

    }
}