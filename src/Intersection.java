public class Intersection {
    private TrafficLights light1;
    private TrafficLights light2;
    private TrafficLights light3;

    public Intersection() {
        this.light1 = new TrafficLights();
        this.light2 = new TrafficLights();
        this.light3 = new TrafficLights();
        //The first two traffic lights changed from red to green
        this.light1.colorsSwitch();
        this.light2.colorsSwitch();
    }

    //Method for switching traffic lights: The current green -> yellow, yellow -> red ,red -> green
    public void trafficColorsSwitch() {
        this.light1.colorsSwitch();
        this.light2.colorsSwitch();
        this.light3.colorsSwitch();

        /**
         * // Check if there are no yellow lights now
         * and if there are no yellow lights,switch the original red lights to green
         * And if this method is called enough times, all traffic lights will turn green at least once
         */
        if (!light1.isYellow() && !light2.isYellow() && !light3.isYellow()) {
            if (light1.isRed()) {
                light1.colorsSwitch();
            } else if (light2.isRed()) {
                light2.colorsSwitch();
            } else if (light3.isRed()) {
                light3.colorsSwitch();
            }
        }

    }


    // Method to check if it is safe to cross (green traffic light)
    public boolean isSafeToCross(int trafficLightNumber) {
        if (trafficLightNumber == 1) {
            return light1.isGreen();
        } else if (trafficLightNumber == 2) {
            return light2.isGreen();
        } else if (trafficLightNumber == 3) {
            return light3.isGreen();
        } else {
            return false;
        }
    }
}
