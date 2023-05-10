public class TrafficLights {
    private Light redLight;
    private Light yellowLight;
    private Light greenLight;

    public TrafficLights() {
        this.redLight = new Light(true);//应该this嘛？
        this.yellowLight = new Light(false);
        this.greenLight = new Light(false);
    }

    //Method to switch the traffic light
    public void colorsSwitch() {
        if (redLight.isLightOn()) {
            redLight.lightSwitch();
            greenLight.lightSwitch();
        } else if (greenLight.isLightOn()) {
            greenLight.lightSwitch();
            yellowLight.lightSwitch();
        } else if (yellowLight.isLightOn()) {
            yellowLight.lightSwitch();
            redLight.lightSwitch();
        }
    }

    //Method to check if the traffic light is green
    public boolean isGreen() {
        return greenLight.isLightOn();
    }

    //Method to check if the traffic light is yellow
    public boolean isYellow() {
        return yellowLight.isLightOn();
    }

    public boolean isRed() {
        return redLight.isLightOn();
    }
}
