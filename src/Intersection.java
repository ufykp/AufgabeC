public class Intersection {
    private TrafficLights light1;
    private  TrafficLights light2;
    private  TrafficLights light3;

    public Intersection() {
        this.light1 = new TrafficLights();
        this.light2 = new TrafficLights();
        this.light3 = new TrafficLights();
        //The first two traffic lights changed from red to green
        this.light1.colorsSwitch();
        this.light2.colorsSwitch();
    }

    //// Method for switching traffic lights
    public void trafficColorsSwitch() {
        this.light1.colorsSwitch();
        this.light2.colorsSwitch();
        this.light3.colorsSwitch(); //要this，嘛？

        /**
         * // Check if there are no yellow lights now
         * and if there are no yellow lights,switch the original red lights to green
         */
        if(!light1.isYellow() && !light2.isYellow() && !light3.isYellow()) {
            if(light1.isRed()) {
                light1.colorsSwitch();
            } else if (light2.isRed()) {
                light2.colorsSwitch();
            } else if (light3.isRed()) {
                light3.colorsSwitch();
            }
        }

        //Check if all traffic lights were green once
        if (!light1.isGreen() && !light2.isGreen() && !light3.isGreen()) {
            light1.colorsSwitch();
            light2.colorsSwitch();
            light3.colorsSwitch();
            //Switch all traffic lights from red to green
        }
    }

    //Method to check if it is safe to cross (green traffic light)
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
