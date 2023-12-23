public class ElonsToyCar {
    private int distance = 0;
    private int battery = 100;

    public int getBattery() {
        return battery;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    public void drive() {
        this.distance += 20;
        this.battery--;
    }
}
