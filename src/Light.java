public class Light {
    private boolean lightOn; //Using private to access only its own attribute within a class.

    //constructor with a parameter to set the initial state
    public Light(boolean lightOn) {
        this.lightOn = lightOn;
    }

    //Method of pressing the light switch
    public void lightSwitch() {
        this.lightOn = !lightOn;
    }

    //Method to return the current state of light
    public boolean isLightOn() {
        return this.lightOn; //不知道是否需要this
    }
}
